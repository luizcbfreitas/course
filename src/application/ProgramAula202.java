package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class ProgramAula202 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> emp = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				String email  = fields[1]; 
				Double salary = Double.parseDouble(fields[2]);

				emp.add(new Employee(name, email, salary));

				itemCsv = br.readLine();
			}
			
		   System.out.print("Enter salary:");
		   double filterSalary = sc.nextDouble();
			
		   Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
		   
		   List<String> email = emp.stream()
				   	.filter(e1 -> e1.getSalary() > filterSalary)
				   	.map(p -> p.getEmail()).sorted(comp)
				   	.collect(Collectors.toList());
		   
		   System.out.printf("Email of people whose salary is more than %.2f \n" , filterSalary);
		   email.forEach(System.out::println);
		   
		   double sum = emp.stream()
				   .filter(p -> p.getName().charAt(0) == 'M')
				   .map(p -> p.getSalary())
				   .reduce(0.0, (x,y) -> x + y);
				   
		   System.out.printf("Sum of salary of people whose name starts with 'M' : %.2f ", sum);

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}

}
