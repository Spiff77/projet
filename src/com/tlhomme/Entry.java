package com.tlhomme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ajc.app.parking.model.Hotel;
import com.thomaslhomme.model.Furniture;
import com.thomaslhomme.model.Media;
import com.thomaslhomme.model.Product;
import com.thomaslhomme.model.ProductFactory;
import com.thomaslhomme.model.ProductType;
import com.thomaslhomme.model.Store;

public class Entry {

	public static void main(String[] args) {
		
		ProductFactory pf = new ProductFactory();
		
		Product p1 = pf.create(ProductType.MEDIA, false);
		Product p2 = pf.create(ProductType.FURNITURE, true);
		
		System.out.println(p1.getId());
		
		System.out.println("C'était une \"bonne\" soirée"); // C'était une "bonne" soirée
	}
	
}
