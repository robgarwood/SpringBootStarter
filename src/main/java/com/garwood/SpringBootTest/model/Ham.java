package com.garwood.SpringBootTest.model;

public class Ham {
	private int size;
	private String colour;
	private String taste;
	
	public Ham() {
		size = 4;
		colour = "pink";
		taste = "hammy";
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
