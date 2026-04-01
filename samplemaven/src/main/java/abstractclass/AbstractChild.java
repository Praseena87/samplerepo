package abstractclass;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj= new AbstractChild();
		obj.display();
		obj.sum();
		obj.print();
	}
	
	public void display() {
		System.out.println("Display abstract method");
	}
	
	public void print() {
		System.out.println("Print Abstract mentod ");
	}

}
