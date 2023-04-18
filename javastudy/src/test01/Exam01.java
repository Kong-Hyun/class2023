package test01;

public class Exam01 {
	public static void main(String[] args) {
		//1-100까지 정수 중에서 3의 배수의 총합을 구하시오
		int sum = 0;
		for(int i=1;i<=100;i++) {
		if(i%3==0) {
			sum = sum + i; //sum += i;
			}
		}
		System.out.printf("3의 배수의 총합 : %d",sum);
		/*
		System.out.printf(format, arguments)
		%n : 줄바꿈
		%s : String
		%d : int
		%f : float
		%t : date,time
		%b : boolean
		*/
	}
	
}
