package com.beadando.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.beadando.demo.dao.CityRepository;
import com.beadando.demo.dao.CityService;
import com.beadando.demo.model.City;

@Controller
public class MyController {

	@Autowired
	CityRepository repository;

	@RequestMapping("/city")
	public String city() {
		return "cities.jsp";
	}

	@RequestMapping("/regist")
	public String regist() {
		return "regist.jsp";
	}

	@RequestMapping("/addCity")
	public String addCity(City city) {
		repository.save(city);
		return "cities.jsp";
	}

	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam int id) {
		ModelAndView mv = new ModelAndView("search.jsp");
		City city = repository.findById(id).orElse(new City());
		mv.addObject(city);

		return mv;
	}

	@GetMapping("/showCities")
	public String findCities(Model model) {

		model.addAttribute("cities", getCities());

		return "show.jsp";
	}

	public List<City> getCities() {
		List<City> cities = repository.findAll();
		return cities;
	}

}
