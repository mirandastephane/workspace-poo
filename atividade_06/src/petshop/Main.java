package petshop;

public class Main {
	
	public static void main(String[] args) {

		Animal animal = new Animal ("Preta");
	
		System.out.println(animal.getBreed());
		animal.vaccinated();
		System.out.println(animal.toString());
		System.out.println("Vacina:" + animal.getType());
		System.out.println(animal.getDate());
		System.out.println("Veterinária: " + animal.getVeterinary());
}

}
