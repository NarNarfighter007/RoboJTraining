public class TipHelper {
	/* Hey! My name is Krish Shajpaul.
		I love buckwheat pillows, but I couldn't find a financial reason to buy one yet over my tuition. :(
		I used to play Rocket League religously and then I realized I don't have the motor control or patience to play it competetively. 
		So I switched to programming; I hit the same problem somehow. */
	public static void main(String[] args){
		double tipPercentage = 0.15;
		double mealTotal = 20.179;
		int numberItemsOrdered = 3;
		String customerName = "Jacob";
		
		double totalTip = tipPercentage * mealTotal;
		double tipTrunc = (int)(totalTip*100);
		tipTrunc = tipTrunc/100;
		double totalAmountPaid = tipTrunc + mealTotal;
		double totalTrunc = (int)(totalAmountPaid*100);
		totalTrunc = totalTrunc/100;
		System.out.println("The total tip was $" + tipTrunc);
		System.out.println(customerName + " owes a total of $" + totalTrunc);
	}
}