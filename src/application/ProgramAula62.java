package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAula62 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		double initialValue;
		
		if (initialDeposit == 'y'){
			System.out.print("Enter initial deposit value: ");
			initialValue =  sc.nextDouble();
			account  = new Account(accountNumber,holder,initialValue);
		}
		else {
			
			account  = new Account(accountNumber,holder);
		}
		
		System.out.println(account.toString());
		
		System.out.print("Enter a deposit value:");
		account.deposit(sc.nextDouble());
		System.out.print("Updated account data:");
		System.out.println(account.toString());
		
		System.out.print("Enter a withdraw value:");
		account.toWithDraw(sc.nextDouble());
		System.out.print("Updated account data:");
		System.out.println(account.toString());
				
		sc.close();

	}

}
