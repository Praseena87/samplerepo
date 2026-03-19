package aggregation;

public class Aggregation2 {
	
	String city, state;
	Aggregation1 ref;
	public Aggregation2(String city, String state, Aggregation1 ref) {
		
		this.city=city;
		this.state=state;
		this.ref=ref;	
		
	}

	public void display() {
		System.out.println(ref.name+" "+ref.rollno+" "+ref.address);
		System.out.println(city+" "+ state);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj1= new Aggregation1("Maya",10,"abcde");
		Aggregation2 obj= new Aggregation2("Kozhikode","Kerala",obj1);
		obj.display();
		

	}

}
