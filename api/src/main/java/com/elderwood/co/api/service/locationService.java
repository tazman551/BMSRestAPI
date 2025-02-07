package com.elderwood.co.api.service;

import java.rmi.registry.LocateRegistry;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elderwood.co.api.model.location;
import com.elderwood.co.api.repository.LocationRepository;

@Service
public class locationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<location> getAllLocations() {
     return locationRepository.findAll();
    }


    
}
