package com.ak.zomato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ak.zomato.entity.Zomato;
import com.ak.zomato.service.ZomatoService;

@RestController
public class ZomatoController {

	@Autowired
	private ZomatoService service;
	
	@PostMapping("/addItem")
	public Zomato addItem(@RequestBody Zomato zomato) {
		return service.saveItem(zomato);
	}
	
	@PostMapping("/addItems")
	public List<Zomato> addItems(@RequestBody List<Zomato> zomatos){
		return service.saveItems(zomatos);
	}
	
	@GetMapping("/ItemfindById/{id}")
	public Zomato ItemfindById(@PathVariable int id) {
		return service.ItemgetById(id);
	}
	
	@GetMapping("/ItemfindbyName/{name}")
	public Zomato findByItem(String item) {
		return service.ItemgetByItem(item);
	}
}
