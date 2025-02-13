package com.elderwood.co.api.service;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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



    public reservations postTableReservation(String entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postTableReservation'");
    }



    public Set<scheduleDTO> getTableByLocationName(String locationName, String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date javaDate = new Date(dateFormat.parse(date).getTime());

        logger.info("Input date: " +javaDate.toString());

        Set<scheduleDTO> sDTO = Collections.<scheduleDTO>emptySet();
        //Get all tables
        Set<tables> tables = tableRepository.findByLocName(locationName);
        //Get all reservations for the tables
        for(tables T: tables){
            //sDTO.add(new scheduleDTO(T,T.getDow(),resRepository.findByTableIdAndDate(T.getId(),javaDate.toString())));
            logger.info(String.valueOf(T.getId()));
            logger.info(resRepository.findByTableIdAndDate(T.getId(),javaDate.toString()).iterator().next().getDate().toString());
        }
        return sDTO;
    }

   
}
