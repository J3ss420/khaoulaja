package com.traveltour.place.model;

import org.apache.commons.lang3.tuple.Pair;
import org.springframework.data.annotation.Id;

import java.util.List;


public class PlaceDetails {

    public List<Pair<String, String>> fields;

    public PlaceDetails( List<Pair<String, String>> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return String.format(
                "PlaceDetails[fields='%s']",
                fields);
    }
}