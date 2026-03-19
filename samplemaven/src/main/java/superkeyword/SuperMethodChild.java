package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	
	public void display() {
		super.sum();
		System.out.println("This is child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethodChild obj= new SuperMethodChild();
		obj.display();
		
		//obj.sum();	
	}

}
