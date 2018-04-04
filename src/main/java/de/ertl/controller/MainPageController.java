package de.ertl.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@SessionScoped
@Named
public class MainPageController implements Serializable{

	private static final long serialVersionUID = 284946194616L;
	
	public String doListStudents() {
		return Pages.LIST_STUDENTS;
	}
	
	public String doAddStudents() {
		return Pages.EDIT_STUDENT;
	}
	
}
