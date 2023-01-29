package com.traveltour.place.api;

import com.traveltour.place.model.Place;
import com.traveltour.place.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/api/place")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @RequestMapping(value="/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Place> getPlacesByName() {
        Place location = placeService.getPlaceByName("London");
        return new ResponseEntity<>(location, HttpStatus.OK);
    }

    @RequestMapping(value="/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Place>> getAllPlaces() {
        Collection<Place> nearbyPlaces = placeService.getAllPlaces();
        return new ResponseEntity<>(nearbyPlaces, HttpStatus.OK);
    }
}
