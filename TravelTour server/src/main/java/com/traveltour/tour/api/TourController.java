

package com.traveltour.tour.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TourController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}