package study14;

public class Member implements Comparable<Member> {
	Integer memberId;
	String name;
	Integer age;
	Member(int id, String name, int age) {
		this.memberId = id;
		this.name = name;
		this.age = age;
	}
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return memberId.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			return this.memberId == mem.memberId;
		} else {
		return false;
		}
	}
	@Override
	public int compareTo(Member mem) {
		//이름순 정렬 return this.name.compareTo(mem.getName());
		//나이순 정렬 return this.name.compareTo(mem.getName());
		//ID순 정렬 return this.memberId.compareTo(mem.getMemberId());
		//역순 정렬(정렬하고싶은 기준)*(-1)
		return (this.memberId.compareTo(mem.getMemberId()))*(-1);
	}
	
	
}
