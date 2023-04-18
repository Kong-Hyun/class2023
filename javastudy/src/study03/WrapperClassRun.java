package study03;

public class WrapperClassRun {
	public static void main(String[] args) {
		int a = 10;
		Integer num = 10;	// 오토 박싱 int -> Integer 
		int n = num;		// 오토 언박싱 Integer -> int
		n = num.intValue();	// 언박싱
		
		// 문자형
		String str1 = "100";
		String str2 = "3.14";
		String str3 = "false";
		
		//byte b = str					// str은 문자형이기 때문에 byte에 넣을 수 없음
		byte b = Byte.parseByte(str1);	// byte를 문자형으로 파싱
		System.out.println(b);
		int i = Integer.parseInt(str1);	// int를 문자형으로 파싱
		System.out.println(i);
		short s = Short.parseShort(str1);
		System.out.println(s);
		long l = Long.parseLong(str1);
		System.out.println(l);
		float f = Float.parseFloat(str1);
		System.out.println(f);
		double d = Double.parseDouble(str1);
		System.out.println(d);
		boolean bool = Boolean.parseBoolean(str1);
		System.out.println(bool);
	}
}
