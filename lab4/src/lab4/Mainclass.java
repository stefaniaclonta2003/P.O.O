package lab4;

import java.awt.Color;

public class Mainclass {


	public static void main(String[] args) {
		Sofer soferul = new Sofer("Stefi", 20, 123);
		Rezervor reze = new Rezervor(200, 120);
		Autovehicul auto = new Autovehicul(soferul, reze, "Ford", 120, 200, 5, 2, Color.magenta);
		
		
		System.out.println(auto);
		auto.accelerare(20);
		System.out.println(auto);
		
		auto.decelerare(100);
		System.out.println(auto);
		
		auto.schimbareTrepte(2);
		System.out.println(auto);
		
		auto.accelerare(500);
		System.out.println(auto);
		
		auto.decelerare(400);
		System.out.println(auto);
		
		auto.schimbareTrepte(-6);
		System.out.println(auto);
		
		
		
	}

}
