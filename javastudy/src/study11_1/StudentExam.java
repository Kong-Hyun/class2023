package study11_1;

class Student{
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	//object equals() 학번이 같으면 같은 학생 
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		if(studentNum.equals(stu.studentNum)) {
			return true;
		}
		return false;	
	}
	
	//hashcode() 학생의 학번의 해쉬코드 반환
	public int hashCode() {
		return studentNum.hashCode();
	}
	
}




public class StudentExam{
	
	public static void sameStudent(Student a, Student b) {
		if(a.equals(b)) {
			System.out.println("같은 학생이다.");
		}else {
			System.out.println("다른 학생이다.");
		}
		System.out.println(a.hashCode() + " " +b.hashCode());
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("100");
		Student s2 = new Student("200");
		Student s3 = new Student("100");
		sameStudent(s1, s2);
		sameStudent(s1, s3);
		
		
	}
	
}


