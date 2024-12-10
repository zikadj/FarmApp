package com.model.animal;

import java.util.Scanner;

public class Hours extends Animal{
	public String endurance;
	public double speed;
	public double weight;
	public double haight;
	
	public Hours(String type, String name, int age, String helthStatus, String race, String endurance, double speed,
			double weight, double haight) {
		super(type, name, age, helthStatus, race);
		this.endurance = endurance;
		this.speed = speed;
		this.weight = weight;
		this.haight = haight;
	}

	public String getEndurance() {
		return endurance;
	}

	public void setEndurance(String endurance) {
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

	public double getHaight() {
		return haight;
	}

	public void setHaight(double haight) {
		this.haight = haight;
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
		System.out.print("Endurence:");
		endurance = sc.next();
		System.out.print("Speed:");
		speed = sc.nextDouble();
		System.out.print("Weight:");
		weight = sc.nextDouble();
		System.out.print("Haight:");
		haight = sc.nextDouble();
			
		}
	
	
	@Override
	public void showAnimal() {
		System.out.println("Show information about animal:");
		System.out.println("Animal type:" + getType());
		System.out.println("Animal name:" + getName());
		System.out.println("Animal age:" + getAge());
		System.out.println("Helth status:" + getHelthStatus() );
		System.out.println("Race:" + getRace() );
		System.out.println("Endurence:" + getEndurance() );
		System.out.println("Speed:" + getSpeed() );
		System.out.println("Weight:" + getWeight() );
		System.out.println("Haight:" + getHaight() );

	}
	
	@Override
	public String ageAninamal() {
		if(age <= 4) {
			return  getType() + " is young";	
		}else {
			return getType() + " is old";
		}
		
	}
	}
	
	
	


