package check;

import java.util.Scanner;

public class Alba {

	public static void main(String[] args) {
		//급여계산
		//시급, 일한 시간을 입력
		/*
		  Scanner input = new Scanner(System.in);
		  int ? = input.nexttInt();
		*/
		//최종적으로 급여를 출력
		Scanner input = new Scanner(System.in);
		System.out.print("근무 시간 : ");
		int hour = input.nextInt();
		System.out.print("시급 : ");
		int pay = input.nextInt();
		input.close();
		System.out.println("급여 : " + hour*pay);
	}

}
