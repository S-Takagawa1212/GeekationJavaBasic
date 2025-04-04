package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// 練習1
		int a = 345;
		int b = 234;
		
		boolean isGreaterAthanB = (a > b);
		
		System.out.println(isGreaterAthanB);
		
		
		// 練習2
		boolean isSunny = true;
		boolean isWarm = true ;
		
		boolean isSunnyAndWarm = (isSunny && isWarm ); 
		
		System.out.println(isSunnyAndWarm);
		
		//練習3
		int x = 5;
		int y = 6;
		
		boolean greaterThanZero = (x > 0);
		boolean isEvenNumber = ((y %=2) == 0);
		
		boolean isPositiveAndEven = (greaterThanZero && isEvenNumber);
		
		System.out.println(isPositiveAndEven);
		
		//練習4
		boolean hasPermission = false;
		
		boolean invertedPermisson = (!hasPermission);
		
		System.out.println(invertedPermisson);
		
		

	}

}
