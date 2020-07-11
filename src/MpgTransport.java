//Exercise from chapter 4.17

import java.util.Scanner;
public class MpgTransport {
	public static void main(String[] args) {
		int milesDriven = 0;
		int gallonsUsed;
		float milesPerGallon;
		int Trips = 1;
		int totalMiles = 0;
		int totalGallons = 0;
		

		System.out.println("Please enter the mileage covered:");
		Scanner keyboard = new Scanner(System.in);
		milesDriven = keyboard.nextInt();

		while(milesDriven != 0) {
			totalMiles = totalMiles + milesDriven;
		
		System.out.println("Please enter number of gallons used");
		Scanner input = new Scanner(System.in);
        gallonsUsed = input.nextInt();
		totalGallons = totalGallons + gallonsUsed;
		
		milesPerGallon = (float)milesDriven / gallonsUsed;
		System.out.printf("The average mpg for Trip %d is %.2f%n",Trips, milesPerGallon);
		System.out.println();
			System.out.println("Please enter next mileage covered");
			Scanner takein = new Scanner(System.in);
			milesDriven = takein.nextInt();
			Trips++;

			}
		if(milesDriven == 0) {
			milesPerGallon = (float)totalMiles / totalGallons;
			System.out.printf("Total average mpg for all trips is: %f",milesPerGallon);
		}
		else
			System.out.println();
		
	}

}
