package com.nrp.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nrp.dsmovie.entities.Score;
import com.nrp.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score,ScorePK>{

}
