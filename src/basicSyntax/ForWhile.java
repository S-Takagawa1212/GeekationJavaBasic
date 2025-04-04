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
		
		// 練習2
		String[] programmingLanguages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
		for (String programmingLangage : programmingLanguages) {
			// pythonは ==が同値性だが、Javaでは==は同一性を検証する。.equals()で同値性を検証すべき点に注意。
			if (programmingLangage.equals("Java")) {
				System.out.println("現在学習中の言語はJavaです.");
				continue;
			} else if (programmingLangage.equals("HTML")) {
				System.out.println("HTMLはプロフラミング言語ではありません.");
				break;
			} else {
				System.out.println(programmingLangage + "こそが最強です。異論は認めん!!!!");
			}
		}

	}

}
