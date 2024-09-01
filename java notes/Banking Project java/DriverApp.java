package day21bankingapp;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		
		HDFCBank bank=new HDFCBank(5000);
		Customer customers[]=new Customer[3];
		customers[0]=new Customer("alice","alice123");
		customers[1]=new Customer("ben","ben123");
		customers[2]=new Customer("chris","chris123");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");	//alice
		String uname=sc.next();
		System.out.println("Enter Password");  //alice123
		String pwd=sc.next();
		boolean authenticateUser=false;
		for(Customer c:customers)
		{
			if(c.getUsername().equals(uname) && c.getPassword().equals(pwd))
			{
				authenticateUser=true;
				break;
			}
		}
		
		if(authenticateUser)
		{
			int choice;
			System.out.println("Welcome,"+uname);
			do
			{
			System.out.println("****** Banking Menu******");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Funds Transfer");
			System.out.println("5. Exit");
			System.out.println("Enter Choice");	//
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: bank.checkBalance();
			break;
			case 2: bank.deposit();
			break;
			case 3: bank.withdraw();
			break;
			case 4: bank.transferFunds();
			break;
			case 5: System.out.println("Thank you!!!"); System.exit(0);
			break;
			}
			}while(choice!=5);
		}
		else
		{
			throw new InvalidCredentialException("Invalid Credentials");
		}

	}

}
