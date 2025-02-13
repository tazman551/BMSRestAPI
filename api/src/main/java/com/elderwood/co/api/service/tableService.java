package com.elderwood.co.api.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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



    public reservations postTableReservation(String entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postTableReservation'");
    }



    public Set<tables> getTableByLocationName(String locationName, String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date javaDate = dateFormat.parse(date);
        logger.info(javaDate.toString());
        return tableRepository.findByLocName(locationName);
    }

   
}
