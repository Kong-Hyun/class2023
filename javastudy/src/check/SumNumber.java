package check;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		//자릿수의 합
		//세자리수를 입력받아 각 자릿수를 더하여 결과를 출력
		//단 세자리 정수가 아닌 경우 예외처리
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		while(true) { 
			System.out.print("값을 입력해주세요 : ");
			int number = input.nextInt();
			a = number/100;
			b = ((number%100)/10);
			c = number%10;
			sum = a+b+c;
			if (number>=1000 || 100>number) {
			System.out.println("세자리 정수가 아닙니다. 값을 다시 입력해주세요.");
			} else if(number<1000 || 100<=number) {
				System.out.println(sum);
				break; //반복문이 아니면 입력시 오류
				}
			}
		
	}

}
