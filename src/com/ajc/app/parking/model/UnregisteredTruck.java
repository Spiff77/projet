package com.ajc.app.parking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public final class UnregisteredTruck extends Truck implements TollGatePayable{
	public UnregisteredTruck(String brand, String plate) {
		super(brand, plate);
	}

	@Override
	public int payTollGate() {
		return 5;
	}
}
