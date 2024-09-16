import java.util.Random;
import java.util.Scanner;

public class RandomMath{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("1, Powers of a Number%n2, Random Positive Integer with Maximum%n3, Area of Random Circle%n4, Area of Random Square%nWhat would you like to do?%n");
		int userInput = scanner.nextInt();
		while (userInput<0 || userInput>4){
			System.out.printf("Invalid user input, type a number 1-4.%n");
			userInput = scanner.nextInt();
		}
		switch (userInput){
			case 1: 
				System.out.print("What number would you like to calculate powers of? ");
				userInput = scanner.nextInt();
				if (userInput == -1){
					System.out.printf("-1 raised to 0 is 1%n-1 raised raised to odd powers greater than 0 is -1%n-1 raised to even powers greater than 0 is 1%n");
				} else if (userInput == 0){
					System.out.printf("0 raised to the 0 is 1%n0 raised to powers greater than 0 is 0%n");
				} else if (userInput == 1){
					System.out.printf("1 raised to ANY power is still 1");
				} else {
					double currentNum = 1;
					int currentExp = 0;
					do {
						System.out.println(userInput+" raised to " + currentExp +" is " + currentNum + ".");
						currentExp++;
						currentNum= Math.pow(userInput, currentExp);

					}
					while (currentNum<100);
				}
				break;
		}
	}
}