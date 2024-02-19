package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Car> Carlist = new ArrayList<>();
	ArrayList<Motorcycle> motorlist = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	String type = "";
	void Input () {
		
		String brand = "";
		String name = "";
		String license = "";
		int topspeed;
		int gascap;
		int wheel;
		int entsys;
		int helm;
		String cartype = "";
		String motortype = "";
		int price;
		do {
			System.out.println("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
		}while(!(type.equals("Car") || type.equals("Motorcycle")));
		
		do {
			System.out.println("Input brand [>= 5]: ");
			brand = scan.nextLine();
		}while(brand.length()< 5);
		
		do {
			System.out.println("Input name [>=5]: ");
			name = scan.nextLine();
		}while(name.length() < 5);
		
		do {
			System.out.println("input license: ");
			license = scan.nextLine();
		}while(!license.matches("[A-Z]\\s[0-9]{1,4}\\s[A-Z]{1,3}"));
		
		do {
			System.out.println("Input top Speed [100 <= topSpeed <= 250]: ");
			topspeed = scan.nextInt();scan.nextLine();
		}while(topspeed < 100 || topspeed > 250);
		
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
			gascap = scan.nextInt();scan.nextLine();
		}while(gascap < 30 || gascap > 60);
		
		switch (type) {
		case "Car":
			do {
				System.out.println("Input wheel [4 <= wheel <= 6]: ");
				wheel = scan.nextInt();scan.nextLine();
			}while(wheel < 4 || wheel > 6);
			
			do {
				System.out.println("Input type [SUV | Supercar | Minivan]: ");
				cartype = scan.nextLine();
			}while(!(cartype.equals("SUV") || cartype.equals("Supercar") || cartype.equals("Minivan")));
			
			do {
				System.out.println("Input entertainment system amount [>=1]: ");
				entsys = scan.nextInt();scan.nextLine();
			}while(entsys < 1);
			
			Car Car = new Car(cartype, brand, name, license, topspeed, gascap, wheel, cartype, entsys);
			Carlist.add(Car);
			
			switch (cartype) {
			case "SUV":
				Car.caroutput();
				break;

			case "Supercar":
				Car.caroutput();
				Car.supercaroutput();
				break;
			
			case "Minivan":
				Car.caroutput();
				break;
			}
			
			break;
		case "Motorcycle":
			do {
				System.out.println("Input wheel [2 <= wheel <= 3]: ");
				wheel = scan.nextInt();scan.nextLine();
			}while(wheel < 2 || wheel > 3);
			
			do {
				System.out.println("Input type [Automatic | Manual]: ");
				motortype = scan.nextLine();
			}while(!(motortype.equals("Automatic") || motortype.equals("Manual")));
			
			do {
				System.out.println("Input entertainment helm amount [>=1]: ");
				helm = scan.nextInt();scan.nextLine();
			}while(helm < 1);
			
			do {
				System.out.println("Input Price: ");
				price = scan.nextInt();scan.nextLine();
			}while(price < 1);
			Motorcycle Motorcycle = new Motorcycle(motortype, brand, name, license, topspeed, gascap, wheel, motortype, helm, price);
			motorlist.add(Motorcycle);
			
			Motorcycle.Motoroutput();
			Motorcycle.motorprice();
			break;
		}
	
	}
	
	void View () {
		if (Carlist.isEmpty() && motorlist.isEmpty()) {
			System.out.printf("|%-10s |%-10s |%-10s |\n", 
					"No", "Type", "Name");
		} else {
			
		
		switch (type) {
		case "Car":
			
				System.out.printf("|%-10s |%-10s |%-10s |\n", 
						"No","Type", "Name");
				for (int i = 0; i < Carlist.size(); i++) {
					System.out.printf("|%-10s |%-10s |%-10s |\n",
						i+1,Carlist.get(i).Cartype, Carlist.get(i).Name);			
				}
			break;

		case "Motorcycle":
			
				System.out.printf("|%-10s |%-10s |%-10s |\n", 
						"No","Type", "Name");
				for (int i = 0; i < motorlist.size(); i++) {
					System.out.printf("|%-10s |%-10s |%-10s |\n",
						i+1,motorlist.get(i).Motortype, motorlist.get(i).Name);			
				}	
			break;
		}
		}
	}
	
	public Main() {
		int pilih=0;
		
		do {
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Exit");
			System.out.println("Pilihan : ");
			pilih = scan.nextInt();scan.nextLine();
			
			switch (pilih) {
			case 1:
				Input();
				break;
			case 2:
				View();
				break;
			}
		}while(pilih!=3);
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
