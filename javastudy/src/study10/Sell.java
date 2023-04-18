package study10;

public interface Sell {
	//메서드
	void sell();
	default void order() {
		System.out.println("판매완료");
	}

}
