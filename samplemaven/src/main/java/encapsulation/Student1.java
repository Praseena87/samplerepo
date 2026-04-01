package encapsulation;

public class Student1 {
	
	private String name;
	private int rollno;
	
	public void getter() {
		System.out.println("Name : " +name);
		System.out.println("Roll no : " +rollno);
		
	}
	
	public void setter(String name, int rollno) {
		
		this.name = name;
		this.rollno=rollno;
		
	}

}
