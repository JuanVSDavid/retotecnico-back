package com.sofkat.api.repositories;

import java.util.List;

import com.sofkat.api.models.score;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("scoreRepository")
public interface scoreRepository extends JpaRepository<score, Long>{
    @Query(value= "SELECT * FROM score ORDER BY scorea LIMIT 10", nativeQuery = true)
    public List<score> queryScore();
}
