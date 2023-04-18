package study05;

public class MathRun {
	public static void main(String[] args) {
		//Math
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		//절대값
		System.out.println(Math.abs(-6.8)+"\n");
		
		//반올림, 올림, 버림
		System.out.println(Math.floor(32.123)); //버림
		System.out.println(Math.floor(32.123/10)*10); //버림
		System.out.println(Math.ceil(32.123)); //올림
		System.out.println(Math.round(32.523)+"\n"); //반올림
		
		//최대값 최소값
		System.out.println(Math.max(71, 89));
		System.out.println(Math.min(1102, 325));
		int[] arr = {1,4,25,34,-2};
		int maxi=0;
		for(int a=0;a<arr.length;a++) {
			if(a==0 ) {
				maxi=arr[a];
			}else {
				maxi=Math.max(maxi, arr[a]);
			}
		}
		System.out.println(maxi+"\n");
		
		//거듭제곱
		System.out.println(Math.pow(3, 3)+"\n");
		
		//제곱근
		System.out.println(Math.sqrt(9)+"\n");
		
		//세제곱근
		System.out.println(Math.cbrt(27)+"\n");
		
		//난수발생
		System.out.println(Math.random()); //0~1 Math.random() 0~1 랜덤숫자
		System.out.println((Math.random()*6)+1); //1~7 (int) 형변환시 정수 출력
		System.out.println((Math.random()*11)+1+"\n");  //1~12
		
		//Math.random()*(최대값-최소값)+최소값);
		//주사위 2~12
		for(int i=0;i<10;i++) {
			System.out.println((int)(Math.random()*(12-2+1)+2));
		}
		System.out.println();
		
		//고득점자 찾기
		String[] names = {"Elena", "Sam", "Tom", "John", "Emily", "Alex", "Kate"};
		int[] scores = {65, 74, 23, 75, 68, 96, 88};
		int i = topScorer(scores);
		System.out.printf("1등 : %s %n%d점",names[i],scores[i]);	
		}
	public static int topScorer(int[] scores) {		
		int max = scores[0];
		int num = 0;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>max) {
				max = Math.max(i, scores[i]);
				num = i;
			}
		} 
		return num;
		
	}

}
