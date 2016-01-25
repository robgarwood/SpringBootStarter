package com.garwood.SpringBootTest.model;

public class Cheese {
	
	private int size;
	private String colour;
	private String taste;
	
	public Cheese() {
		size = 2;
		colour = "yellow";
		taste = "cheesey";
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

}
