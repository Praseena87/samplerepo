package inheritance;

public class MultipleChildClass implements MultipleParent1, MultipleParent2{
	
	public void method3() {
		System.out.println("Method 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChildClass obj= new MultipleChildClass();
		obj.method1();
		obj.method2();
		obj.method3();
		
		MultipleParent1 ref= new MultipleChildClass();
		ref.method1();
		
	}

	
	@Override
	public void method2() {
		System.out.println("method 2");
	}
	
	@Override
	public void method1() {
		System.out.println("Method 1");
	}
}
