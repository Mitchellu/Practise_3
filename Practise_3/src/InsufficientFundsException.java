
public class InsufficientFundsException {

	private double amount;
	public InsufficientFundsException(double amount){
		this.amount=amount;
		
	}
	public double final_amount(){
		return amount;
	}
	
	
}
