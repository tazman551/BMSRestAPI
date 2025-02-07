package com.elderwood.co.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elderwood.co.api.model.tables;

@Repository
public interface TableRepository extends JpaRepository<tables, Long> {
    
    
    // Using native SQL
    @Query(value = "SELECT * FROM tables", nativeQuery = true)
    List<tables> getTables();


}

