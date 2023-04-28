package com.ak.zomato.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ak.zomato.entity.Zomato;

public interface ZomatoRepo extends JpaRepository<Zomato, Integer> {

	
	Zomato findByItem(String item);

}
