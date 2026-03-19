package Polymorphism;

public class Child extends Parent{
	
	public void sum(int a, int b) {
		super.sum(20, 80);
		int sum =a+b;
		System.out.println(sum+" child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj =new Child();
		obj.sum(56, 78);
		

	}

}
