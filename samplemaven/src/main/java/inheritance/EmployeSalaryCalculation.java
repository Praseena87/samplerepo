package inheritance;

public class EmployeSalaryCalculation extends SalarySlip{

	public static void main(String[] args) {
		
		EmployeSalaryCalculation obj = new EmployeSalaryCalculation();
		obj.SalaryInfo();
		obj.calculate();
		obj.generateSlip();
	}

}
