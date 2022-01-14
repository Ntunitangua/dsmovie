package com.nrp.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nrp.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long>{

}
