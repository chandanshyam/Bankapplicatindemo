package bankaccountapp;

public class Savings extends Account{
	private int Depositboxid;
	private int safetydepositboxkey;

	 public Savings(String name,String Ssn, double initialbalance) 
	 {
		 super(name,Ssn,initialbalance);
		 accountnumber = "1" +accountnumber;
		 Depositboxid = (int)(Math.random()*Math.pow(10, 3));
	     safetydepositboxkey = (int)(Math.random()*Math.pow(10, 4));
		
		
	 }
	 @Override
	 public void setRate()
	 {
		 rate =getBaseRate()-.25;
	 }
	 public void Showinfo()
	 {
		 super.Showinfo();
		 System.out.println("Savings account");
		  System.out.println("Your Savings Account Feature: " +   
		 "\n your SafetyDepositboxid: "+ Depositboxid +"\n Depositboxkey: " + safetydepositboxkey);
	 }
	 // private void SetSafetyDepositBox()
	  //{
		// Depositboxid = (int)(Math.random()*Math.pow(10, 3));
	     //safetydepositboxkey = (int)(Math.random()*Math.pow(10, 4));
		
		  

	  //}

}
