package test01;

public class Exam04 {

	public static void main(String[] args) {
		//2개의 주사위를 던졌을 때 눈의 합이 눈의 합의 값이 5이면 코드정지
		//12가 나오면 감탄사 나오는 값을 출력
		//나오는 값을 출력
		while(true) {
			int i = (int)(Math.random()*6)+1;
			int j = (int)(Math.random()*6)+1;
			System.out.println("DICE GAME");
			System.out.printf("rolling...[%d,%d]\n",i,j);
			if(i+j==5) {
				System.out.println("GAME OVER");
				break;
			}
			if(i+j==12) {
				System.out.println("WOW");
				break;
			}

		}
		
	}

}
