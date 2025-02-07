package com.elderwood.co.api.model;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class reservations {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private tables table;
    @ManyToOne
    private user user;
    private Timestamp created;
    private Date Date;
    private Time timeslot;
    private boolean reserved;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public tables getTable() {
        return table;
    }
    public void setTable(tables table) {
        this.table = table;
    }
    public user getUser() {
        return user;
    }
    public void setUser(user user) {
        this.user = user;
    }
    public Timestamp getCreated() {
        return created;
    }
    public void setCreated(Timestamp created) {
        this.created = created;
    }
    public Date getDate() {
        return Date;
    }
    public void setDate(Date date) {
        Date = date;
    }
    public Time getTimeslot() {
        return timeslot;
    }
    public void setTimeslot(Time timeslot) {
        this.timeslot = timeslot;
    }
    public boolean isReserved() {
        return reserved;
    }
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    
    

    
}
