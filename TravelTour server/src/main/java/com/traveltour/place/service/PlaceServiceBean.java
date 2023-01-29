

package com.traveltour.place.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traveltour.place.model.Place;
import com.traveltour.place.db.PlaceRepository;

import java.util.List;

@Service
public class PlaceServiceBean implements PlaceService {

    @Autowired
    private PlaceRepository repository;

    @Autowired
    private WikipediaService wikipediaService;

    public Place getPlaceByName(String name){
        Place place = repository.getPlaceByName(name);
        if(place == null){
            return createPlace(name);
        }
        return place;
    }

    public List<Place> getAllPlaces(){
        return repository.findAll();
    }

    private void demo(){
        repository.deleteAll();

        // save a couple of places
        repository.save(new Place("Dallas", "Dallas is pretty big", null));
        repository.save(new Place("Dallas, Texas", "Dallas is pretty big", null));
        repository.save(new Place("New York", "The big apple", null));
    }

    private Place createPlace(String name){
        Place newPlace = new Place(name, "", wikipediaService.getPlaceDetails(name));
        repository.save(newPlace);
        return newPlace;
    }
}
