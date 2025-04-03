package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// 
		int a = 100;
		int b = 35;
		
		outputCalcResult(MethodPractice::add, a, b);
		outputCalcResult(MethodPractice::sub, a, b);
		outputCalcResult(MethodPractice::mul, a, b);
		outputCalcResult(MethodPractice::div, a, b);
	}

	private static int add(int a, int b) {
		return a + b;
	}

	private static int sub(int a, int b) {
		return a - b;
	}
	
	private static int mul(int a, int b) {
        return a * b ;
	}
	
	private static int div(int a, int b) {
		return a / b ;
	}
	
	private interface Calculation {
		int calc(int a, int b);
	}
	
	private static void outputCalcResult(Calculation calculation, int a, int b) {
		System.out.println("計算結果は" + calculation.calc(a,b) + "です。");
	}

}
