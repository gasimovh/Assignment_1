package models;

import java.util.Date;

public class Doctor extends Person{
	
	//delete
	//delete1
	private String license;
	private String field;
	
	public Patient(String name, String phone, String birthday, String bloodType, String license, String field){
		super(name, phone, birthday, bloodType);
		this.license = license;
		this.field = field;
	}
	
	
	//fuck
	//SETTERS AND GETTERS
	public String setLicense(String license){
		this.license = license;
	}
	
	public String getLicense(){
		return license;
	}
	
	public String setField(String field){
		this.field = field;
	}
	
	public String getField(){
		return field;
	}
	
	@Override
	public String toString(){
		return  "Name: " + name + "\n" + 
				"Phone number: " + phone + "\n" +
				"Date of Birth: " + birthday.toString() + "\n" + 
				"Type of Blood: " + bloodType + "\n" +
				"License of the doctor: " + license + "\n" +
				"Speciality of the doctor: " + field + "\n";
	}
}
