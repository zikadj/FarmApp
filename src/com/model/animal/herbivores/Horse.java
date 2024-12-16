package com.model.animal.herbivores;

import java.util.Scanner;

import com.FarmApp.abstracts.Animal;
import com.FarmApp.interfaces.Gallop;

public class Horse extends Animal implements Gallop {

	public double endurance;
	public double speed;
	public double weight;
	public double height;

	public Horse(String species, String name, int age, String healthStatus, String breed, double endurance,
			double speed, double weight, double height) {
		super(species, name, age, healthStatus, breed);
		this.endurance = endurance;
		this.speed = speed;
		this.weight = weight;
		this.height = height;
	}

	public double getEndurance() {
		return endurance;
	}

	public void setEndurance(double endurance) {
		this.endurance = endurance;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void move() {
		System.out.print("Horse is move elegance.");
	}

	@Override
	public void enterAnimal() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter information about animal:");
			System.out.print("Enter animal type:");
			species = sc.next();
			System.out.print("Enter animal name:");
			name = sc.next();
			System.out.print("Enter animal age:");
			age = sc.nextInt();
			System.out.print("Health status:");
			healthStatus = sc.next();
			System.out.print("Race:");
			breed = sc.next();
			System.out.print("Endurence:");
			endurance = sc.nextDouble();
			System.out.print("Speed:");
			speed = sc.nextDouble();
			System.out.print("Weight:");
			weight = sc.nextDouble();
			System.out.print("Height:");
			height = sc.nextDouble();
		} catch (Exception e) {
			System.out.print("Incorrect input, try again");
		}
	}

	@Override
	public void showAnimal() {
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getSpecies());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Health status:" + getHealthStatus());
		System.out.println("Race:" + getBreed());
		System.out.println("Endurence:" + getEndurance());
		System.out.println("Speed:" + getSpeed());
		System.out.println("Weight:" + getWeight());
		System.out.println("Height:" + getHeight());

	}

	@Override
	public String ageAnimal() {
		if (age <= 4) {
			return getSpecies() + " is young";
		} else {
			return getSpecies() + " is old";
		}

	}

	@Override
	public void gallop() {
		System.out.print("Horse gallop on speed" + speed + "km/h");

	}

	@Override
	public double currentSpeed() {
		return speed;
	}

	@Override
	public double maxDistance() {
		return endurance;
	}

}
