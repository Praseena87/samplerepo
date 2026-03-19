package superkeyword;

public class SuperVariableChild extends SuperVariableParent {

	String color="Blue";
	
	public void display() {
		
		System.out.println(color);
		
	}
	public static void main(String[] args) {
		
		SuperVariableChild obj= new SuperVariableChild();
		obj.display();
	}


}
