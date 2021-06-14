package main;

import java.util.Scanner;

public class Converter {
	
		
		

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your selection: \n");
		System.out.println("1. Celsius to Fahrenheit ");
		System.out.println("2. Miles to Kilometers ");
		System.out.println("3. US Gallons to Imperial Gallons ");
		System.out.println("4. Quit");
		
		int menuSelection = scan.nextInt();
		while(menuSelection != 4) {
				switch(menuSelection){
				
				case 1:
					System.out.println("Please enter celsius: " );
					double input = scan.nextDouble();
					System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(input));
					break;
									
				case 2:
					System.out.println("Please enter Miles: " );
					double input1 = scan.nextDouble();
					System.out.println("Distance in kilometers: " + mileToKilometers(input1));
					break;
					
				case 3:
					System.out.println("Please enter US gallons: ");
					double input2 = scan.nextDouble();
					System.out.println("Volume in Imperial gallons: " + usGalToImpGal(input2));
					break;
				
				case 4:
					System.out.println("You choose to quite app");
					break;
					
					
			}
				System.out.println("Please choose a new selection");
				menuSelection = scan.nextInt();
		}
		
			
			scan.close();		
		
			
	}
	
	public static double celsiusToFahrenheit(double c) {
		double f = (c*9 + 32)/5;
		return f;
	}
	public static double mileToKilometers(double m) {
		double kilo = m*1.6;
		return kilo;
	}
	public static double usGalToImpGal(double ug) {
		double ig = ug / 1.201;
		return ig;
	}
	
}
