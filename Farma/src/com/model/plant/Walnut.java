package com.model.plant;

import java.util.Scanner;

public class Walnut extends Plant {
	private int lifetimeTree;
	private String use;
	
	public Walnut(String name, String plantColor, double hight, String poisonous, int lifetimeTree, String use) {
		super(name, plantColor, hight, poisonous);
		this.lifetimeTree = lifetimeTree;
		this.use = use;
	}

	public int getLifetimeTree() {
		return lifetimeTree;
	}

	public void setLifetimeTree(int lifetimeTree) {
		this.lifetimeTree = lifetimeTree;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
	
	@Override
	public void enterPlants() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter information about walnut:");
		System.out.print("Enter plant name:");
		name = sc.next();
		System.out.print("Enter color plant:");
		plantColor = sc.next();
		System.out.print("Enter hight plant:");
		hight = sc.nextDouble();
		System.out.print("Poisonous plant:");
		poisonous = sc.next();
		System.out.print("Lifetame plant:");
		lifetimeTree = sc.nextInt();
		System.out.print("Use plant:");
		use = sc.next();
	}
	
	@Override
	public void showPlants() {
		System.out.println("Show information about wanlut:");
		System.out.println("Name planet:" + getName());
		System.out.println("Color planet:" + getPlantColor());
		System.out.println("Hight planet:" + getHight());
		System.out.println("Poisonous:" + getPoisonous() );
		System.out.println("Lifetame:" + getLifetimeTree() );
		System.out.println("Use:" + getUse() );
	}

}
