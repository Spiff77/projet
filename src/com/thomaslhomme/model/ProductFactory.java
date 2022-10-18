package com.thomaslhomme.model;

public class ProductFactory {
	
	
	public Product create(ProductType type, boolean parameter) {
		return (type==ProductType.MEDIA) ?  
				new Media(parameter) : 
				new Furniture(parameter);
	}

}
