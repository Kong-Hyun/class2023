package study10;

public interface Buy {
	//메서드
	void buy();
	default void order() {
		System.out.println("주문완료");
	}
}
