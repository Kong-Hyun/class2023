package project;

public class Child {
	String name;
	String id;
	String parentName;
	String phone;
	
	Child (String name, String id, String parentName, String phone) {
		this.name = name;
		this.id = id;
		this.parentName = parentName;
		this.phone = phone;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
