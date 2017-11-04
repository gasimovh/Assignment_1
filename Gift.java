package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Gift {
	
	private String nameOfDonator;
	private String description;
	private Date givenDate;
	
    private SimpleDateFormat myformat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
	//constructor
	public Gift(String nameOfDonator, Date givenDate, String description){
		this.nameOfDonator = nameOfDonator;
		this.givenDate = givenDate;
		this.description = description;
	}
        
    public Gift(String nameOfDonator, String givenDate1, String description){
		this.nameOfDonator = nameOfDonator;
		this.description = description;
		
		try{
			this.givenDate = myformat.parse(givenDate1);
		}catch(ParseException pe){
			System.out.println(pe.toString());
		}
		
	}

	@Override
	public String toString(){
		return description;
	}
	
	//setters
	public void setNameOfDonator(String nameOfDonator){
		this.nameOfDonator = nameOfDonator;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	public void setGivenDate(Date givenDate){
		this.givenDate = givenDate;
	}
	
	//getters
	public String getNameOfDonator(){
		return nameOfDonator;
	}
	
	public String getDescription(){
		return description;
	}
	
	public Date getGivenDate(){
		return givenDate;
	}
	
	
	
	
	
	
}
