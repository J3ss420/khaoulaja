

package com.traveltour.place.service;

import org.apache.commons.lang3.tuple.Pair;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class WikipediaService {
    public List<Pair<String, String>> getPlaceDetails(String name){
        return getFields(extractData(name).toString());
    }

    private Document extractData(String name) {
        String wikipedia = "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&rvprop=content&titles=";
        Document doc = null;
        try {
            doc = Jsoup.connect(wikipedia + name).ignoreContentType(true).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return doc;
    }

    //TODO - refactor this.
    private List<Pair<String, String>> getFields(String content){
        List<Pair<String, String>> fields = new ArrayList<>();
        String start = "<h2>";
        String end = "</h2>";

        String[] sections = content.split(start);
        for (String section : sections){
            String[] _section = section.split(end);
            if(_section.length == 2){
                if(_section[1].contains("<h3>")){
                    fields.add(Pair.of(getTitle(_section[0]), ""));
                    fields.addAll(getSubfields(_section[1]));
                }
                else
                    fields.add(Pair.of(getTitle(_section[0]), _section[1]));
            }
        }

        return fields;
    }

    //TODO - refactor this.
    private List<Pair<String, String>> getSubfields(String content){
        List<Pair<String, String>> fields = new ArrayList<>();
        String start = "<h3>";
        String end = "</h3>";

        String[] sections = content.split(start);
        for (String section : sections){
            String[] _section = section.split(end);
            if(_section.length == 2){
                fields.add(Pair.of(getTitle(_section[0]), _section[1]));
            }
        }

        return fields;
    }

    private String getTitle(String section){
        String start = ">";
        String end = "</span>";
        return section.substring(section.indexOf(start)+1, section.indexOf(end));
    }
}
