package course;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Person> people = new ArrayList<Person>();
		
			Student student01 = new Student("Felipe", "Av. Boa Viagem");
			student01.addCourseNote("Redes de Computadores", 9);
			student01.addCourseNote("Programação", 6);
			
			Student student02 = new Student("Joana", "Av. Navegantes");
			student02.addCourseNote("Qualidade de Software", 8);
			student02.addCourseNote("Gestão de Projetos", 9);
			student02.addCourseNote("Programação", 9);
			
			Student student03 = new Student("Aline", "Av. Conselheiro Aguiar");
			student03.addCourseNote("Qualidade de Software", 10);
			student03.addCourseNote("Redes de Computadores", 9);
			student03.addCourseNote("Programação", 9);
			student03.addCourseNote("Gestão de Projetos", 10);
			people.add(student01);
			people.add(student02);
			people.add(student03);

			Teacher  teacher01 = new Teacher("Diego", "Av. Antônio Falcão");
			teacher01.addCourse("Redes de Computadores");
			teacher01.addCourse("Gestão de Projetos");
			
			Teacher teacher02 = new Teacher("Isabelle", "R. Félix de Brito e Melo");
			teacher02.addCourse("Programação");
			teacher02.addCourse("Qualidade de Software");
			
			people.add(teacher01);
			people.add(teacher02);
			
	
			for(int i = 0; i<people.size(); i++) {
				String str = people.get(i).toString();
				System.out.println(str);
			}
			
			String test = peopleData(people);
			System.out.println(test);
	}
	
	private static String peopleData(ArrayList<Person> people) {
		
		Teacher teacher = new Teacher(null, null);
		Student student = new Student(null, null);
		String str = "";
		
			
			for(int i = 0; i< people.size(); i++) {
					
				 if(teacher.getClass() == people.get(i).getClass()) {
					 Teacher instructor = (Teacher) people.get(i);
					 
					 for(int a = 0; a < instructor.getCourses().size(); a++) {
						str += "Course: "+ instructor.getCourses().get(a)+"\n";
						str += "Teacher: " + instructor.getName()+"\n";
						str += "Students: \n";
								
							for(int b = 0; b < people.size(); b++) {
								
								if(student.getClass() == people.get(b).getClass()) {
									Student academic = (Student) people.get(b);
									
									for(int c = 0; c < academic.getCourses().size(); c++) {
										
										if(academic.getCourses().get(c).equals(instructor.getCourses().get(c))) {
											str += academic.getName()+"\n";
										}
									}
								}
							}
							str +="------------------------- \n";
					 }
				 }
			}
			
			return str;
	}

}
