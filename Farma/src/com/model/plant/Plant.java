package com.model.plant;

public abstract class Plant {
public String name;
public String plantColor;
public double hight;
public String poisonous;

public Plant(String name, String plantColor, double hight, String poisonous) {
	super();
	this.name = name;
	this.plantColor = plantColor;
	this.hight = hight;
	this.poisonous = poisonous;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getPlantColor() {
	return plantColor;
}



public void setPlantColor(String plantColor) {
	this.plantColor = plantColor;
}



public double getHight() {
	return hight;
}



public void setHight(double hight) {
	this.hight = hight;
}



public String getPoisonous() {
	return poisonous;
}



public void setPoisonous(String poisonous) {
	this.poisonous = poisonous;
}



public void enterPlants() {
	
}

public void showPlants(){
	
}

}
