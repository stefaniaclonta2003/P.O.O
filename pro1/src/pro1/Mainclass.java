package pro1;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int InputValue = input.nextInt();
		
		System.out.println("Valoarea citita de la tastatura este: " + InputValue);

		int maxInt = Integer.MAX_VALUE;
		/*	System.out.println(maxInt + 1);
	
		/*int minInt = Integer.MIN_VALUE;
		System.out.println(minInt - 1);
		
		float maxFloat = Double.MAX_VALUE;
		System.out.println(maxFloat * 3);
*/		
		try {
		System.out.println( maxInt / InputValue);
		}
		catch( ArithmeticException exception) {
			System.out.println("val gresita ");
			InputValue = input.nextInt();
		}
		System.out.println("val noua " + InputValue);
	}

}
