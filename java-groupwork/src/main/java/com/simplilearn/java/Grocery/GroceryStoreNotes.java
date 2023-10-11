package com.simplilearn.java.Grocery;

public class GroceryStoreNotes {

	/*
	 
	============================================

	Homework with your team due next Saturday:
	Finish your sandwich checker!
	Model a Grocery Store:
	At least one, one-to-one relationship
	At least three one-to-many relationships
	At least one one-to-self relationships
	If you can, a many-to-many
	Code this in Java in the ways we demonstrated today.  No logic necessary but it must compile.
	Finally, be creative and go nuts!
	The Eclipse-Hello project where I left modeling examples: https://github.com/billatsimplilearn/eclipseHello  Remember, I work in this, but you need to work in the new java-groupwork project!
	Have a great week!  I look forward to seeing you all again next week (and hopefully my camera will work).
	
	* Don't get too specific. Example: how employee stock the products.
	* Customers buying things in the store.
	* Looking for relationships
	
	Model a Grocery Store: 
	 
	At least one, one-to-one relationships:
		- Product : ProductSku
	
	At least three one-to-many relationships: 
		- Store : Employee
		- Store : Departments
		- Department : Products

	At least one one-to-self relationships:
		- Supervisor : Subordinate
		- ParentCategory : SubCategory
	
	Many-to-many relationships:
		- Departments : Employee
		- Employees : Products
		- Customers : Products
		
	============================================
		
	//  0. Make sure your project is in github and public. DONE
    //  1. Create a class with a meaningful name. DONE
    //  2. Create a main method DONE
    //  3. In main, create a new object of the type declared by your class. We will not be using static methods. DONE
    //  4. Decide the name of the operation you will be doing. 
    //  5. Decide input (names and types). Names must be meaningful and declare intention. DONE
    //  6. Decide output type. 
    //  7. Make the method that you are calling in main() to be public and add your curly braces.
    //  8. Create your tests in main
    //  9. Solve in your method that you have created. Be creative! If you
    // 10. decide to make other methods to call from your method, make these private.
         
	============================================
		
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
*/
}
