package exceptionhandling;

public class customexception {

	public static void main(String[] args)throws VotingException {
		// TODO Auto-generated method stub
		
		int age=9;
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		/*else {
			System.out.println("Not eligible for vote");
		}*/
		else {
			throw new VotingException("Age under 18!!");
		}


	}

}
