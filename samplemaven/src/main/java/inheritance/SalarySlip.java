package inheritance;

public class SalarySlip extends SalaryCalculation{
	
	    double totalSalary;

	    public void generateSlip() {
	        totalSalary = basicpay+hra-pf-deduction+bonus;

	        System.out.println("Basic Pay   : " + basicpay);
	        System.out.println("HRA (5%)    : " + hra);
	        System.out.println("PF (20%)    : " + pf);
	        System.out.println("Deduction   : " + deduction);
	        System.out.println("Bonus       : " + bonus);
	        System.out.println("Total Salary: " + totalSalary);
	    }

}
