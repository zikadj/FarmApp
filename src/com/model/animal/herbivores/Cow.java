package com.model.animal.herbivores;

import java.util.Scanner;

import com.FarmApp.abstracts.Animal;

public class Cow extends Animal {

	private double dailyMilkYield;
	private String vaccinated;

	public Cow(String type, String name, int age, String helthStatus, String race, double dailyMilkYield,
			String vaccinated) {
		super(type, name, age, helthStatus, race);
		this.dailyMilkYield = dailyMilkYield;
		this.vaccinated = vaccinated;
	}

	public double getDailyMilkYield() {
		return dailyMilkYield;
	}

	public void setDailyMilkYield(double dailyMilkYield) {
		this.dailyMilkYield = dailyMilkYield;
	}

	public String getVaccinated() {
		return vaccinated;
	}

	public void setVaccinated(String vaccinated) {
		this.vaccinated = vaccinated;
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
		System.out.print("Health status:");
		healthStatus = sc.next();
		System.out.print("Race:");
		race = sc.next();
		System.out.print("Daily yield milk:");
		dailyMilkYield = sc.nextDouble();
		System.out.print("Vaccinated:");
		vaccinated = sc.next();

	}

	@Override
	public void showAnimal() {
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getType());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Health status:" + getHealthStatus());
		System.out.println("Race:" + getRace());
		System.out.println("Daily yield milk:" + getDailyMilkYield());
		System.out.println("Vaccinated:" + getVaccinated());

	}

	@Override
	public String ageAnimal() {
		if (age <= 3) {
			return getType() + " is young";
		} else {
			return getType() + " is old";
		}
	}

	@Override
	public void move() {
		System.out.print("Cow is wolking.");

	}

}
