package study03;

public class Recursive {
	public static void main(String[] args) {
		System.out.println(fibornacci(7));	// n번째 자릿수
		System.out.println(factorial(3));
	}

	// 피보나치 수열
	public static long fibornacci(long n) {
		if (n <= 2) {
			return 1;
		}
		return fibornacci(n - 1) + fibornacci(n - 2); // 최솟값이 나올 때 까지 반복
	}
	// 팩토리얼
	public static long factorial(long n) {
		if (n <= 1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}
