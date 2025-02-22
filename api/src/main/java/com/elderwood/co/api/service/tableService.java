package com.elderwood.co.api.service;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elderwood.co.api.DTO.scheduleDTO;
import com.elderwood.co.api.model.reservations;
import com.elderwood.co.api.model.tables;
import com.elderwood.co.api.repository.ReservationsRepository;
import com.elderwood.co.api.repository.TableRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class tableService {
    

    private static final Logger logger = LoggerFactory.getLogger(tableService.class);
    
    @Autowired
    private TableRepository tableRepository;
    
    @Autowired
    private ReservationsRepository resRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public List<tables> getTables() {
        return tableRepository.getTables();
    }

    @SuppressWarnings("unused")
    public Set<Object> getResforTable(String tableID, String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date sqlDate = new Date(dateFormat.parse(date).getTime());
        if(sqlDate == null){
            throw new NullPointerException("Date can't be null");
        }
        return resRepository.findBytableIdAndResDate(tableID, sqlDate);
    }

    public reservations postTableReservation(String entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postTableReservation'");
    }



    public Set<tables> getTableByLocationName(String locationName) throws ParseException {
      
        return tableRepository.findByLocName(locationName);

    }



   
}
