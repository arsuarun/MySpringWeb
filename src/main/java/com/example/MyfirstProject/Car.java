package com.example.MyfirstProject;

public class Car {
	
	private int id;
	private int price;
	private String name;
	private String color;
	private String model;
	private boolean isWarranty;
	
	
	public Car(int id, int price, String name, String color, String model, boolean isWarranty) {
		
		this.id = id;
		this.price = price;
		this.name = name;
		this.color = color;
		this.model = model;
		this.isWarranty = isWarranty;
	}


	@Override
	public String toString() {
		return "id=" + id + ", price=" + price + ", name=" + name + ", color=" + color + ", model=" + model
				+ ", isWarranty=" + isWarranty;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public boolean isWarranty() {
		return isWarranty;
	}


	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	
	
	
	

}
