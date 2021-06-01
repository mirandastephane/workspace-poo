package atividade_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Client{
	private String name;
	private int age;
	
	ArrayList<Client> Client = new ArrayList<>();
	Scanner call = new Scanner(System.in);

	public Client(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Client() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void updateClient(String name, String newName, int idAge) {
		for (int i = 0; i < Client.size(); i++) {
			if (Client.get(i).getName().equals(name)) {
				Client.get(i).setName(newName);
				Client.get(i).setAge(idAge);
			}
		}
	}

	public void insertClient(String name, int age) {

		Client.add(new Client(name, age));
	}

	public void removeClient() {
		System.out.printf("\n Informe a posição para exclusão:\n");
		int i = call.nextInt();
		try {
			Client.remove(i);
		} catch (IndexOutOfBoundsException e) {
			System.out.printf("\n Erro: posição inválida (%s).", e.getMessage());
			System.out.println(" ");
		}
	}

	public void showClient() {
		for (int i = 0; i < Client.size(); i++) {
			System.out.println("Posição: " + i + "|| Nome: " + Client.get(i).name + "|| Idade: " + Client.get(i).age);
		}
	}

}