package study16;

public class ArithmaticRun {

	public static void main(String[] args) {
		//예외처리 대상코드들을 try문 안에 작성
		try {
			System.out.println(5/0);
			byte[] list = {'a', 'b', 'c'};
			System.out.println(list[5]);
		}catch(Exception e) {
			e.printStackTrace(); //처음 코드 오류 발생지역과 내용 출력
			System.out.println("예외 원인 : " + e.getMessage()); //코드 오류 종류 메세지만 출력
			System.out.println(e.toString()); //오류의 종류와 분류까지 출력
		}finally {
			System.out.println("반드시 실행"); //예외처리 try문에서 반드시 실행후 try문 종료
		}
		
		System.out.println("오류 발생 후에도 예외처리 후 계속 진행"); //오류 지점에서 진행이 멈추는게 아니라 이후 코드도 계속실행
		
	}
	
}
