package com.thomaslhomme.model;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data @ToString(callSuper = true)
public class Car {
	
	@Getter
	private static int count;

	private int id;
	
	private String brand;

	public Car(String brand) {
		this.brand = brand;
		this.id = ++count;
	}
	
}