package com.thomaslhomme.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@RequiredArgsConstructor
public class Store<T extends Product> {

	private long id;
	
	private List<T> items = new ArrayList<T>();
	
	@NonNull
	private String name;
	
	public void add(T item) {
		this.items.add(item);
	}
	
}