package com.sofkat.api.repositories;

import com.sofkat.api.models.pregunta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("preguntaRepository")
public interface preguntaRepository extends JpaRepository<pregunta, Long> {
    @Query(value = "SELECT * FROM pregunta p WHERE p.level = :level ORDER BY rand() LIMIT 1", nativeQuery = true)
    public pregunta getQuestion(String level);
}
