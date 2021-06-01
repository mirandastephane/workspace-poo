package course;

import java.util.ArrayList;

public class Teacher extends Person {
	
	@SuppressWarnings("unused")
	private int qtdCourses;
	private ArrayList<String> courses = new ArrayList<String>();
	
	
	public Teacher(String name, String address) {
		super(name, address);
		
	}
	
	public ArrayList<String> getCourses() {
		return this.courses;
	}
	
	
	public boolean addCourse(String course) {
		
		if(courses.add(course.toLowerCase())) {			
			qtdCourses++;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean remmoveCourse(String course) {
		
	  for(int i = 0; i< courses.size(); i++) {
		  
		  if(courses.get(i).compareTo(course.toLowerCase()) == 0) {
			  courses.remove(i);
			  return true;
		  }
	  }
	  return false;
	}
	
	public String toString() {
		
		String str = "Name:"+this.getName()+"|Address:"+this.getAddress()+"\n";
		
		for(int i =0; i < courses.size(); i++) {
			
			str += "Course: "+courses.get(i)+"\n";
		}
		return str;
				
	}

}
