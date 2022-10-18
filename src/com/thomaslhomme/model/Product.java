package com.thomaslhomme.model;

import lombok.Getter;

public abstract class Product {

	private static int count;

	@Getter
	private int id;

	public Product() {
		this.id = ++count;
	}
	

}
