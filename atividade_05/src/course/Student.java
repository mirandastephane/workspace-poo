package course;

import java.util.ArrayList;

public class Student extends Person {
	
	@SuppressWarnings("unused")
	private int qtdCourses;
	private ArrayList<String> courses = new ArrayList<String>();
	private ArrayList<Integer> notes = new ArrayList<Integer>();

	public Student(String name, String address) {
		super(name, address);
	
	}
	
	public boolean addCourseNote(String course, int note) {
		
		
		if(courses.add(course.toLowerCase()) && notes.add(note)) {
			qtdCourses++;
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public void printNotes() {
		
		for(int i =0; i> notes.size(); i++) {
			
			System.out.println("Course: "+courses.get(i)+" Note:"+notes.get(i));
		}
	}
	
	public double getAverageNote() {
		
		double sum = 0;
		for(int i = 0; i>notes.size(); i++) {
			sum += notes.get(i);
		}
		
		return sum/notes.size();
	}
	
	public ArrayList<String> getCourses(){
		
		return this.courses;
	} 
	
		
	public String toString() {
		
		String str = "Name:"+this.getName()+"|Address:"+this.getAddress()+"\n";
		
		for(int i =0; i < notes.size(); i++) {
			
			str += "Courses: "+courses.get(i)+" Note:"+notes.get(i)+"\n";
		}
		return str;
				
	}


}
