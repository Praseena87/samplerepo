package superkeyword;

public class DivisiblebyTen extends NumbersSum{
	
	public void DivisibleTen() {
		int num= super.Sum(238,450);
		if(num%10==0) {
			System.out.println("The addition result is divisible by 10");
		}
		else {
			System.out.println("The addition result is not divisible by 10");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisiblebyTen obj = new DivisiblebyTen();
		obj.DivisibleTen();
		
	}

}
