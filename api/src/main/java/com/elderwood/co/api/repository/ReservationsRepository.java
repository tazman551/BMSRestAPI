package com.elderwood.co.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elderwood.co.api.model.reservations;

@Repository
public interface ReservationsRepository extends JpaRepository<reservations, Long>{
    
    
}
