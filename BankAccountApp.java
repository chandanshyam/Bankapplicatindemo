package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List <Account> accounts = new LinkedList<Account>();
		 String file = "C:\\Users\\cjshy\\Desktop\\NewBankAccounts.csv";
		/*Checking c1 = new Checking("sala","23256465",500);	

	    Savings  s1 = new Savings("M.sala","2356465",500);	
	    s1.Showinfo();
	    c1.Showinfo();
s1.deposit(1000);
s1.compoundinterest();
	}*/
 List<String[]> newaccountholder = utilities.CSV.read(file);
 for (String[] newaccount: newaccountholder)
	 {  
	 
	 String name = newaccount[0];
	 String Ssn = newaccount[1];
	 String accountType =newaccount[2];
	double initialbalance= Double.parseDouble(newaccount[3]);
	if(accountType.equals("Savings"))
	{
		accounts.add(new Savings(name,Ssn,initialbalance));
		
	}
	else if(accountType.equals("Checking"))
		
	{
		accounts.add(new Checking(name,Ssn,initialbalance));
	}
	else
	{
		System.out.println("Error in account type");
	}
	 }
	for(Account acc: accounts)
		
	{
		System.out.println("********\n");
		acc.Showinfo();
	 }
	 }
	 }
