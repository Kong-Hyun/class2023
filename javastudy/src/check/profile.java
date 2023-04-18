package check;

public class profile {
	
	public static void main(String[] args) {
		/* 개인 프로필 출력
	   변수에 값을 저장 후 출력
	   이름 : 홍길동
	   학번 : 2018122104
	   신장 : 1.78m
	   남자인가요? true
		 */
		String name = "홍길동";
		String stuNumber = "2018122104";
		double height = 1.78;
		boolean isMale = true;
		
		//출력
		System.out.println("이름 : "+name);
		System.out.println("학번 : "+stuNumber);
		System.out.printf("신장 : %.2fM %n",height);
		//%f %.숫자 입력시 소수점 몇자리까지 표기하는지 설정
		//=System.out.println("신장 : "+height+"M");
		System.out.println("남자인가요? "+isMale);
	}

}
