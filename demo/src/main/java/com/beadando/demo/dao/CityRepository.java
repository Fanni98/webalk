package com.beadando.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beadando.demo.model.City;


public interface CityRepository extends JpaRepository<City, Integer> {

	List<City> findAll();
}
