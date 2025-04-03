package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		//練習1

		for (int i = 1; i < 101; i++) {
			boolean MultipleOfThree = ((i % 3) == 0);
			boolean MultipleOfFive = ((i % 5) == 0);
			
			if (MultipleOfThree && MultipleOfFive) {
				System.out.println("FizzBuzz");
			} else if (MultipleOfThree) {
				System.out.println("Fizz");
			} else if (MultipleOfFive) {
				System.out.println("Buzz");	
			} else {
				System.out.println(i);
			}
			
		}

	}

}
