package com.traveltour.place.model;

import org.apache.commons.lang3.tuple.Pair;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Place {
	

    @Id
    public String id;

    public String name;
    public String description;
    public PlaceDetails details;

    public Place(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Place(String name, String description, List<Pair<String, String>> fields) {
        this.name = name;
        this.description = description;
        this.details = new PlaceDetails(fields);
    }

    @Override
    public String toString() {
        return String.format(
                "Place[id=%s, name='%s', description='%s', details='%s']",
                id, name, description, details);
    }
}