package check;

public class Food {
	
	public static void main(String[] args) {

	//치킨 34인분, 왕만두 10인분, 쌀국수 12인분
	//가격 치킨:25000원, 왕만두:5000원, 쌀국수:8500
	/*
		치킨 x 34 = ?
		왕만두 x 10 = ?
		쌀국수 x 12 = ?
		==================
		총합 = ?
	 */
		String menuA = "치킨";
		String menuB = "왕만두";
		String menuC = "쌀국수";
		int priceA = 25000;
		int priceB = 5000;
		int priceC = 8500;
		int countA = 34;
		int countB = 10;
		int countC = 12;
		//int payA,B,C = priceA,B,C*countA,B,C  int total = payA+B+C
		int total = (priceA*countA)+(priceB*countB)+(priceC*countC);
		System.out.printf("%s x %d = %d%n",menuA, countA, (priceA*countA));
		System.out.printf("%s x %d = %d%n",menuB, countB, (priceB*countB));
		System.out.printf("%s x %d = %d%n",menuC, countC, (priceC*countC));
		System.out.println("==================");
		System.out.println("총합 = "+total);
	}
}
