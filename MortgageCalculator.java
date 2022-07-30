package stef.learning;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
	public static void main(String[] args) {
	
		final byte months_in_year=12;
		final byte percent = 100;
			
		Scanner scanner = new Scanner(System.in);
		int principal;
		float annual_interest_rate;
		byte period;
		//printing the requested amount;
		
		while (true) {
		System.out.println("What is the ammount you would like to borrow?");
			principal = scanner.nextInt();
		if (principal>=1000 && principal<=1_000_000) { 
			break;
	    }else {
			System.out.println("Enter a calue between 1000 and 1000000");
			}
	
		}
		//displaying the interest rate;
		while(true) {
			System.out.println("What is the interest rate?");
			annual_interest_rate = scanner.nextFloat();
			if (annual_interest_rate>=0 && annual_interest_rate<=30){
				break;
			}else {
				System.out.println("Enter a calue between 0 and 30");
			}
		
		}
		
		float monthly_interest = annual_interest_rate/percent/months_in_year;
		
		//displaying the period of the contract;
		while (true) {
		System.out.println("What is the mortgage period?");
		period = scanner.nextByte();
		if (period>=10 && period<=48) {
			break;
	    }else {
	    	System.out.println("Enter a calue between 10 and 48");
	    }
		}
		//displaying the monthly installments:
		
		double mortgage = principal *
				(monthly_interest* Math.pow(1+monthly_interest, months_in_year )/
						(Math.pow(monthly_interest-1, months_in_year)));
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		
		System.out.println("monthly payments: "+ mortgageFormatted);
		
		
		
		
		
	
		

	
	}
	
}