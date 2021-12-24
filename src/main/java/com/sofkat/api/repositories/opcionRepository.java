package com.sofkat.api.repositories;

import com.sofkat.api.models.opcion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("opcionRepository")
public interface opcionRepository extends JpaRepository<opcion, Long> {
    
}
