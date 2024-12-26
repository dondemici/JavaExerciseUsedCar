package UsedCar;

public class UsedCarException extends Exception{
	public UsedCarException(String vin, String message) {
			super("Car VIN number: "+ vin +
					"\nError message: "+ message);
	}
	
}

//Java coding attempt