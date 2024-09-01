package day21bankingapp;

public class GenerateOTP {

	public static int getOTP()
	{
		return (int)(Math.random()*9000+100000);
	}
}
