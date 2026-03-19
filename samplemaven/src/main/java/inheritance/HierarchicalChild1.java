package inheritance;

public class HierarchicalChild1 extends HierarchicalParent {
	
	int a=10;
	int b=20;
	int c=a+b;
	public void sum() {
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild1 obj = new HierarchicalChild1();
		obj.display();
		obj.sum();
		
	}

}
