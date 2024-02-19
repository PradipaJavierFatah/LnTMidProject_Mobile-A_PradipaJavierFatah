package main;

public class Car extends Vehicle {
	int Wheel;
	String Cartype;
	int Entsys;
	public Car(String type, String brand, String name, String license, int topspeed, int gascap, int wheel, String cartype, int entsys) {
		super(type, brand, name, license, topspeed, gascap);
		this.Wheel = wheel;
		this.Cartype = cartype;
		this.Entsys = entsys;
	}
	public void caroutput() {
		System.out.println("Turning on entertainment system…");
	}
	public void supercaroutput() {
		System.out.println("Boosting!");
	}
}
