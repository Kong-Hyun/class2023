package study04;

public class StringBufferRun {
	public static void main(String[] Args) {
		StringBuffer sb1 = new StringBuffer("가나다");
		StringBuffer sb2 = new StringBuffer("가나다");
		StringBuffer sb3 = new StringBuffer("abc");
		
		System.out.println(sb1.equals(sb2));
		String str1 = sb1.toString();
		String str2 = sb2.toString();
		System.out.println(str1.equals(str2)+"\n");
		
		//append String 이후에 값 추가
		sb1.append(false);
		sb2.append(12.3);
		sb3.append("def");
		System.out.println(sb1);
		System.out.println(sb1.toString());
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3)+"\n");
		
		//insert 해당 위치 문자 추가
		sb1.insert(3, "라마바사");
		System.out.println(sb1.toString()+"\n");
		
		//delete 처음 위치부터 뒤에 위치까지 문자 삭제
		sb1.delete(7, 12);
		System.out.println(sb1.toString());
		System.out.println(sb1.indexOf("라"));
		System.out.println(sb1+"\n");
		
		//subSrting() 부분남기기
		sb1.substring(2,3);
		//System.out.println(sb1.substring(1,4));
		System.out.println(sb1+"\n");
		
		//replace()교체
		sb1.replace(1, 4, "지마");
		//System.out.println(sb1.replace(1, 4, "지마"));
		System.out.println(sb1+"\n");
		
		//reverse()뒤집기
		sb1.reverse();
		//System.out.println(sb1.reverse());
		System.out.println(sb1+"\n");
	
	}

}
