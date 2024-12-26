package UsedCar;

public class UsedCar {
	private String vin;
	private String make;
	private int year;
	private double mileAge;
	private double price;
	
	public UsedCar(String vin, String make, int year, double mileAge, double price) throws UsedCarException {
		if(vin == null || vin.length() != 4) {
			throw new UsedCarException(vin, "Invalid VIN. It must contain 4 digits.");
		}
		if(!make.equalsIgnoreCase("Honda") && !make.equalsIgnoreCase("Ford")) {
			throw new UsedCarException(vin, "Invalid make. It must be Ford or Honda.");
		}
		if(year < 1997 || year > 2024) {
			throw new UsedCarException(vin, "Invalid year. It must be between 1997 and 2024.");
		}
		if(mileAge < 0 || price < 0) {
			throw new UsedCarException(vin, "Invalid mileage or price. It must be a positive value.");
		}
		
		this.vin = vin;
		this.make = make;
		this.year = year;
		this.mileAge = mileAge;
		this.price = price;
	}
	
	public String toString() {
		return "VIN Number: "+ vin + "\nMake: " + make + "\nYear: " + year + "\nMileage: " + mileAge + "\nPrice: " + price;
	}
	
}
