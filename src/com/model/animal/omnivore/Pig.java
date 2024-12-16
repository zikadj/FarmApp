package com.model.animal.omnivore;

import com.FarmApp.abstracts.Animal;

public class Pig extends Animal {

	private double weight;

	public Pig(String type, String name, int age, String healthStatus, String race, double weight) {
		super(type, name, age, healthStatus, race);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
