package inheritance;

public class HierarchicalChild2 extends HierarchicalParent{
	
	public void print()
	    {
			System.out.println("This is child 2");
	    }

	public static void main(String[] args) {
		HierarchicalChild2 obj =new HierarchicalChild2();
		obj.display();
		obj.print();
		

	}

}
