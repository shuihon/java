package polymorphic;

import java.util.Arrays;
import java.util.Comparator;

public class Arraysort_ {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Book[] books = new Book[4];
		books[0] = new Book("红楼梦", 199.8);
		books[1] = new Book("g", 90);
		books[2] = new Book("bob", 4930);
		books[3] = new Book("justin", 23);
//		books[0] = new Book("红楼梦");
//		books[1] = new Book("g");
//		books[2] = new Book("bob");
//		books[3] = new Book("justin");
		Arrays.sort(books, new Comparator() {
			public int compare(Object o1, Object o2) {
				Book book1 = (Book) o1;
				Book book2 = (Book) o2;
				return book1.getName().length() - book2.getName().length();
			}
		});
		System.out.println(Arrays.toString(books) + "\n");
		Arrays.sort(books, new Comparator() {
			public int compare(Object o1, Object o2) {
				Book book1 = (Book) o1;
				Book book2 = (Book) o2;
				double pricedifference = book2.getPrice() - book1.getPrice();
				if (pricedifference > 0) {
					return 1;
				} else if (pricedifference < 0) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		int i = 0;
		for (i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
//		System.out.println(Arrays.toString(books));
	}
}

class Book {
	private String name;

	private double price;

//	public Book(String name) {
//		this.name = name;
//	}
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + "的价格是：" + price;

	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}