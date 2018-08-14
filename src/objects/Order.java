package objects;

import java.util.UUID;
import java.util.Map;

public class Order {
	private UUID id;
	private Map<Book, Integer> bookCopies;
	private int totalPrice;
	private Customer customer;
	
	public Order(Map<Book, Integer> bookCopies, Customer customer) {
		this.id = UUID.randomUUID();
		this.bookCopies = bookCopies;
		this.customer = customer;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Map<Book, Integer> getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(Map<Book, Integer> bookCopies) {
		this.bookCopies = bookCopies;
	}
	
	public Customer getOrderedBy() {
		return customer;
	}
	
	public void setOrderedBy(Customer customer) {
		this.customer = customer;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}
