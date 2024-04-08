package com.company;


class Library{
	String[] books;
	int no_of_books;
	public Library() {
		// Constructor
		this.books = new String [100];
		this.no_of_books = 0;
	}
	void add_Book(String book) {
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book+" has been added");
	}
	void showAvailableBooks() {
		System.out.println("Available Books are: ");
		for (String book : this.books) {
			if(book==null)continue;
			System.out.println("*" + book);
		}

	}
	void issueBook(String book) {
		for (int i=0;i<books.length;i++) {
			if(this.books[i].equals(book)) 
			{
				System.out.println("The book has been issued");
				this.books[i] = null;
				return;
			}
		}
		System.out.println("The book does not exist in Library");
	}
	void returnBook(String book) {
		add_Book(book);
	}
}
/**
 * @author Riya
 *
 */
public class Program_40 {

	public static void main(String[] args) {
		// Online Library Management System
		Library centralLibrary = new Library();

		centralLibrary.add_Book("Think and Grow Rich");
		centralLibrary.add_Book("C++");
		centralLibrary.add_Book("Algorithms");
		centralLibrary.add_Book("Data Structure");

		centralLibrary.showAvailableBooks();

		centralLibrary.issueBook("C++");
		
		centralLibrary.showAvailableBooks();
		
		centralLibrary.returnBook("C++");
		
		centralLibrary.showAvailableBooks();

	}

}
