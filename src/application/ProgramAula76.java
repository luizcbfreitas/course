package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramAula76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		List<Employee> employees = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered?");
		int registered = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= registered; i++) {

			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();

			employees.add(new Employee(id,name,salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
				System.out.println();
				System.out.print("Enter the employee id that will have salary increase: ");
				int id = sc.nextInt();
				Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if (emp == null) {
					System.out.println("This id does not exist!");
				}
				else {
					System.out.print("Enter the percentage: ");
					double percentage = sc.nextDouble();
					emp.increaseSalary(percentage);
				}
		
		

		System.out.println("List of employees: ");

		for (Employee e : employees) {
			
			System.out.println(e);

		}

		sc.close();

	}

}
