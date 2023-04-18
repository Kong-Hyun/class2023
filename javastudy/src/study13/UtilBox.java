package study13;

public class UtilBox {
	//제너릭 메서드
	public <T> T boxing(T t) {
		return t;
	}
	public <T> boolean boxing(T t1, T t2) {
		return t1.equals(t2);
	}
	public <K, V> void boxing2(K k, V v) {
		System.out.println(k + ":" + v);
	}
	//일반적인 제너릭 조건에서는 Object 메서드만 사용가능
	//사용가능한 제너릭 조건으로 변경하면 해당 메서드도 사용가능
	//ex) String를 상속받으면 length 사용가능
	public <T extends String> void boxing3(T t) {
		System.out.println(t.length());
	}

	public static void main(String[] args) {
		UtilBox ub = new UtilBox();
		//System.out.println(ub.boxing("스트링타입", "인티저타입도사용가능"));
		//System.out.println(ub.boxing("인티저타입도입력가능"));
		System.out.println(ub.<String>boxing("사과"));
		System.out.println(ub.boxing("오렌지"));//형 자동변환
		
		System.out.println(ub.<Integer>boxing(3, 3));
		System.out.println(ub.<String>boxing("우리", "나"));
		String str1 = new String("당신");
		String str2 = new String("당신");
		System.out.println(str1.equals(str2));
		System.out.println(ub.boxing(str1, str2));//형 자동변환
		System.out.println(ub.<String>boxing(str1, str2));
		
		ub.boxing2("java", 90); //형 자동변환
		ub.<String, Integer>boxing2("java", 90);
		
		ub.boxing3("이스트링타입의길이는15입니다");
	}
	
}
