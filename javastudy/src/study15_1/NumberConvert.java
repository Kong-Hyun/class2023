package study15_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class NumberConvert {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7,3,2,1,1,2,9,6,4,7,3,5,8,10,4));
		System.out.println(numbers);
		
		//중복제거 오름차순 정렬 (TreeSet 이용)
		TreeSet<Integer> numbers2 = new TreeSet<>(numbers);
		System.out.println(numbers2);
		//내림차순 정렬 (NavigableSet, TreeSet 이용)
		NavigableSet<Integer> numbers3 = new TreeSet<>(numbers).descendingSet();
		System.out.println(numbers3);
		
		//랜덤으로 1-10 사이의 20개의 숫자를 배열에 저장하고 오름차순 내림차순으로 출력
		ArrayList<Integer> randomnum = new ArrayList<>();
		for(int i = 0; i<20; i++) {
			randomnum.add((int)(Math.random()*10) + 1);
		}
		System.out.println(randomnum);
		TreeSet<Integer> randomnum2 = new TreeSet<>(randomnum);
		System.out.println(randomnum2);
		NavigableSet<Integer> randomnum3 = new TreeSet<>(randomnum).descendingSet();
		System.out.println(randomnum3);
		
		Random random = new Random();
		ArrayList<Integer> nums = new ArrayList<>();
		for(int i=0; i<20; i++) {
			int r = random.nextInt(10)+1;
			nums.add(r);
		}
		System.out.println(nums);
		NavigableSet<Integer> nums2 = new TreeSet<>(nums);
		System.out.println(nums2);
		System.out.println(nums2.descendingSet());
		
		
	}
	
}
