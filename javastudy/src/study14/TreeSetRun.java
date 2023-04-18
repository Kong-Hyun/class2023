package study14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetRun {

	public static void main(String[] args) {
		TreeSet<String> tset1 = new TreeSet<>();
		tset1.add("apple");
		tset1.add("orange");
		tset1.add("banana");
		System.out.println(tset1);
		tset1.addAll(tset1);
		System.out.println(tset1);
		System.out.println(tset1);
		System.out.println(tset1.remove("apple"));
		System.out.println(tset1);
		
		
		TreeSet<Integer> tset2 = new TreeSet<>();
		tset2.add(55);
		tset2.add(7);
		tset2.add(32);
		System.out.println(tset2);
		tset2.clear();
		System.out.println(tset2.isEmpty());
		for(int i=3;i<100;i+=3) {
			tset2.add(i);
		}
		System.out.println(tset2);
		System.out.println(tset2.first()); //첫번째 값 출력
		System.out.println(tset2.last()); //첫번째 값
		System.out.println(tset2.lower(51)); //51보다 한단계 낮은 수
		System.out.println(tset2.higher(51)); //51보다 한단계 높은 수
		System.out.println(tset2.floor(17)); //17을 포함한 한단계 낮은 수
		System.out.println(tset2.floor(18)); //18을 포함한 한단계 낮은 수
		System.out.println(tset2.ceiling(25)); //25를 포함한 한단계 높은 수
		System.out.println(tset2.ceiling(24)); //24를 포함한 한단계 높은 수
		System.out.println(tset2.size());
		System.out.println(tset2.pollFirst()); //첫번째 값을 삭제함 삭제한 값을 출력
		System.out.println(tset2.pollLast()); //마지막 값을 삭제함 삭제한 값을 출력
		System.out.println(tset2);
		
		//headSet boolean값이 true일경우 해당값 포함, false일경우 미포함
		System.out.println(tset2.headSet(18)); //시작부터 해당 값 전까지만 출력 디폴트는 false
		System.out.println(tset2.headSet(18, true));
		System.out.println(tset2.tailSet(84)); //해당값을 포함한 이후부터 끝까지 출력 디폴트는 true
		System.out.println(tset2.tailSet(84, false)); 
		System.out.println(tset2.subSet(42, 54)); //입력값 사이의 값 출력. 시작은 디폴트가 true 종료지점은 false
		System.out.println(tset2.subSet(42, false, 54, true));
		
		TreeSet<String> animalTSet = new TreeSet<>(Arrays.asList("Dog", "Cat", "Tiger", "Lion", "Elephant", "Zebra"));
		
		SortedSet<String> sset = animalTSet.headSet("Z"); //Z로시작하는단어 Zebra를 삭제함
		NavigableSet<String> nset = animalTSet.headSet("Z", true);
		System.out.println(sset);
		System.out.println(nset);
		Iterator<String> iter = nset.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Iterator<Integer> itr2 = tset2.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		System.out.println();
		
		Iterator<Integer> itr3 = tset2.descendingIterator();
		while(itr3.hasNext()) {
			System.out.printf("%d ", itr3.next());
		}
		System.out.println();
		
		TreeSet<Integer> tset3 = new TreeSet<>(tset2);
		System.out.println(tset3);
		
		
		int treesize = tset2.size(); //treesize 선언을 안해주면 반복문이 실행되는동안 tset2의 사이즈가 1개씩 감소하기때문에 감소한만큼 출력값이 줄어듬
		for(int i=0; i<treesize;i++) {
			System.out.print(tset2.pollFirst() + " ");
		}
		System.out.println();
		System.out.println(tset2.isEmpty()); //반복문을 실행하며 객체를 하나씩 다 삭제하며 출력했기때문에 tset2에 남은 값은 없
		
		treesize = tset3.size();
		for(int i=0; i<treesize; i++) {
			System.out.print(tset3.pollLast() + " ");
		}
		System.out.println();
		System.out.println(tset3.isEmpty());
		
		String[] str = tset1.toArray(new String[0]);
		System.out.println(Arrays.toString(str));
		for(String s : tset1) {
			System.out.print(s + " ");
		}
		
		
	}
	
}
