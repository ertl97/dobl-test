package de.ertl.model;

import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;

public class Student {
	
	private long number = 001;
	
	private long matrikelnummer;
	private String nachname;
	private String vorname;
	private String address;
	private int postleitzahl;
	private String ort;

	public Student() {
		
	}

	public Student(String nachname, String vorname, String address, int postleitzahl, String ort) {
		super();
		this.matrikelnummer = createMartrikelnummer();
		this.nachname = nachname;
		this.vorname = vorname;
		this.address = address;
		this.postleitzahl = postleitzahl;
		this.ort = ort;
	}

	public long getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer() {
		this.matrikelnummer = createMartrikelnummer();
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public long createMartrikelnummer() {
		GregorianCalendar now = new GregorianCalendar();
		DateTimeFormatter df;
		df = DateTimeFormatter.ofPattern("yy");
		
		long uni = 30;
		long number = this.number + 1;
		
		long martrikelnummer = Integer.parseInt(df+" "+uni+" "+number);
		
		return martrikelnummer;
		
	}
	
	
}
