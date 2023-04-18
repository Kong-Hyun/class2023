package study03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,};
		int[] b = a;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
		a[1]=10;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
		//object.clone()
		int[] scores = new int[] {1,2,3,4,5};
		int[] newScores = scores; //얕은 복사
		int[] newScores2 = scores.clone(); //깊은 복사
		
		System.out.println(scores);
		System.out.println(newScores);
		System.out.println(newScores2);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(newScores));
		System.out.println(Arrays.toString(newScores2));
		scores[1]=11;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(newScores));
		System.out.println(Arrays.toString(newScores2));
		
		//Arrays.copyof() , Arrays.copyofRange()
		int[] cal = {1,2,3,4,5,6,7};
		int[] newCal = Arrays.copyOf(cal, cal.length);
		int[] newCal2 = Arrays.copyOf(cal, 3);
		int[] newCal3 = Arrays.copyOf(cal, 10);
		System.out.println(Arrays.toString(cal));
		System.out.println(Arrays.toString(newCal));
		System.out.println(Arrays.toString(newCal2));
		System.out.println(Arrays.toString(newCal3));
		int[] newCal4 = Arrays.copyOfRange(cal, 1, 3);
		System.out.println(Arrays.toString(newCal4));
		
		//System.arraycopy(복사할 배열 원본, 복사할 배열 시작점, 복사본, 복사해서 대상 배열에 붙여넣기 시작할 첫번째 위치, 요소 개수)
		int[] arc = {1,2,3,4,5,6};
		int[] newArc = new int[6];
		System.arraycopy(arc, 0, newArc, 0, 6);
		System.out.println(Arrays.toString(newArc));
		int[] newArc2 = new int[3];
		System.arraycopy(arc, 2, newArc2, 0, 3);
		System.out.println(Arrays.toString(newArc2));
		
		//for문과 index를 통한 복사
		int[] inds = {1,2,3,4,5};
		int[] newInds = new int[5];
		
		for(int i=0;i<inds.length;i++) {
			newInds[i] = inds[i];
		}
		System.out.println(Arrays.toString(newInds));
		
		
	}

}
