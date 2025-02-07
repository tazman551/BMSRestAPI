package com.elderwood.co.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.elderwood.co.api.model.reservations;
import com.elderwood.co.api.model.tableDTO;
import com.elderwood.co.api.model.tables;
import com.elderwood.co.api.service.tableService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
//@RequestMapping("/api/table")
public class TableController {


    @Autowired
    tableService tService;

    @GetMapping("/api/tables")
    public List<tables> getAllTables() {
        return tService.getTables();
    }
    

    /*
     * Post Methods
     */
    @PostMapping("reserve/table")
    public reservations postMethodName(@RequestBody String entity) {
        return tService.postTableReservation(entity);
        
    }
    
}