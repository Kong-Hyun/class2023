package study03;

import java.util.ArrayList;

public class ArrayListRun {
	public static void main(String[] args) {
		// class 객체로 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>();	// <> 안에 Integer 위와 중복이기 때문에 생략가능
		ArrayList<Integer> list3 = new ArrayList<>(10);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("안녕하세요");
		strList.add("안녕");
		strList.add("잘 가세요");
		System.out.println(strList);
		System.out.println(strList.size());
		System.out.println(list3.size());
		strList.add(1, "종호"); //해당 인덱스에 삽입
		System.out.println(strList);
		System.out.println(strList.size());
		strList.set(2, "아름"); //해당 인덱스의 요소 값 수정
		System.out.println(strList);
		strList.remove("종호"); //동일객체 삭제
		System.out.println(strList);
		strList.remove(2); //해당 인덱스의 값 삭제
		System.out.println(strList);
		strList.clear(); //
		System.out.println(strList);
		
		strList.add("이재민");
		strList.add("박만수");
		strList.add("강민정");
		strList.add("공승환");
		System.out.println(strList);
		
		for(int i=0;i<strList.size();i++) {
			System.out.print(strList.get(i)+" ");
		}
		for(String str:strList) {
			System.out.println(str+" ");
		}
		System.out.println();
		//검색
		System.out.println(strList.contains("박만수"));
		System.out.println(strList.indexOf("박만수"));
		System.out.println(strList.indexOf("김준현"));
		
		//복사
		System.out.println(strList);
		//clone()
		ArrayList<String> newStr1 = (ArrayList<String>)strList.clone();
		printArrayList(newStr1);
		//addAll()
		ArrayList<String> newStr2 = new ArrayList<>();
		printArrayList(newStr2);
		//for
		ArrayList<String> newStr3 = new ArrayList<>();
		for(String str:strList) {
			newStr3.add(str);
		}
		printArrayList(newStr3);
		
		//isEmpty()
		System.out.println(newStr3.isEmpty());
		newStr3.clear();
		System.out.println(newStr3.isEmpty());

		
	
	}
	
	static void printArrayList(ArrayList<String> arr) {
		for(String str:arr) {
			System.out.println(str);
		}
	}
}
