package br.com.padawan.review.library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	private List<Book> books;

	public Library() {
		this.books = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public List<Book> getBooksPublishedAfter(int year) {
		return books.stream().filter(book -> book.getYear() > year).collect(Collectors.toList());
	}

	@Override
	public String toString() {

		String booksList = "";

		for (Book book : books) {
			booksList += book + "\n";
		}

		return booksList;
	}

}
