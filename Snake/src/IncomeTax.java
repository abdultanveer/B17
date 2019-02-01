
public class IncomeTax {
	int salary;
	
	public int calculateTax() {
		return salary/10;
	}
	
	public int calculateTax(int luxurySpending) {
		
		return salary/10+ luxurySpending/10;
	}

}
