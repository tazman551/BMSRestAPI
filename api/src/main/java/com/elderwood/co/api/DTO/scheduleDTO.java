package com.elderwood.co.api.DTO;

import java.util.Set;

import com.elderwood.co.api.model.*;

public class scheduleDTO {

    
    tables table;
    Set<daysofweek> schedule;
    Set<reservations> res;
    
    public scheduleDTO(tables t, Set<daysofweek> dow, Set<reservations> res) {
        this.table = t;
        this.schedule = dow;
        this.res = res;
    }

}
