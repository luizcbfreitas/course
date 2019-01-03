package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramAula109 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> product = new ArrayList<>();

		System.out.print("Enter de number of products: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {

			System.out.println("Product #" + i + " data:");
			System.out.print("Common, user or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.next();
			sc.nextLine();
			System.out.print("Price:");
			Double price = sc.nextDouble();

			if (type == 'i') {

				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customsFee));

			} else if (type == 'u') {

				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				product.add(new UsedProduct(name, price, manufactureDate));
			} else {
				product.add(new Product(name, price));
			}

		}

		sc.close();

		System.out.println("PRICE TAGS:");
		for (Product p : product) {
			System.out.println(p.priceTag());

		}

	}

}
