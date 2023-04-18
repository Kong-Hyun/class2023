package study16;

public class MultiExceptionRun {

	public static void main(String[] args) {
		CalTest caltest = new CalTest();
		caltest.exceptionProc(1, 0);
		caltest.exceptionProc(2, 4);
		caltest.exceptionProc(1, 2);
		
	}
	
}
class CalTest {
	private int[] arr = new int[3];
	CalTest() {
		arr[0] = 0;
		arr[1] = 100;
		arr[2] = 10;
	}
	public void exceptionProc(int first, int second) {
		try {
			System.out.println(arr[first]/arr[second]);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception e) {
			System.out.println("Exception"); //범위가 작은 순서대로 예외처리를 해야함. 모든 예뢰를 처리하는 Exception을 맨 윗줄에서 캐치하면 더이상 동작하지않음.
		}finally {
			System.out.println("finally");
		}
	}
}
