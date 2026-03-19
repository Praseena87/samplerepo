package inheritance;

public class MultilevelChild extends MultilevelParent {
	
	public void show() {
		System.out.println("This is child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultilevelChild obj = new MultilevelChild();
		obj.display();
		obj.print();
		
	}

}
