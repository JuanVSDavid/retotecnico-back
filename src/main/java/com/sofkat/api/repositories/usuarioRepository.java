package com.sofkat.api.repositories;

import com.sofkat.api.models.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usuarioRepository")
public interface usuarioRepository  extends JpaRepository<usuario, Long>{
    
}
