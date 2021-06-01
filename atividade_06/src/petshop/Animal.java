package petshop;

public class Animal implements Vaccine, Guardian, Breed {
	
	private boolean vaccinated;
	private String breed; 
	private String date;
	
	
	
	public Animal(String breed) {
		this.setVaccinated(false);
		this.setBreed(breed);
	}
	
		
	@Override
	public String getType() {
		return "Antirábica";
	}

	@Override
	public void vaccinated() {
		System.out.println("Animal Vacinado");
		this.setVaccinated(true);
	}

	@Override
	public String getName() {
		return "Stephane Miranda";
	}

	@Override
	public String getAge(){
		return "28";
	}

	@Override
	public String getVeterinary() {
		return "Dra. Sheila Melo";
	}

	@Override
	public String getDate() {
		return date;
	}

	public boolean getVaccinated() {		animal.vaccinated();
	System
		return vaccinated;
	}

	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	


	@Override
	public String toString() {
		return "Animal [vaccinated=" + vaccinated + ", breed=" + breed
				+ ", Date=" + date +"]";
	}

}
