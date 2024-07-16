package br.com.padawan.review.library;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Library library = new Library();

		Book book01 = new Book("Para de Jogar seu Dinheiro Fora", "Desconhecido", 2020, 200);
		Book book02 = new Book("Titulo Aleatorio", "Autor", 2023, 182);
		System.out.println(book01.toString());

		library.addBook(book01);
		library.addBook(book02);

		List<Book> listaPorAnoDePublicacao = library.getBooksPublishedAfter(2023);
		
		System.out.println(library);
		
		System.out.println("Livros Por ano:" + listaPorAnoDePublicacao);
		
		
	}

}
