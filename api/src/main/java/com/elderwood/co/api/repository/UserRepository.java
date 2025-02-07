package com.elderwood.co.api.repository;

import org.springframework.stereotype.Repository;

import com.elderwood.co.api.model.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface UserRepository extends JpaRepository<user,Long>{
    
    Optional<user> findByUsername(String username);
}
