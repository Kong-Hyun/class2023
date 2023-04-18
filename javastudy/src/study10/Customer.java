package study10;

public class Customer implements Buy, Sell {
	@Override
	public void buy() {
		System.out.println("고객 구매");
	}
	@Override
	public void sell() {
		System.out.println("고객 판매");
	}
	//중복된 메서드의 재정의
	@Override
	public void order() {
		System.out.println("고객 주문");
	}
	
	//추가 메서드
	public void comp() {
		System.out.println("고객 불만");
	}

}
