package com.madak.Hibernate_Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fruits {

	@Id
	private int id;
	private String name;
	private String location;
	private String test;
	private int price;
	
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruits [id=" + id + ", name=" + name + ", location=" + location + ", test=" + test + ", price=" + price
				+ "]";
	}
}
