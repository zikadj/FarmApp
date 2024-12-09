package com.model.person;

import java.util.Scanner;

public class Owner extends Person{
	public int pib;
	public int numberTel;
	public double objectValue;
	public int yearOfAcquisition;
	public Adress adr;
	public Owner(String firstName, String lastName, int age, int pib, int numberTel, double objectValue,
			int yearOfAcquisition, Adress adr) {
		super(firstName, lastName, age);
		this.pib = pib;
		this.numberTel = numberTel;
		this.objectValue = objectValue;
		this.yearOfAcquisition = yearOfAcquisition;
		this.adr = adr;
	}
	public int getPib() {
		return pib;
	}
	public void setPib(int pib) {
		this.pib = pib;
	}
	public int getNumberTel() {
		return numberTel;
	}
	public void setNumberTel(int numberTel) {
		this.numberTel = numberTel;
	}
	public double getObjectValue() {
		return objectValue;
	}
	public void setObjectValue(double objectValue) {
		this.objectValue = objectValue;
	}
	public int getYearOfAcquisition() {
		return yearOfAcquisition;
	}
	public void setYearOfAcquisition(int yearOfAcquisition) {
		this.yearOfAcquisition = yearOfAcquisition;
	}
	public Adress getAdr() {
		return adr;
	}
	public void setAdr(Adress adr) {
		this.adr = adr;
	}
	
	@Override
	public void enterPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the person information:");
		System.out.print("Enter first name:");
		firstName = sc.next();
		System.out.print("Enter last name:");
		lastName = sc.next();
		System.out.print("Enter age:");
		age = sc.nextInt();
		System.out.print("Enter adress:");
		adr.enterAdres();
	}
	@Override
	public void showPerson() {
		System.out.println("Show person inforamtion:");
		System.out.println("First name:" + getFirstName());
		System.out.println("Last name:" + getLastName());
		System.out.println("Age:" + getAge());
		adr.showAdres();
	}

}
