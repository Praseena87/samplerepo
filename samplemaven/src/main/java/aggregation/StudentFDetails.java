package aggregation;

// Class 2-Address Get the address of student Print Student name, roll number with address There is no IS-A relationship
public class StudentFDetails {
	
	String address;
	StudentInfo ref;
	
	public void DisplayStudentInfo(String address,StudentInfo ref) {
		
		this.address=address;
		this.ref=ref;
	}
	
	public void display() {
		System.out.println("Student Information ");
		System.out.println("------------------- ");
		System.out.println("Name       :" +ref.name);
		System.out.println("Roll no    :" +ref.rollno);
		System.out.println("Address    :" +address);
	}

	public static void main(String[] args) {
		
		StudentInfo obj1 = new StudentInfo();
		StudentFDetails obj2=new StudentFDetails();
		obj1.Info("Rekha", 14);
		obj2.DisplayStudentInfo("Waynad,Kerala", obj1);
		obj2.display();
		

	}

}
