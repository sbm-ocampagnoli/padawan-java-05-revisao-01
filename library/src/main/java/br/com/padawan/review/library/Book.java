package br.com.padawan.review.library;

public class Book {
	private String title;
	private String author;
	private int year;
	private int pages;

	public String getAuthor() {
		return this.author;
	}

	public int getPages() {
		return this.pages;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", year=" + year + ", pages=" + pages
				+ '}';
	}

}
