
package com.traveltour.place.service;

import com.traveltour.place.model.Place;

import java.util.List;

public interface PlaceService {

    Place getPlaceByName(String name);

    List<Place> getAllPlaces();

}
