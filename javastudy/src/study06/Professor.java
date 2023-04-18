package study06;

public class Professor {
	String name;
	String team;
	String difficult;
	Professor(){}
	Professor(String name, String team, String difficult){
		this.name = name;
		this.team = team;
		this.difficult = difficult;
	}
	void attend() {
		System.out.println("출석부르기");
	}
	void task() {
		System.out.println("과제내주기");
	}
	void credit() {
		System.out.println("학점주기");
	}
	
	public static void main(String[] args) {
		Professor pf = new Professor();
		pf.attend();
	}
	

}
