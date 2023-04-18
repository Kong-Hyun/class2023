package study15_2;

import java.util.*;
import java.util.Map.Entry;

public class MapEx {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		//값 추가 ("lee", 96) ("hong", 86) ("song",92)
		map.put("lee", 96);
		map.put("hong", 86);
		map.put("song", 92);
		
		String topName = "";
		int maxPoint = 0;
		int totalPoint = 0;
		
		//keySet 으로 풀이
//		map.keySet();
//		Set<String> keySet = map.keySet();
//		Iterator<String> iter = keySet.iterator();
//		while(iter.hasNext()) {
//			String name = iter.next();
//			int value = map.get(name);
//			totalPoint += value;
//			maxPoint = (maxPoint<value)?value:maxPoint;
//			topName = (maxPoint<=value)?name:topName;
//		}
		
		//entrySet으로 풀이
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			String name = entry.getKey();
			int point = entry.getValue();
			totalPoint += point;
			maxPoint = (maxPoint<=point)?point:maxPoint;
			topName = (maxPoint<=point)?name:topName;
		}
		
		
		
		
		System.out.println("평균 점수 : " + totalPoint/map.size());
		System.out.println("최고 점수 : " + maxPoint);
		System.out.println("최고 득점자 : " + topName);
		
	}
	
}
