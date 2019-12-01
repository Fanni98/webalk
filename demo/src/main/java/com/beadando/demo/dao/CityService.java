package com.beadando.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.beadando.demo.model.City;

public class CityService implements ICityService {

	@Autowired
	private CityRepository repository;
	

	@Override
	public List<City> findAll() {

		return (List<City>) repository.findAll();

	}
	
	

}
