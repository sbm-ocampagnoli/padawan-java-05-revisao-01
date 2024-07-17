package br.com.padawan.review.library;

public class Book {
	
	private String title;
	private String author;
	private int year;
	private int pages;

	public Book(String title, String author, int year, int pages) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.pages = pages;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getPages() {
		return this.pages;
	}

	public String getTitle() {
		return this.title;
	}

	public int getYear() {
		return this.year;
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + getTitle() + '\'' + ", author='" + getAuthor() + '\'' + ", year=" + getYear()
				+ ", pages=" + getPages() + '}';
	}

}
