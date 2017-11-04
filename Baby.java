package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.text.ParseException;


public class Baby{

	//fields
	private String name;
	private char gender;
	private Date birthday;
        
	
	//date formatting
	private SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	//constructors
	public Baby(){}
	
	public Baby(String birthday, String name, char gender){
		
		try{
			this.birthday = myformat.parse(birthday);
		}catch(ParseException pe){
			System.out.println(pe.toString());
		}
		
		this.name = name;
		this.gender = gender;
	}
	
	public Baby(Date birthday, String name, char gender){
		this.birthday = birthday;
		this.name = name;
		this.gender = gender;
	}

	
	//setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	//getters
	public String getName(){
		return name;
	}
	
	public char getGender(){
		return gender;
	}
	
	public Date getBirthday(){
		return birthday;
	}
	
	public boolean isOlder(Baby b1, Baby b2){
		if(b1.howOld()<b2.howOld()){
			return true;
		}
		return false;
	}
        

	public int howOld() {
            Calendar cal = Calendar.getInstance();
            Date today = cal.getTime();

            long time = today.getTime() - birthday.getTime();
            int age = (int)(time/(1000*60*60*24));
            
            return age;
        }


}