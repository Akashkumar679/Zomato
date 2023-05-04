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
	/*
	 *save Items OneByOne  
	 */
	public Zomato saveItem(Zomato zomato) {
		return repo.save(zomato);
	}
	/*
	 * save Multiple items at OneTime
	 */
	public List<Zomato> saveItems(List<Zomato> zomatos){
		return repo.saveAll(zomatos);
	}
	/*
	 * Get all items Stored in database
	 */
	public List<Zomato> getItemsList() {
		return repo.findAll();
	}
	/*
	 * find items using by IdNumber 
	 */
	public Zomato ItemgetById(int id) {
		return repo.findById(id).orElse(null);
	}
	/*
	 * find items using by itemName
	 */
	public Zomato ItemgetByItem(String item) {
		return repo.findByItem(item);
	}
	/*
	 * delete items using by idNumber
	 */
	public String deleteitemById(int id) {
		repo.deleteById(id);
		return "product removed !"+id;
	}
	/*
	 * update item get the  existingItem modify item
	 */
	public Zomato updateItem(Zomato zomato) {
		Zomato existingItem=repo.findById(zomato.getId()).orElse(null);
		existingItem.setItem(zomato.getItem());
		existingItem.setLocation(zomato.getLocation());
		existingItem.setPrice(zomato.getPrice());
		return repo.save(existingItem);
	}
}
