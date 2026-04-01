package inheritance;

public class SalaryCalculation extends Employee{
	
	    double hra, pf;

	    public void calculate() {
	        hra = 0.05 * basicpay;   
	        pf = 0.20 * basicpay;    
	    
	}

}
