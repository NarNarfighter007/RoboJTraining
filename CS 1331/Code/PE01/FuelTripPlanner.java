public class FuelTripPlanner {
	public static void main(String[] args){
		int backRoadMiles = 25;
		int highwayMiles = 60;
		int hillyMiles = 10;
		int currentGasGallons = 20;
		int numberOfPeople = 5;
		double gallonsPerPerson = 0.0;
		gallonsPerPerson = ((2*backRoadMiles) + (1*highwayMiles) + (5*hillyMiles) - currentGasGallons)/numberOfPeople;
		System.out.printf("Each passenger is responsible for %.1f gallons of gas\n", gallonsPerPerson);
	}
}