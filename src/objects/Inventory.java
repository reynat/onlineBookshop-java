package objects;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
	
	private static Map<Book, Integer> stock = createStock();
	
	private static Map<Book, Integer> createStock() {
		Map<Book, Integer> stock = new HashMap<Book, Integer>();
		Book book1 = new Book("1", "AuthorA", "Book  A", "Syllabus A", 4);
		Book book2 = new Book("2", "AuthorB", "Book B", "Syllabus B", 5);
		Book book3 = new Book("3", "AuthorC", "Book C", "Syllabus C", 6);
		
		return stock;
	}

	public Inventory(Map<Book, Integer> stock) {
		this.stock = stock;
	}

	public static Map<Book, Integer> getStock() {
		return stock;
	}

	public void setStock(Map<Book, Integer> stock) {
		this.stock = stock;
	}

}
