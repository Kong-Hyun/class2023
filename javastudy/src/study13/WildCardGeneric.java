package study13;

class Top {}
class Sub extends Top {}
class Cen extends Sub {}
class Bot extends Cen {}

class Team<T> {
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}
class Member {
	void show1(Team<Top> t) {}; // Team 객체 Top 객체
	void show2(Team<?> t) {}; // Team 객체 아무거나
	void show3(Team<? extends Sub> t) {}; // Team 객체 Sub, Cen, Bot
	void show4(Team<? super Sub> t) {}; // Team 객체 Top, Sub, Object
}


public class WildCardGeneric {

	public static void main(String[] args) {
		Member mem = new Member();
		//show1 => <top> t로 선언되어 나머치는 객체 생성오류
		mem.show1(new Team<Top>());
		//mem.show1(new Team<Sub>());
		//mem.show1(new Team<Cen>());
		//mem.show1(new Team<Bot>());
		
		//show2 => ?만 입력하여 모든 객체 생성 가능
		mem.show2(new Team<Top>());
		mem.show2(new Team<Sub>());
		mem.show2(new Team<Cen>());
		mem.show2(new Team<Bot>());
		mem.show2(new Team<Object>());
		mem.show2(new Team<Integer>());
		
		//show3 => 상속받은 개체 포함 자식개체까지 객체 생성 가능
		//mem.show3(new Team<Top>());
		mem.show3(new Team<Sub>());
		mem.show3(new Team<Cen>());
		mem.show3(new Team<Bot>());
		//mem.show3(new Team<Object>());
		//mem.show3(new Team<Integer>());
		
		//show4 => 상속받은 개체를 포함 부모객체까지 객체 생성 가능 (Object는 Sub의 부모객체지만 Integer는 아니다. 정수를 할당하면 Integer도 상속이 가능한지?)
		mem.show4(new Team<Top>());
		mem.show4(new Team<Sub>());
		//mem.show4(new Team<Cen>());
		//mem.show4(new Team<Bot>());
		mem.show4(new Team<Object>());
		//mem.show4(new Team<Integer>());
		
		
	}

}
