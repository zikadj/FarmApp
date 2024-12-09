package com.model.plant;

import java.util.Scanner;

public class Tomatoes extends Plant{
	public String type;
	public String origin;
	public String growthType;
	
	public Tomatoes(String name, String plantColor, double hight, String poisonous, String type, String origin,
			String growthType) {
		super(name, plantColor, hight, poisonous);
		this.type = type;
		this.origin = origin;
		this.growthType = growthType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getGrowthType() {
		return growthType;
	}

	public void setGrowthType(String growthType) {
		this.growthType = growthType;
	}
	
	@Override
	public void enterPlants() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter information about plant:");
		System.out.print("Enter plant name:");
		name = sc.next();
		System.out.print("Enter color plant:");
		plantColor = sc.next();
		System.out.print("Enter hight plant:");
		hight = sc.nextDouble();
		System.out.print("Poisonous plant:");
		poisonous = sc.next();
		System.out.print("Type plant:");
		type = sc.next();
		System.out.print("Origin plant:");
		origin = sc.next();
		System.out.print("Grow type plant:");
		origin = sc.next();
	}

	@Override
	public void showPlants() {
		System.out.println("Show information about plant:");
		System.out.println("Name planet:" + getName());
		System.out.println("Color planet:" + getPlantColor());
		System.out.println("Hight planet:" + getHight());
		System.out.println("Poisonous:" + getPoisonous() );
		System.out.println("Type:" + getType() );
		System.out.println("Origin:" + getOrigin() );
		System.out.println("Growth type:" + getGrowthType() );
	}
}
