package com.ak.zomato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.zomato.entity.Zomato;
import com.ak.zomato.reposetry.ZomatoRepo;

@Service
public class ZomatoService {

	@Autowired
	private ZomatoRepo repo;
	
	public Zomato saveItem(Zomato zomato) {
		return repo.save(zomato);
	}
	
	public List<Zomato> saveItems(List<Zomato> zomatos){
		return repo.saveAll(zomatos);
	}
	
	public Zomato ItemgetById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public Zomato ItemgetByItem(String item) {
		return repo.findByItem(item);
	}
}
