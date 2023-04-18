package study16;

class NoExistIDException extends Exception {
	public NoExistIDException() {}
	public NoExistIDException(String message) {
		super(message);
	}
}

class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}

public class LoginPrac {
	static void login(String id, String pw) throws Exception {
		String[] idArr = {"ajax", "java", "scipt", "css"};
		String[] pwArr = {"1234", "3424", "2345", "3456"};
		int index = -1;
		for(int i=0; i<idArr.length; i++) {
			//아이디체크
			if(idArr[i].equals(id)) {
				index = i;
			}
		}
		if(index<0) {
			throw new NoExistIDException("아이디가 존재하지 않습니다.");
		}else if (!pwArr[index].equals(pw)) {
			throw new WrongPasswordException("암호가 틀립니다.");
		}else {
			System.out.println("로그인 완료.");
		}
	}
	static void login2(String id, String pw) throws Exception {
		
	}
	
	public static void main(String[] args) {
		try {
			login("apple", "1234");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("java", "2345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("css", "3456");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
