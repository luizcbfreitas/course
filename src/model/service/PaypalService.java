package model.service;

public class PaypalService implements CalculateInstallment {

	public double installmentValueOfService(double amount, int quote) {

		final double FEE_PERCENTAGE = 0.02;
		final double MONTHLY_INTEREST = 0.01;
		
		double total = 0.00;

		total = amount * MONTHLY_INTEREST * quote + amount;
		
		total += total * FEE_PERCENTAGE; 

		return total; 

	}

}
