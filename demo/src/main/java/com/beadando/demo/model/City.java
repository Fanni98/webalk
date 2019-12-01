package com.beadando.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City {
	
	@Column(name ="id")
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

	@Column(name = "name")
    private String name;
	@Column(name ="population")
    private int population;

    public City() {
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Id: " + id + " Város: " + name + " Népesség: " + population;
	}


   
}
