package study15_2;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
	static boolean isAnagram(String a, String b) {
		//1. 문자열을 문자 배열로 변환한다.
		char[] char1 = a.toCharArray();
		char[] char2 = b.toCharArray();
		//2. 문자 배열을 정렬한다.
		Arrays.sort(char1);
		Arrays.sort(char2);
		//3. 정렬된 문자 배열이 같은지 비교한다.
		return Arrays.equals(char1, char2);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 단어 입력 : ");
		String a = scan.next();
		System.out.print("두번째 단어 입력 : ");
		String b = scan.next();
		boolean result = isAnagram(a, b);
		if (result) {
		    System.out.println("두 단어는 Anagram입니다.");
		} else {
		    System.out.println("두 단어는 Anagram이 아닙니다.");
		}
		System.out.print("두 단어는 ");
		System.out.println(result?"Anagram입니다.":"Anagram이 아닙니다.");
		
	}
	
}
