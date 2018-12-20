package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class ProgramAula71 {

	public static void main(String[] args) {
		// Exercicio da aula 71

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Room[] rooms = new Room[10];

		System.out.println("How many rooms will be rented?");
		int rented = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <=rented; i++) {

			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			rooms[room] = new Room(name, email);

		}

		System.out.println("Busy rooms: ");

		for (int i = 0; i < rooms.length; i++) {

			if (rooms[i] != null) {

				System.out.println(i + ": " + rooms[i].toString());
			}

		}

		sc.close();
	}

}
