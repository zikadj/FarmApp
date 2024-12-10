package com.model.plant;

import java.util.Scanner;

public class Potateous extends Plant {
private double calories;
private String type;

public Potateous(String name, String plantColor, double hight, String poisonous, double calories, String type) {
	super(name, plantColor, hight, poisonous);
	this.calories = calories;
	this.type = type;
}

public double getCalories() {
	return calories;
}

public void setCalories(double calories) {
	this.calories = calories;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
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
	System.out.print("Calories plant:");
	calories = sc.nextDouble();
	System.out.print("Type plant:");
	type = sc.next();
	}
@Override
	public void showPlants() {
	System.out.println("Show information about plant:");
	System.out.println("Name planet:" + getName());
	System.out.println("Color planet:" + getPlantColor());
	System.out.println("Hight planet:" + getHight());
	System.out.println("Poisonous:" + getPoisonous() );
	System.out.println("Calories:" + getCalories() );
	System.out.println("Type:" + getType() );
	}

}
