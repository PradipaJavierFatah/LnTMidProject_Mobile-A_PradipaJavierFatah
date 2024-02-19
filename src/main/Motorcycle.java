package main;

public class Motorcycle extends Vehicle {
	int Wheel;
	String Motortype;
	int Helm;
	int Price;
	public Motorcycle(String type, String brand, String name, String license, int topspeed, int gascap, int wheel, String motortype, int helm, int price) {
		super(type, brand, name, license, topspeed, gascap);
		this.Wheel = wheel;
		this.Motortype = motortype;
		this.Helm = helm;
		this.Price = price;
	}
	public void Motoroutput() {
		System.out.println(Name + "is standing!");
	}
	public void motorprice() {
		System.out.println("Price : " + Price);
	}
	
}
