package study08;

import java.util.ArrayList;

public class PriceRun {
	
	static void showCustomer(ArrayList<Customer> i) {
		System.out.println("================고객================");
		for(Customer a : i) { //for(a : i) i의 해당 값만큼 실행
			System.out.println(a.getCustomerInfo());
		}
	}
	static void calcPriceAll(ArrayList<Customer> j, int price) {
		System.out.println("===============가격계산===============");
		System.out.println("가격 : " + price);
		for(Customer b : j) {
			int cost = b.calcPrice(price);
			System.out.printf("%s 고객님의 구매금액은 %d원 입니다.",b.getCustomerName(), cost);
			System.out.println(b.getCustomerInfo());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Customer> cusList = new ArrayList<>();
		
		Customer lee = new Customer("이순신");
		Customer hong = new Customer("홍길동");
		GoldCustomer park = new GoldCustomer("박호진");
		VipCustomer kim = new VipCustomer("김정호", "대동아");
		VipCustomer kong = new VipCustomer("공현", "반장박호진노예");
		
		cusList.add(lee);
		cusList.add(hong);
		cusList.add(park);
		
		showCustomer(cusList);
		calcPriceAll(cusList, 100000);
		
		ArrayList<Customer> cusList2 = new ArrayList<>();
		
		cusList2.add(kim);
		cusList2.add(kong);
		
		showCustomer(cusList2);
		calcPriceAll(cusList2, 300000);
	}
	
	
}
