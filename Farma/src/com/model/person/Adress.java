package com.model.person;

import java.util.Scanner;

public class Adress {
public String district;
public String city;
public String street;
public int houseNuber;
public Adress(String district, String city, String street, int houseNuber) {
	super();
	this.district = district;
	this.city = city;
	this.street = street;
	this.houseNuber = houseNuber;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getHouseNuber() {
	return houseNuber;
}
public void setHouseNuber(int houseNuber) {
	this.houseNuber = houseNuber;
}

public void enterAdres() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter owner adress");
	System.out.print("Enter district:");
	district = sc.next();
	System.out.print("Enter city:");
	city = sc.next();
	System.out.print("Enter street:");
	street = sc.next();
	System.out.print("Enter house number:");
	houseNuber = sc.nextInt();
}

public void showAdres() {
	System.out.println("Show owner adress");
	System.out.print("District:" + getDistrict());
	System.out.print("City:" + getCity());
	System.out.print("Street:" + getStreet());
	System.out.print("House number:" + getHouseNuber());

}

}
