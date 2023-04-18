package study16;

public class ThrowsRun {
	//메서드에서 try catch문을 이용하여 예외처리를 모두 작성함
//	static void handleException() {
//		try {
//			System.out.println("호출된 메서드");
//			Exception e = new Exception();
//			throw e;
//		}catch(Exception e) {
//			System.out.println("호출된 메서드에서 예외처리");
//		}
//	}
	static void handleException() throws Exception {
		//메서드에서 예외처리를 작성하지 않음
			System.out.println("호출된 메서드");
			Exception e = new Exception();
			throw e;
	}
	
	public static void main(String[] args) {
		try {
			handleException();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("메서드에서 발생한 예외회피를 main에서 예외처리함");
		}
		
	}
	
}
