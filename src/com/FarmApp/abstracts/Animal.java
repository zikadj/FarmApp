package com.FarmApp.abstracts;

import java.util.Scanner;

public abstract class Animal {

	protected String type;
	protected String name;
	protected int age;
	protected String healthStatus;
	protected String race;

	public Animal(String type, String name, int age, String healthStatus, String race) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.healthStatus = healthStatus;
		this.race = race;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void enterAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter information about animal:");
		System.out.print("Enter animal type:");
		type = sc.next();
		System.out.print("Enter animal name:");
		name = sc.next();
		System.out.print("Enter animal age:");
		age = sc.nextInt();
		System.out.print("Health status:");
		healthStatus = sc.next();
		System.out.print("Race:");
		race = sc.next();

	}

	public void showAnimal() {
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getType());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Health status:" + getHealthStatus());
		System.out.println("Race:" + getRace());

	}

	public String ageAnimal() {
		if (age <= 5) {
			return getType() + " is young";
		} else {
			return getType() + " is old";
		}

	}

	public abstract void move();
}