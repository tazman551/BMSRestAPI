package com.elderwood.co.api.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elderwood.co.api.model.location;
import com.elderwood.co.api.model.reservations;
import com.elderwood.co.api.model.tables;
import com.elderwood.co.api.repository.ReservationsRepository;
import com.elderwood.co.api.repository.TableRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class tableService {
    

    @Autowired
    private TableRepository tableRepository;
    
    @Autowired
    private ReservationsRepository resRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public List<tables> getTables() {
        return tableRepository.getTables();
    }



    public reservations postTableReservation(String entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postTableReservation'");
    }



    public Set<tables> getTableByLocationName(String locationName, String date) {
        return tableRepository.findByLocName(locationName);
    }

   
}
