package com.model.animal;

import java.util.Scanner;

public class Cow extends Animal{
private double dailiYieldMilk;
private String vaccinated;

public Cow(String type, String name, int age, String helthStatus, String race, double dailiYieldMilk,
		String vaccinated) {
	super(type, name, age, helthStatus, race);
	this.dailiYieldMilk = dailiYieldMilk;
	this.vaccinated = vaccinated;
}

public double getDailiYieldMilk() {
	return dailiYieldMilk;
}

public void setDailiYieldMilk(double dailiYieldMilk) {
	this.dailiYieldMilk = dailiYieldMilk;
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
	System.out.print("Helth status:");
	helthStatus = sc.next();
	System.out.print("Race:");
	race = sc.next();
	System.out.print("Daily yield milk:");
	dailiYieldMilk = sc.nextDouble();
	System.out.print("Vaccinated:");
	vaccinated = sc.next();
	
	
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
	System.out.println("Vaccinated:" + getVaccinated() );

	
	
	}

@Override
	public String ageAninamal() {
	if(age <= 3) {
		return  getType() + " is young";	
	}else {
		return getType() + " is old";
	}
	}

}
