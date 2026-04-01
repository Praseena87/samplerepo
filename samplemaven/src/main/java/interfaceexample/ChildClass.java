package interfaceexample;

public class ChildClass implements ParentInterface {
	
	public void sum () {
		
		System.out.println("Sum");
		
	}
	
	@Override
	
	public void display() {
		System.out.println("Display interface");
	}
	
	@Override
	
	public void print() {
		System.out.println("Print interface");
	}

	public static void main(String[] args) {
		/*ChildClass obj = new ChildClass();
		obj.display();
		obj.print();
		obj.sum();*/
		
		//reference creation
		ParentInterface ref= new ChildClass();	
		ref.print();
		ref.display();

	}

}
