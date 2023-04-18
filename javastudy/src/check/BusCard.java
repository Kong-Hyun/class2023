package check;

import java.util.Scanner;

public class BusCard {

	public static String getRole(int age) {
		String role = "";// String role 삭제 후 String role로 선언하고 return = String입력하면 값이 같음
		if(age>=18) {
			role = "성인";
		} else if(age>=13) {
			role = "청소년";
		} else if(age>=6) {
			role = "어린이";
		} else if(age<6) {
			role = "유아";
		}
		return role;
	}
	
	public static void main(String[] args) {
		/*
		  성인 : 만 18세 이상
		  청소년 : 만 13세 이상
		  어린이 : 만 6세 이상
		  유아 : 만 5세 이하
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("나이를 입력해주세요.");
		int age = input.nextInt();
		String role = getRole(age);
		System.out.println(role);

	}

}
