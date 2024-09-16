public class Ternary{
	public static void main(String[] args){
		int initialNum = 999;
		String answer = "";
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		int currentNum = initialNum;
		while (currentNum != 0){
			int digit = currentNum % 3;
			if (digit == 0){
				zeroCount++;
			} else if (digit == 1){
				oneCount++;
			} else {
				twoCount++;
			}
			answer = digit + answer;
			currentNum /= 3;
		}
		System.out.printf("Decimal representation: %d%n",initialNum);
		System.out.printf("Ternary representation: %s%n",answer);
		System.out.printf("%d zeros, %d ones, %d twos%n",zeroCount,oneCount,twoCount);
		int digitSum = zeroCount*0 + oneCount*1 + twoCount*2;
		int fiveSum = digitSum%5;
		String fiveCase;
		switch (fiveSum){
			case 0: fiveCase = "The ternary digits sum to a multiple of 5!"; break;
			case 1: fiveCase = "The ternary digits almost summed to a multiple of 5!"; break;
			case 4: fiveCase = "So close!"; break;
			default: fiveCase = "Nope!"; break;
		}
		System.out.println(fiveCase);
		String zeroMore = (zeroCount > oneCount && zeroCount > twoCount)
			? ""
			: " not";
		System.out.printf("Zero is%s the most used digit.", zeroMore);
	}
}