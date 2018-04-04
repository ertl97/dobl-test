package de.ertl.data;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.ertl.model.Student;

@SessionScoped
@Named
public class StudentListProducer implements Serializable{
	
	public static final long serialVersionUID = -19849464684194L;
	private List<Student> students;
	
	public StudentListProducer() {
		students = createMockStudents();
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public List<Student> createMockStudents(){
			
			Student studetn1 = new Student("Mustermann", "Max", "Renstraße", 6460, "Imst");
			Student studetn2 = new Student("Staller", "Hubert", "Schneckenstraße", 6548, "Landeck");
			
			
		 	List<Student> ret = new LinkedList<>();
	        ret.add(studetn1);
	        ret.add(studetn2);
	        return ret;
	}
}
