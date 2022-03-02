package com.qa.springduck.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "duck")
public class Duck {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull(message = "Please enter a name")
	private String name;

	@Min(0)
	@Max(20)
	private int age;

	@Column
	private int price;

	@Column
	private boolean inStock;

	public Duck() {
		super();
	}

	public Duck(int id, String name, int age, int price, boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.price = price;
		this.inStock = inStock;
	}

	public Duck(String name, int age, int price, boolean inStock) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.inStock = inStock;
	}

}
