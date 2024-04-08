package com.company;

import java.util.ArrayList;

/* Create a Library Management System which is capable of issuing books to the students
 * Book should  have info like:
 * 1. Book Name
 * 2. Book Author
 * 3. Issued to
 * 4. Issued on
 * User should be able to add books, return issued books, issue books
 * Assume that all the users are registered with their names in the central database
 */
class Book{
	public String name, author, issued_to, issued_on;

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
}
class My_Library{

	public ArrayList<Book> books;

	public My_Library(ArrayList<Book> books) {
		
			this.books= books;
	}
	public void addBook(Book book) {
		this.books.add(book);
	}
	public void issuedBook(Book book, String issued_to) {
		System.out.println("This book is issued from the library issued to "+issued_to);
		this.books.remove(book);
	}

	public void returnBook(Book b) {
		System.out.println("The book has been returned.");
		this.books.add(b);
	}
	
}
public class Program_47 {

	public static void main(String[] args) {

			ArrayList<Book> book = new ArrayList();
			book.add(new Book("Algorithms","CRDS"));
			My_Library l = new My_Library(book);
			l.addBook(new Book("Algorithms","CRS"));
			System.out.println(l.books);
	}

}
