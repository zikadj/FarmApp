package com.model.person;

import java.util.Scanner;

public class Worker extends Person{

private int cardNumber;
private int numberTel;
private String position;
private double salary;
private int lengthOfService;

public Worker(String firstName, String lastName, int age, int cardNumber, int numberTel, String position, double salary,
		int lengthOfService) {
	super(firstName, lastName, age);
	this.cardNumber = cardNumber;
	this.numberTel = numberTel;
	this.position = position;
	this.salary = salary;
	this.lengthOfService = lengthOfService;
}

public int getCardNumber() {
	return cardNumber;
}

public void setCardNumber(int cardNumber) {
	this.cardNumber = cardNumber;
}

public int getNumberTel() {
	return numberTel;
}

public void setNumberTel(int numberTel) {
	this.numberTel = numberTel;
}

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getLengthOfService() {
	return lengthOfService;
}

public void setLengthOfService(int lengthOfService) {
	this.lengthOfService = lengthOfService;
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
System.out.print("Card number:");
cardNumber = sc.nextInt();
System.out.print("Enter telephon number:");
numberTel = sc.nextInt();
System.out.print("Position:");
position = sc.next();
System.out.print("Selary:");
salary = sc.nextDouble();
System.out.print("Enter lenght of service:");
lengthOfService = sc.nextInt();

}
@Override
public void showPerson() {
System.out.println("Show person inforamtion:");
System.out.println("First name:" + getFirstName());
System.out.println("Last name:" + getLastName());
System.out.println("Age:" + getAge());
System.out.println("Card number:" + getCardNumber());
System.out.println("Telephon number:" + getNumberTel());
System.out.println("Position:" + getPosition());
System.out.println("Selary:" + getSalary());
System.out.println("Lenght of service:" + getLengthOfService());
}
}


 