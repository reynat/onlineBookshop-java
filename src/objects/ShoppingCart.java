package objects;

import java.util.Map;

public class ShoppingCart {
	
	private Map<Book, Integer> bookCopies;
	
	public ShoppingCart(Map<Book, Integer> bookCopies) {
		this.bookCopies = bookCopies;
	}

	public Map<Book, Integer> getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(Map<Book, Integer> bookCopies) {
		this.bookCopies = bookCopies;
	}
	
	/**
	 * Assumes that only one copy of a book is always added to the shopping cart.
	 * @param newBook
	 */
	public void addBook(Book newBook) {
		this.bookCopies.put(newBook, 1);
	}
}
