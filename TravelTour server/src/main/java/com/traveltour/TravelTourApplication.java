package com.traveltour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TravelTourApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TravelTourApplication.class, args);
    }
}
