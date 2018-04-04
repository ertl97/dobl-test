package de.ertl.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.ertl.data.StudentListProducer;
import de.ertl.data.StudentsProducer;

@SessionScoped
@Named
public class EditStudentController implements Serializable{

	private static final long serialVersionUID = 284946194616L;
	
	@Inject
	private StudentListProducer studentListProducer;
	
	@Inject
	private StudentsProducer studentProducer;
	
	public String doSave() {
		if (studentProducer.isAddMode()) {
			studentListProducer.getStudents().add(studentProducer.getSelectedStudent());
        }
        return Pages.LIST_STUDENTS;
	}
	
	public String doCancle() {
		return Pages.LIST_STUDENTS;
	}
	
}
