package com.ak.zomato.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "Zomato_Order")
@Entity
public class Zomato {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "order_id")
	private int id;
	
	@Column(name = "item")
	private String item;
	
	@Column(name = "address")
	private String location;
	
	@Column(name = "price")
	private int price;
	
}
