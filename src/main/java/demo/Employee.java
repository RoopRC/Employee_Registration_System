package demo;

public class Employee {

	private int id;
	private String name;
	private String email;
	private String address;
	private String department;
	//private int age;
	
	public Employee() {
		
	}
	
	public Employee( String name, String email, String address, String department) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.department = department;
		//this.age = age;
	}
	
	public Employee(int id, String name, String email, String address, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.department = department;
		//this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", department="
				+ department +  ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getAddress()=" + getAddress() + ", getDepartment()=" + getDepartment() + 
				", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
