package course;

import java.util.ArrayList;

public abstract class Person {
	
	private String name;
	private String address;
	
	public  Person (String name, String address) {
		this.name = name;
		this.address = address;
	}

	public  String getName() {
		return this.name;
	};

	public  String getAddress() {
		return this.address;
	}

	public String toString() {
		String str = "Name:"+this.getName()+"|Address:"+this.getAddress()+"\n";
		return str;
	};
	
	public abstract ArrayList<String> getCourses();

}
