package sprinttest;

public class student {
	private String name;
	private Integer marks;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	

}
