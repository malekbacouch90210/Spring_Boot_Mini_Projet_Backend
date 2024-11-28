package com.malek.manga.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.malek.manga.entities.Demographie;
import com.malek.manga.repos.DemographieRepository;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class DemographieRESTcontroller {
	@Autowired
	DemographieRepository demographieRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Demographie> getAllCategories()
	{
		return demographieRepository.findAll();
	}
	

}
