package com.singleton.printer;

import java.util.ArrayList;
import java.util.List;

public class PrinterCentralizer {
	
	private List<Printer> printers = new ArrayList<Printer>();
	
	private static PrinterCentralizer INSTANCE;
	
	private int count;
	
	private PrinterCentralizer() {}
	
	public static PrinterCentralizer getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PrinterCentralizer();
		}
		return INSTANCE;
	}
	
	public void add(Printer printer) {
		this.printers.add(printer);
	}
	
	public void print(String text, Computer c) {
		if(count == this.printers.size()) {
			count = 0;
		}
		this.printers.get(count++).print(text + " Computer: " + c.getName());
	}
	
	public static void closeCentralizer() {
		INSTANCE = null;
	}
}
