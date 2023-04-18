package study11_1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTest {
	
	
	
	public static void main(String[] args) {

		
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes);
		System.out.println(str);
		str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		System.out.println(str);
		//"자바" 없으면 "자바 없음"
		//있으면 "자바" ->"Java" 바꿔주세요
		
		int index = str.indexOf("자바");
		
		if(str.contains("자바")) {
			System.out.println(str.replace("자바","Java"));
		} else {
			System.out.println("자바 없음");
		}
		str = "1,2,3,4,5,6,7,8,9,10";
		//이 한개의 문자열 숫자만 다 합친 결과 값 55
		//1. split() 사용
		String[] spl = str.split(",");
		System.out.println(Arrays.toString(spl));
		/*
		for(int i = 0; i < token.length; i++) {
			System.out.print(token[i]);
		}
		*/
		int res = 0;
		for(String s : spl) {
	    	System.out.print(s);
	         res += Integer.parseInt(s);
	         }
	    System.out.println(" " + res + "\n");
	    res = 0;		
		
	    
	    //2. StringTokenzizer 사용
		StringTokenizer stk = new StringTokenizer(str, ",");
		System.out.println(stk.countTokens());
		while(stk.hasMoreElements()){
			int temp =  Integer.parseInt(stk.nextToken());
			System.out.print(temp);
			 res += temp;	
		}
		System.out.println("\n" + res);

		
	}

}
