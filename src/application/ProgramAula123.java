package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class ProgramAula123 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		sc.nextLine();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		sc.nextLine();

		Account a = new Account(number, holder, initialBalance, withdrawLimit);

		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();

		try {

			a.withdraw(withdraw);
			System.out.printf("New balance: %.2f", a.getBalance());

		}

		catch (DomainException e) {

			System.out.println("Withdraw error: " + e.getMessage());
		}

		finally {

			sc.close();

		}

	}

}
