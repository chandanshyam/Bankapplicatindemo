package bankaccountapp;

public abstract class Account implements IBaseRate  {
	String name;
	String Ssn;
	double balance;
	String accountbalance;
	 protected double rate;
	static int  index =60000;
	protected String accountnumber;	
	//double amount;
	
	
	public abstract void setRate();
	
	public Account(String name,String Ssn,double initialbalance)
	{
		this.name=name;
		this.Ssn = Ssn;
		balance = initialbalance;
		
		
		
		index++;
	 this.accountnumber = SetAccountNumber();
	 
	 setRate();
	}
	
	
	private String SetAccountNumber() {
		String last2 = Ssn.substring(Ssn.length()-2,Ssn.length());
		int uniqueid =index;
	   int randomnum = (int)( Math.random()*Math.pow(10,3));
		return last2+uniqueid+randomnum;
	}
	 public void deposit(double amount)
	 {
		 balance = balance +amount;
		 System.out.println("depositing an amount of : "+ amount);
		 printbalance();
	 }
	 public void withdraw(double amount)
	 {
		 balance = balance - amount;
		 System.out.println("withdrawing an amount of : "+ amount);
		 printbalance();
	 }
	  public void printbalance()
	  {
		  System.out.println("your balance is : "+ balance);
	  }
	 public void transfer(String towhere,double amount)
	 {
		 System.out.println("transferring amount: "+ amount + "to this account: " + towhere);
		 printbalance();
	 }
	  public void compoundinterest()
	  {
		  double acquiredinterest = balance *(rate/100);
		  System.out.println("the acquires interest is: " +acquiredinterest);
		  balance = balance+acquiredinterest;
		  printbalance();
	  }
	
	public void Showinfo()
	{
		System.out.println("Name is : "+ name + "\nAcoount number: " +this.accountnumber + "\nBalance: " +
	balance + "\n rate: " + rate);
	}
	
}
