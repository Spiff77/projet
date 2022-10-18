package com.singleton.printer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Computer {

	@NonNull
	String name;
	PrinterCentralizer pc;
	
	public void print(String text) {

		pc.print(text, this);
	}

}
