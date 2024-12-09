package com.model.plant;

import java.util.Scanner;

public class Strawberry extends Plant {
	public String type;
	public double amountSugar;
	
	public Strawberry(String name, String plantColor, double hight, String poisonous, String type, double amountSugar) {
		super(name, plantColor, hight, poisonous);
		this.type = type;
		this.amountSugar = amountSugar;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmountSugar() {
		return amountSugar;
	}

	public void setAmountSugar(double amountSugar) {
		this.amountSugar = amountSugar;
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
		System.out.print("Amount sugar");
		amountSugar = sc.nextDouble();
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
		System.out.println("Amount sugar:" + getAmountSugar() );
		System.out.println("Type:" + getType() );
	}
}
