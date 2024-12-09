package com.model.plant;

import java.util.Scanner;

public class Apple extends Plant{
 
private double calories;
private String taste;


public Apple(String name, String plantColor, double hight, String poisonous, Double calories, String taste) {
	super(name, plantColor, hight, poisonous);
	this.calories = calories;
	this.taste = taste;
}

public double getCalories() {
	return calories;
}
public void setCalories(Double calories) {
	this.calories = calories;
}
public String getTaste() {
	return taste;
}
public void setTaste(String taste) {
	this.taste = taste;
}

public void enterPlant() {
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
	System.out.print("Taste plant:");
	taste = sc.next();
}
public void showPlant() {
	System.out.println("Show information about plant:");
	System.out.println("Name planet:" + getName());
	System.out.println("Color planet:" + getPlantColor());
	System.out.println("Hight planet:" + getHight());
	System.out.println("Poisonous:" + getPoisonous() );
	System.out.println("Calories:" + getCalories() );
	System.out.println("Taste:" + getTaste() );
}


}
