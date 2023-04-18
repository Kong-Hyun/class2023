package test01;

interface Mineral{
	int getValue();
}

class Gold implements Mineral {
	public int getValue() {
		return 100;
	}	
}
class Silver implements Mineral {
	public int getValue() {
		return 90;
	}
}
class Bronze implements Mineral {
	public int getValue() {
		return 80;
	}
}
class MineralCalculator {
	int value = 0;
	
	public void add(Mineral min) {
		value += min.getValue();
	}
	public int getValue() {
		return value;
	}
}

public class Exam09 {
	
	public static void main(String[] args) {
		MineralCalculator cal = new MineralCalculator();
		cal.add(new Gold());
		cal.add(new Silver());
		cal.add(new Bronze());
		System.out.println(cal.getValue());		
		
		//아 너무짜증난다 대소문자 진짜
		
		
		
	}

}


