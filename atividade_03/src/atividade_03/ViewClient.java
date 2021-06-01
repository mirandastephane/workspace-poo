package atividade_03;

import java.util.Scanner;

import atividade_03.Client;

public class ViewClient {

	public static void main(String[] args) {

		Client cli = new Client();
		Scanner read = new Scanner(System.in);

		System.out.println("***** Bem Vindo ao Sistema de Cadastro de Clientes *****");

		int option = 0;

		while (option != 5) {
			System.out.println(
					" 1 - Cadastrar Cliente\n 2 - Apagar Cliente\n 3 - Modificar Cliente\n 4 - Listar Clientes\n 5 - Sair\n Escolha uma opção:");
			option = read.nextInt();
			switch (option) {
			case 1:
				System.out.println("Informe o nome do cliente: ");
				String name = read.next();
				System.out.println("Informe a idade do cliente: ");
				int age = read.nextInt();
				cli.insertClient(name, age);
				break;
			case 2:
				cli.showClient();
				cli.removeClient();
				break;
			case 3:
				System.out.println("Informe o nome do cliente: ");
				String name1 = read.next();
				System.out.println("Informe o novo nome do cliente: ");
				String name2 = read.next();
				System.out.println("Informe a nova idade do cliente: ");
				int idNew = read.nextInt();
				cli.updateClient(name1, name2, idNew);
				break;
			case 4:
				cli.showClient();
				break;
			case 5:
				System.out.println("Sessão do sistema de cadastro foi encerrada com sucesso");
			}

		}
	}

}