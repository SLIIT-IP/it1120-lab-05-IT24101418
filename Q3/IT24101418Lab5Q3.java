import java.util.Scanner;

public class IT24101418Lab5Q3{
  public static void main(String[] args){

//declare variables
	int Start_date,End_date,Reserved_days ;
	double Total_amount,discount;
	final int CHARGES_DAY = 48000;
	final double DISCOUNT_DAY_3_AND_4 = 0.10;
	final double DISCOUNT_DAY_5_OR_MORE = 0.20;

//create scanner
	Scanner days = new Scanner(System.in);

//take inputs and validation
	System.out.println("Enter start date (1-31) :");
	Start_date = days.nextInt();
	if(Start_date<1 || Start_date>31){
	   System.out.println("Error: Days must be between 1 and 31");}
	 
	System.out.println("Enter End date date (1-31) :");
	End_date = days.nextInt();
	if(End_date<1 || End_date>31){
	   System.out.println("Error: Days must be between 1 and 31");}

	if(End_date <= Start_date){
	    System.out.println("Error: Start date must be less than End Date");	
		return;}

//calculation
	Reserved_days = (End_date - Start_date);

	if(Reserved_days<3){
	   System.out.println("Room charge per day :"+CHARGES_DAY);
	   System.out.println("Number of days Reserved :"+Reserved_days);
	   Total_amount =  (Reserved_days * CHARGES_DAY); 	   
           System.out.println("Total amount to be paid: "+Total_amount);}
	
	else if(3>=Reserved_days || Reserved_days<=4){
	   discount = (Reserved_days*CHARGES_DAY)*DISCOUNT_DAY_3_AND_4;
	   Total_amount = (Reserved_days*CHARGES_DAY)-discount;
	   System.out.println("Room charge per day :"+CHARGES_DAY);
	   System.out.println("Number of days Reserved :"+Reserved_days);
	   System.out.println("Total amount to be paid: "+Total_amount); }
	
	else{
	   discount = (Reserved_days*CHARGES_DAY)*DISCOUNT_DAY_5_OR_MORE;
	   Total_amount = (Reserved_days*CHARGES_DAY)-discount;
	   System.out.println("Room charge per day :"+CHARGES_DAY);
	   System.out.println("Number of days Reserved :"+Reserved_days);
	   System.out.println("Total amount to be paid: "+Total_amount); }

   }
}