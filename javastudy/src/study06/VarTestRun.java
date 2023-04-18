package study06;

public class VarTestRun {
	
	int k=0;
	
	int localVal(int l) {
		this.k++;
		return l+l;
	}

	public static void main(String[] args) {
		VarTestRun vtr = new VarTestRun();
		//사용할 메서드를 포함한 클래스의 객체를 생성
		int a = 1;
		a = vtr.localVal(a);
		System.out.println(a);
		//객체.멤버변수명
		System.out.println(vtr.k);
		
		
	}

}
