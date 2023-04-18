package study03;

import java.util.Iterator;

public class ArrayRun {
	public static void main(String[] args) {
		Subject[] sub = new Subject[10];
		int[] num1 = new int[10];
		int[] num2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(num1.length);
		System.out.println(num2.length);
		System.out.println(num2[3] + " " + num1[3]); // num1[3] 초기값 0
		num1[1] = 11;
		System.out.println(num1[1] + " " + num1[0]);
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
		System.out.println();

		for (int k : num2) {
			System.out.print(k + " ");
		}
		System.out.println();
		
		// **
		String[] str = new String[5];
		System.out.println(str[2]);
		boolean[] bl = new boolean[5];
		System.out.println(bl[3]);
		
		double[] db = new double[5];
		System.out.println(db[3]);
		
		char[] alphabet = new char[26];
		System.out.println(alphabet[3]);	// 답 없음
		
		char ch = 'A';
		//ch = 66;		// A = 65, B = 66
		int k = 'B';
		System.out.println(ch + ", " + k + ", " + (ch + k));
		
		
		for (int i = 0; i < alphabet.length; i++, ch++) {	// ch++로 인해 문자-> 숫자로 형변환
			alphabet[i] = ch;
		}
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i]);
		}
		System.out.println();
		// 향상된 for문
		for (char c : alphabet) {
			System.out.print(c);
		}
		
	}

}
