package de.ertl.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.ertl.data.StudentsProducer;
import de.ertl.model.Student;

@SessionScoped
@Named
public class ListStudentsController implements Serializable{

	private static final long serialVersionUID = 816865316894654L;
	
	@Inject
	private StudentsProducer studentsProducer;
	
	public String doAddStudent() {
        studentsProducer.prepareAddStudent();
        return Pages.EDIT_STUDENT;
    }
	
    public String doEditStudent(Student student) {
    	studentsProducer.prepareEditStudent(student);
        return Pages.EDIT_STUDENT;
    }
    
    public void doDeleteStudent(Student student) {
        System.out.println("Aktion löschen noch nicht implementiert");
    }
	
}
