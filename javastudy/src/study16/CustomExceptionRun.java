package study16;

class FoolException extends Exception {}

class Sample {
	public void sayNickname(String nick) /* throws Exception*/{
		try {
			if(nick.equals("바보")) {
				throw new FoolException();
			}
			System.out.printf("당신의 별명은 %s입니다.%n", nick);
		}catch(FoolException e) {
			System.err.println("FoolException 발생");
		}		
	}
}

public class CustomExceptionRun {
	
	public static void main(String[] args) {
		Sample s = new Sample();
		//트라이 캐치문을 실행문에 적용하면 예외 처리 이후는 실행하지 않음
//		try {
			s.sayNickname("바보");
			s.sayNickname("말미잘");
//		}catch(FoolException e) {
//			System.err.println("FoolException 발생");
//		}
		
	}
	
}
