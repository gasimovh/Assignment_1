
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

import models.Baby;
import models.Gift;

public class BabyRegister {
	//COMMENTS
	public static void main(String args []){
            ArrayList<Baby> babies = new ArrayList<>();
            //prefilled babies
            Baby b1 = new Baby("01/10/2016 10:10", "Michael",'M');
            Baby b2 = new Baby("15/10/2017 12:17", "Tassak",'F');
            Baby b3 = new Baby("30/10/2017 15:40", "Kai",'M');
            Baby b4 = new Baby("10/10/2017 16:54", "Ivy",'F');
            Collections.addAll(babies, b1, b2, b3, b4);
            
            ArrayList<Gift> gifts = new ArrayList<>();
            //prefilled gifts
            Gift g1 = new Gift("Ozyman", "03/10/2017 17:43", "Cat Keyboard");
            Gift g2 = new Gift("Kit", "19/10/2017 16:45", "5inch Gummy Bear");
            Gift g3 = new Gift("Dandy", "31/10/2017 18:17", "Transforming Dinosaur");
            Gift g4 = new Gift("Liz", "12/10/2017 13:18", "Talking Oranges");
            Collections.addAll(gifts, g1, g2, g3, g4);
                    
            
            SimpleDateFormat myFormat= new SimpleDateFormat("dd/MM/yyyy HH:mm");

            Scanner sc = new Scanner(System.in);
            int option;
            
            do{
				//Printing the menu
                System.out.println("-------------------------------------\n"
                                   + "Please enter the number of the option:"
                                   + "\n1.Add new baby 2.List Babies by age"
                                   + " 3.List Babies by name 4.Add gift 5.List Gifts 6.Exit"
                                   + "\n-------------------------------------");
				
			
				option = sc.nextInt();
				
                    switch(option){
                        
                        case 1: 
                                System.out.println("Enter the name:");
								String name = sc.next();
				
								System.out.println("Enter the birtday:");
								Date day = new Date();
							
								boolean validDate = false;
								while(!validDate){
									try{
										day = myFormat.parse(sc.nextLine());
										validDate = true;
									}catch(ParseException e){
										System.out.println("Invalid date, type it again");
										validDate = false;
									}
								}
                                
                                System.out.println("Enter the gender:");
                                char gender = sc.next().toUpperCase().charAt(0);
                                
								Baby b = new Baby(day,name,gender);
								babies.add(b);
								
								System.out.println("Number of the babies(baby):" + babies.size() + "\n");
								break;
                        case 2:
							//Sorting algorithm
                            Collections.sort(babies, new Comparator<Baby>()
                            {
                                public int compare(Baby b1, Baby b2)
                                {
                                    return b1.howOld() - b2.howOld();
                                }
                                
                            });
                            
							//Printing out
                            System.out.println("List by ascending order of ages \nNames \t\tDates of Birth \t\tGender \tAges");
							for(int i=0; i<babies.size(); i++){
                                    System.out.println(babies.get(i).getName() + "\t\t"
                                                       + myFormat.format(babies.get(i).getBirthday())
                                                       + "\t" + babies.get(i).getGender()
                                                       + "\t" + babies.get(i).howOld());
                            }
								
                            break;
                        case 3:
							//Sorting algorithm
                            Collections.sort(babies, new Comparator<Baby>()
                            {
                                public int compare(Baby b1, Baby b2)
                                {
                                    return b1.getName().toUpperCase().compareTo(b2.getName().toUpperCase());
                                }
                                
                            });
                            
							//Printing out
                            System.out.println("List by names \nNames \t\tDates of Birth \t\tGender \tAges");
							for(int i=0; i<babies.size(); i++){
                                    System.out.println(babies.get(i).getName() + "\t\t"
                                                       + myFormat.format(babies.get(i).getBirthday())
                                                       + "\t"+babies.get(i).getGender()
													   + "\t"+babies.get(i).howOld());
                            }
                            
                            break;
                        case 4:
                            System.out.println("Name of the donator:");
                            String donatorName = sc.next();
                            
                            System.out.println("Date of the donation:");
                            Date donationDate = new Date();
                            
                            boolean valid = false;
							while(!valid){
									try{
										donationDate = myFormat.parse(sc.nextLine());
										valid = true;
									}catch(ParseException e){
											System.out.println("Invalid date, type it again");
											valid = false;
									}
							}
                                        
                            System.out.println("Some info about gift:");
                            String description = sc.nextLine();
                           
                            Gift g =new Gift(donatorName, donationDate, description);
                            gifts.add(g);
                            
                            System.out.println("Number of the gifts(gift):" + gifts.size());
                            
                            break;
                        case 5:
                            System.out.println("List of gifts");
                            
							//Printing out
                            System.out.println("Name \t\t\tDate \t\t\tDescription");
                            for(int i=0; i<gifts.size(); i++){
                                System.out.println(gifts.get(i).getNameOfDonator() + "\t"
                                                   + "\t\t"+myFormat.format(gifts.get(i).getGivenDate())
                                                   + "\t" +gifts.get(i).getDescription());
                            }
                            break;
                    }
            }while(option!=6);
            
            
	}
}