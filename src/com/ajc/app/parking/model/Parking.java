package com.ajc.app.parking.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Parking{

	private List<Vehicle> vehicles = new ArrayList<>();
	
	@NonNull
	private String code;
	@NonNull
	private String name;
	
	public int calculTotalPrice() {
		
		return vehicles.stream()
			.filter(v -> v instanceof TollGatePayable)
			.mapToInt(v -> ((TollGatePayable)v).payTollGate())
			.sum();
	}
	
	public void add(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public Parking(@NonNull String code, @NonNull String name) {
		this.code = code;
		this.name = name;
	}

}
