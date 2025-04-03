package basicSyntax;

public class GeekIntroduction {
	
	public static void main(String[] args) {
		specialSkill(5,15);
		System.out.println("pass");
	}

	protected void greeting(int age, double height) {
		System.out.println("こんにちは! 私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
	}
	
	protected static void specialSkill(int num1, int num2) {
	    judgeNumericRules(num1, num2, 300);
		for (; num1 < num2 + 1; num1++) {
			if (isMultipleOfX(num1, 15)) {
			    System.out.println( num1 + "は3の倍数かつ5の倍数です。");
			}
			else if (isMultipleOfX(num1, 3)) {
				System.out.println( num1 + "は3の倍数です。");
			} else if (isMultipleOfX(num1, 5)) {
				System.out.println( num1 + "は5の倍数です。");
			} else {
				System.out.println(num1);
				
			}
		}	
	}
	
	private static boolean isGreaterThanZero(int a,int b) {
		return ((a>0) && (b>0));
	}
	private static boolean isGreaterThanB(int a, int b) {
		return (a < b);
	}
	// 第１、２引数が第３引数以下であればTrueを返す。
	private static boolean isEqualOrGreaterThanX(int a, int b ,int X) {
		return (a <= X && b <= X);
		
	}
	// 第１、２引数が第３引数の倍数あればTrueを返す。
	private static boolean isMultipleOfX(int num, int X) {
		return (num % X == 0);
	}
	
	private static void judgeNumericRules(int a, int b, int X) {
		if (!isGreaterThanZero(a, b)) {
			throw new IllegalArgumentException("num1とnum2は0より大きい値にしてください。");
		} else if (!isGreaterThanB(a, b)) {
			throw new IllegalArgumentException("num2はnum1より大きい値にしてください。");
		} else if (!isEqualOrGreaterThanX(a, b, X)) {
			throw new IllegalArgumentException("num1とnum2は" + X + "以下にしてください。");
		}
	}
	
	

}
