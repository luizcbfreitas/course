package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

import model.entities.Student;

public class ProgramAula187 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Set<Student> a = new HashSet<>();

		System.out.print("How many students for course A ?");
		int qtdA = sc.nextInt();

		for (int i = 1; i <= qtdA; i++) {

			a.add(new Student(sc.nextInt()));

		}

		Set<Student> b = new HashSet<>();

		System.out.print("How many students for course B ?");
		int qtdB = sc.nextInt();

		for (int i = 1; i <= qtdB; i++) {

			b.add(new Student(sc.nextInt()));

		}

		Set<Student> c = new HashSet<>();

		System.out.print("How many students for course C ?");
		int qtdC = sc.nextInt();

		for (int i = 1; i <= qtdC; i++) {

			c.add(new Student(sc.nextInt()));

		}
		
		Set<Student> d = new HashSet<>(a);
		d.addAll(b);
		d.addAll(c);
		
		System.out.print("Total Students: " + d.size());
		
		sc.close();

	}

}
