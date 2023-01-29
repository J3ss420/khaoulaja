package com.traveltour.place.db;


import com.traveltour.place.model.Place;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PlaceRepository extends MongoRepository<Place, String>{

    List<Place> getPlacesByName(String name);

    Place getPlaceByName(String name);

}
