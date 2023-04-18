package study04;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("몸무게 입력(kg)");
		double weight = input.nextDouble();
		System.out.print("키 입력(m)");
		double tall = input.nextDouble();
		//BMI 지수 계산
		double bmi = calculateBMI(weight,tall);
		//BMI 지수로 비만도 결과 출력
		printBMIClassification(bmi);
		
		
	}
	
	public static double calculateBMI(double weight, double tall) {
		return weight/Math.pow(tall, 2);
	}
	public static void printBMIClassification(double bmi) {
		String bmiClass = ""; //String->null 입력시 할당값 x
		//조건문
		if(bmi<18.5) {
			bmiClass="저체중";
		}else if(bmi>18.5 && bmi<25) { //25미만만 입력하여도 정상 값 출력
			bmiClass="정상";
		}else if(bmi>=25 && bmi<30) { //30미만만 입력하여도 정상 값 출력
			bmiClass="과체중";
		}else if(bmi>30) 
			bmiClass="비만";
		System.out.printf("BMI : %f %n %s 입니다.",bmi,bmiClass);	
		
	}

}
