package com.simplilearn.java.Grocery;

public class GroceryStore {


	//Homework / Classwork due next Saturday:
	//Model a Grocery Store: Store name (Walmart), Department (produce), Workforce (employees), product (apple)
	//At least one, one-to-one relationship: Store name (Walmart), product (apple) 
	//At least three one-to-many relationships: 
	Store name (Walmart), Department (produce), Department (produce) Department (produce)
	Department (produce), Product (Apple), Product (Orange), Product (Banana)
	Department (Produce), Department (Electronics), Department (Appliances),
	Store name, Employee  


	public class Author {
	private String name;
	private List<Book> books;

	public Author(String name) {
	    this.name = name;
	    this.books = new ArrayList<>();
	}

	public void addBook(Book book) {
	    books.add(book);
	    book.setAuthor(this);
	}

	// Getters and setters
	// ...
	}

	public class Book {
	private String title;
	private Author author;

	public Book(String title) {
	    this.title = title;
	}

	public void setAuthor(Author author) {
	    this.author = author;
	}
	//At least one one-to-self relationships
	Appliance 
	//If you can, a many-to-many
	//Code this in Java in the ways we demonstrated today.  No logic necessary but it must compile.
	//Finally, be creative and go nuts!
}
}
