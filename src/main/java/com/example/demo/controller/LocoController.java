package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Location;
import com.example.demo.repo.LocationRepo;

@RestController
@RequestMapping("/test")
public class LocoController {
	
	@Autowired
	private LocationRepo repo;
	
	@GetMapping
	public List<Location> showAll(){
		return repo.findAll();
		
	}
	
	@PostMapping
	public Location addNew(@RequestBody Location loco){
		return repo.save(loco);
		
	}

}
