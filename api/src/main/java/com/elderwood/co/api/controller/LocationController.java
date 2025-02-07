package com.elderwood.co.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elderwood.co.api.DTO.locationDTO;
import com.elderwood.co.api.model.location;
import com.elderwood.co.api.service.locationService;

@RestController
public class LocationController {

    private locationService locationService;
    LocationController(locationService locationService){
        this.locationService = locationService;
    }

    @GetMapping("/api/locations")
    public List<locationDTO> getAllLocations() {
        List<location> list = locationService.getAllLocations();
        List<locationDTO> locationDTOs = new ArrayList<locationDTO>();;
        list.forEach( loc ->
            locationDTOs.add(new locationDTO(loc.getLoc_name(), loc.getAddress()))
        );

        return locationDTOs;
    }
}
