import java.util.Date;
public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated=null;
	
	public Account(int SpecifiedId, double InitialBalance){
		this.id=SpecifiedId;
		this.balance=InitialBalance;
		
	}
	public int getid(){
		return id;
	}
	public void setid(int id ){
		this.id=id;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public Date getdateCreated(){
		return dateCreated;
	}
	public void setdateCreated(Date dateCreated){
		this.dateCreated=dateCreated;
	}
	public double getMonthlyInterestRate(){
		double MonthlyInterestRate=annualInterestRate/12;
		return MonthlyInterestRate;
	}
	public void withdraw(double withdraw){
		 balance=balance-withdraw;	
	}
	public void deposit(double deposit){
		balance=balance+deposit;
	}

}
