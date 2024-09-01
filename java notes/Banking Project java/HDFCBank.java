package day21bankingapp;

import java.util.Scanner;

public class HDFCBank implements BankingService{

	private double balance;
	
	public HDFCBank() {}
	public HDFCBank(double balance)
	{
		this.balance=balance;
	}
	@Override
	public void checkBalance() {
		System.out.println("Current Balance :"+balance);
	}

	@Override
	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw");
		double wAmt=sc.nextDouble();
		if(wAmt<balance)
		{
		balance-=wAmt;
		System.out.println("Withdraw Successfull");
		}
		else
		{
			System.out.println("Insufficeint Funds");
			System.out.println("Withdraw Failed");
		}
	}

	@Override
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to Deposit");
		double dAmt=sc.nextDouble();
		if(dAmt>0)
		{
		balance+=dAmt;
		System.out.println("Deposit Successfull");
		}
		else
		{
			System.out.println("Please Enter valid Amout");
			System.out.println("Deposit Failed");
		}
	}

	@Override
	public void transferFunds() {
		int smsOTP=GenerateOTP.getOTP();
		System.out.println("SMS : "+smsOTP);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter OPT");
		int userOTP=sc.nextInt();
		if(smsOTP==userOTP)
		{
			System.out.println("Please Enter Amount to Transfer");
			double tAmt=sc.nextDouble();
			if(tAmt<balance)
			{
			balance-=tAmt;
			System.out.println("Transfer Successfull");
			}
			else
			{
			System.out.println("Insufficient Funds, Transfer Failed");	
			}
		}
		else
		{
			System.out.println("Invalid OTP");
		}
		
		
	}

}
