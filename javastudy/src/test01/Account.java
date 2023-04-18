package test01;

public class Account {
	//필드
	String id;
	String password;
	String ownerName;
	int balance;
	//생성자
	Account(){}
	Account(String id, String password, String ownerName, int balance) {
		this.id = id;
		this.password = password;
		this.ownerName = ownerName;
		this.balance = 0;
	}
	//메서드
	void deposit(int in) {
		balance = balance + in;
	}
	int withdraw(int out, String password) {
		balance = balance - out;
		if(isCorrectPassword(password)) {
			if(balance >= out) {
				balance -= out;
				return -2;
			}
			return balance;
		}else {
			return -1;
		}		
	}
	int checkBalance (String password) {
		if(isCorrectPassword(password)) {
			return balance;
		}else {
			return -1;
		}
	}
	boolean isCorrectPassword(String password) {
		//return this.password.equals(password)?true:false;
		if(this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		//계좌 생성
		Account account = new Account("1111-111-11-1", "1234", "kong", 0);
		//10만원 입금
		account.deposit(100000);
		//잔액 확인
		System.out.println(account.checkBalance("1234"));
		//2만원 출금
		account.withdraw(1000000, "1234");
		//잔액 확인
		System.out.println(account.checkBalance("1234"));
		
	}

}

