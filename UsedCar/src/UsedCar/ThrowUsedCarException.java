package UsedCar;

import java.util.ArrayList;
import java.util.Scanner;

public class ThrowUsedCarException {

	public static void main(String[] args) {
		ArrayList<UsedCar> usedCar = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int numberOfUsedCars = 2;
		
		for(int i = 0; i<numberOfUsedCars ; i++) {
			try {
				System.out.print("Enter VIN no: ");
				String vin = input.next();
				System.out.print("Enter make: ");
				String make = input.next();
				System.out.print("Enter year: ");
				int year = Integer.parseInt(input.next());
				System.out.print("Enter mileage: ");
				double mileAge = Double.parseDouble(input.next());
				System.out.print("Enter price: ");
				double price = Double.parseDouble(input.next());
				
				UsedCar car = new UsedCar(vin, make, year, mileAge, price);
				usedCar.add(car);
				
			}catch(NumberFormatException e) {
				System.out.println("Enter a valid year, price or mileage.");
			}catch(UsedCarException e) {
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("Added used cars");
		for(UsedCar car:usedCar) {
			System.out.println(usedCar);
		}
		input.close();
	}
}