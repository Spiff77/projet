package com.singleton.printer;

public class Test {

	public static void main(String[] args) {
		Printer p1 = new Printer("Canon");
		Printer p2 = new Printer("Epson");
		Printer p3 = new Printer("PB");
		
		Computer c1 = new Computer("CPU1");
		Computer c2 = new Computer("CPU2");
		
		PrinterCentralizer.getInstance().add(p1);
		PrinterCentralizer.getInstance().add(p2);
		PrinterCentralizer.getInstance().add(p3);
		
		
		c1.print("toto");
		c1.print("toto");
		c2.print("toto");
		c1.print("toto");
		c1.print("toto");
		c1.print("toto");
		c2.print("toto");
		c1.print("toto");
	}

}
