package models;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Person{
		
	private String name;
	private String phone;
	private Date birthday;
	private String bloodType;
	
	private SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy");
	
	public Person(String name, String phone, String birthday, String bloodType){
		this.name = name;
		this.phone = phone;
		
		try{
			this.birthday = myformat.parse(birthday);
		}catch(ParseException pe){
			System.out.println(pe.toString());
		}
		
		this.bloodType = bloodType;
	}
	
	public Person(){}
	
	
	//SETTERS AND GETTERS
	public String setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String setPhone(String phone){
		this.phone = phone;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public Date setBirthday(String birthday){
		this.birthday = birthday;
	}
	
	public Date getBirthday(){
		return birthday;
	}
	
	public String setBloodType(String bloodType){
		this.bloodType = bloodType;
	}
	
	public String getBloodType(){
		return bloodType;
	}
	
	@Override
	public String toString(){
		return  "Name: " + name + "\n" + 
				"Phone number: " + phone + "\n" +
				"Date of Birth: " + birthday.toString() + "\n" + 
				"Type of Blood: " + bloodType + "\n";
	}
}