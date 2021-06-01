package atividade_01;

import java.util.Scanner;

public class Test {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		System.out.println("Qual o name do Author 1?");
		String name = in.next();

		System.out.println("Qual o Email do Author?");
		String email = in.next();

		System.out.println("Qual o Gênero do Author?");
		char gender = in.next().charAt(0);

		Author author1 = new Author(name, email, gender);

		System.out.println("Qual o name do Author 2?");
		String name2 = in.next();

		System.out.println("Qual o Email do Author 2?");
		String email2 = in.next();

		System.out.println("Qual o Gênero do Author 2?");
		char gender2 = in.next().charAt(0);

		Author author2 = new Author(name2, email2, gender2);

		System.out.println("Qual é o Nome do Livro 1?");
		String bookName = in.next();

		System.out.println("Qual é o Preço Livro 1?");
		double bookEmail = in.nextDouble();

		System.out.println("Qual é a Quantidade em Estoque do Livro 1?");
		int bookQty = in.nextInt();

		Book book1 = new Book(bookName, author1, bookEmail, bookQty);

		System.out.println("Qual é o Nome do Livro 2?");
		String bookName2 = in.next();

		System.out.println("Qual é o Preço Livro 2?");
		double bookPrice2 = in.nextDouble();

		System.out.println("Qual é a Quantidade em Estoque do Livro 2?");
		int bookQty2 = in.nextInt();

		Book book2 = new Book(bookName2, author2, bookPrice2, bookQty2);

		System.out.println(author1.toString());

		System.out.println(author2.toString());

		System.out.println(book1.toString());

		System.out.println(book2.toString());

	}

}