package de.ertl.data;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import de.ertl.model.Student;



@SessionScoped
@Named
public class StudentsProducer implements Serializable{

	public static final long serialVersionUID = -444984266796468L;
	
    private enum Mode {
        EDIT, ADD
    }
    
    private Student student;
    private Mode mode;
    
    public Student getSelectedStudent() {
    	return student;
    }
    
    public void setSelectedStudent(Student student) {
    	this.student = student;
    }
    
    public boolean isAddMode() {
    	return mode == Mode.ADD;
    }
    
    public void prepareAddStudent() {
    	this.student = new Student();
    	this.mode = Mode.ADD;
    }
    
    public void prepareEditStudent(Student student) {
    	this.student = student;
    	this.mode = Mode.EDIT;
    }
	
}
