package com.elderwood.co.api.repository;


import java.util.Date;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elderwood.co.api.model.reservations;

@Repository
public interface ReservationsRepository extends JpaRepository<reservations, Long>{

    @Query(value = "Select r from reservations r join r.table t where t.id = ?1")
    Set<reservations> findByTableIdAndDate(long id, String date);
    
    
}
