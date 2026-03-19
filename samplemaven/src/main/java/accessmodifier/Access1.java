package accessmodifier;

public class Access1 {
	
	public void display1() {
		System.out.println("This is a Public method");
	}
	
	private void display2(){
		System.out.println("This is a Private method");
		
	}
	
	protected void display3() {
		System.out.println("This is a Protected method ");
	}
	void display4() {
		System.out.println("This is a Default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj= new Access1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}
