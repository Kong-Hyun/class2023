package study09;

public class ComTest {

	public static void main(String[] args) {
		//Computer com = new Computer(); 추상클래스는 객체 생성 불가
		//추상클래스 객체 생성 방법
		//1. 자식클래스를 생성하면서 함께 만드는 방법
		Computer com = new Desktop();
		com.display();
		com.typing();
		com.turnOn();
		com.turnOff();
		System.out.printf("\n");
		
		//2. 익명클래스를 통해서 생성
		Computer com2 = new Computer() {
			@Override
			public void typing() {
				System.out.println("익명내부클래스");
			}
		};
		com2.display();
		com2.typing();
		com2.turnOn();
		com2.turnOff();
		System.out.printf("\n");
		
		Computer com3 = new PotableNoteBook();
		NoteBook note = new PotableNoteBook();
		com3.display();
		note.display();
		com3.typing();
		note.typing();
	}

}
