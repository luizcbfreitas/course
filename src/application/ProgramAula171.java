package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.service.PaymentService;
import model.service.PaypalService;

public class ProgramAula171 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int contractNumber = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date contractDate = sdf.parse(sc.next());
		System.out.print("Constract Value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();
		
		Contract c = new Contract(contractNumber, contractDate, contractValue);
		
		PaymentService ps = new PaymentService(installments, new PaypalService());
		
		ps.processInstallment(c);
		
		System.out.println("Installments:");
		
		System.out.print(c);
		
		sc.close();

	}

}
