package com.ajc.app.parking.model;

import lombok.Getter;

@Getter
public class Hotel {
	
	private static Hotel INSTANCE;
	
	private int nbClient = 0;

	private Hotel() {

	}
	
	public static Hotel getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Hotel();
		}
		return INSTANCE;
	}
	
	public void addClient(int number) {
		this.nbClient += number;
	}

}
