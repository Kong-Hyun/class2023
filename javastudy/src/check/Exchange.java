package check;

import java.util.Scanner;

public class Exchange {
	
	public static void main(String[] args) {
		// 유로 달러 두번 입력
		// 한화로 얼마인지
		// 환율 검색	
		Scanner input = new Scanner(System.in);
		System.out.print("유로 : ");
		double eur = input.nextDouble();
		System.out.print("달러 : ");
		double usd = input.nextDouble();
		double eurtowon = 1338.39;
		double usdtowon = 1228.93;
		int won = (int)(eur*eurtowon+usd*usdtowon);
		System.out.printf("유로 1EUR=%.2f원%n%.2f원%n" ,eurtowon, (eur+eurtowon));
		System.out.printf("달러 1USD=%.2f원%n%.2f원%n" ,usdtowon, (usd+usdtowon));
		System.out.printf("총 %d원",won);
		
	}
	
}
