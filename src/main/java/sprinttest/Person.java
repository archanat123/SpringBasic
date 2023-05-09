package sprinttest;

public class Person {
	
	 private String pname;
	 private int age;
	 public Person()
	 {
		 System.out.println("Person.Person()");
	 }
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + "]";
	}
	
	 

}
