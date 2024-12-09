package com.model.animal;

import java.util.Scanner;

public class Goat extends Animal{
	private double dailiYieldMilk;
	private double weight;
	
	public Goat(String type, String name, int age, String helthStatus, String race, double dailiYieldMilk,
			double weight) {
		super(type, name, age, helthStatus, race);
		this.dailiYieldMilk = dailiYieldMilk;
		this.weight = weight;
	}

	public double getDailiYieldMilk() {
		return dailiYieldMilk;
	}

	public void setDailiYieldMilk(double dailiYieldMilk) {
		this.dailiYieldMilk = dailiYieldMilk;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public void enterAnimal() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter information about animal:");
			System.out.print("Enter animal type:");
			type = sc.next();
			System.out.print("Enter animal name:");
			name = sc.next();
			System.out.print("Enter animal age:");
			age = sc.nextInt();
			System.out.print("Helth status:");
			helthStatus = sc.next();
			System.out.print("Race:");
			race = sc.next();
			System.out.print("Daily yield milk:");
			dailiYieldMilk = sc.nextDouble();
			System.out.print("Weight:");
			weight = sc.nextDouble();
	}
	
	@Override
	public void showAnimal() {
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getType());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Helth status:" + getHelthStatus() );
		System.out.println("Race:" + getRace() );
		System.out.println("Daily yield milk:" + getDailiYieldMilk() );
		System.out.println("Weight:" + getWeight() );
	}
	
	@Override
	public String ageAninamal() {
		if(age <= 2) {
			return  getType() + " is young";	
		}else {
			return getType() + " is old";
		}
	}
	
}
