package com.ak.zomato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/items")
	public List<Zomato> findAllItems() {
		return service.getItemsList();
	}
	
	@GetMapping("/ItemfindById/{id}")
	public Zomato findItemById(@PathVariable int id) {
		return service.ItemgetById(id);
	}
	
	@GetMapping("/ItemfindbyName/{item}")
	public Zomato findByItem(String item) {
		return service.ItemgetByItem(item);
	}
	 
	@PutMapping("/update")
	public Zomato updateItem(@RequestBody Zomato zomato) {
		return service.updateItem(zomato);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteItem(@PathVariable int id) {
		return service.deleteitemById(id);
	}
}
