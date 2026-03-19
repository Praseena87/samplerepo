package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	
	public void SuperConstructorChild() {
		super.SuperConstructorParent();
		
		System.out.println("This is Child ");
	}

	public static void main(String[] args) {
		
		SuperConstructorChild obj = new SuperConstructorChild();
		obj.SuperConstructorChild();

	}

}
