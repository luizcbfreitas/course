package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversionCurrency;


public class Program {

	public static void main(String[] args) {
		// Aula 53
		
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is dollar price?");
		double dolarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dolarBought = sc.nextDouble();
		
		System.out.print("Amount to be paid in reais = " + ConversionCurrency.convertCurrency(dolarPrice, dolarBought));
		
		
		sc.close();

	}

}
