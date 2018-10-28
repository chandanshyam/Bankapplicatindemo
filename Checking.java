package bankaccountapp;

public class Checking extends Account{
	private int debitcardnumber;
	private int debitcardpin;
	
	
	
	
	public  Checking(String name,String Ssn, double initialbalance)
	{
		 super(name,Ssn,initialbalance);
		 accountnumber = "2" +accountnumber;

		 debitcardnumber = (int)(Math.random()*Math.pow(10,12));
		 debitcardpin =(int)(Math.random()*Math.pow(10, 4));
		
	}
	 @Override
	 public void setRate()
	 {
		 rate =getBaseRate()*.15;
	 }
	 public void Showinfo()
	 {
		 super.Showinfo();
		 System.out.println("Checkings Account");
		 System.out.println("Your Checking Account Feature: " +   
				 "\n your Debitcardnumber: "+ debitcardnumber +"\n debitcardpin: " + debitcardpin);
			 }
	 }


