package com.singleton.printer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Printer {

	String name;
	
	public void print(String text) {
		System.out.println(this.name + ":" + text);
	}

}
