package study03;

public class CompanyRun {
	public static void main(String[] args) {
		// Company cp = new Company();	// private 접근불가
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
		System.out.println(Company.getInstance());
	}
}
