/*
Some more debbugging is needed if current month is 7 and birth month is 6
 as well as when birth month is 1 and current month is 9

We inport the Scanner Method which will alllow us to collect data from the user via keyboard, other files .etc
*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class AgeCalc1{


public static void main(String [] args){

/*Question : write a program that requires 

-the user to enter their names and last name
-the user to enter their age 
-the user to enter current year
-print out "welcome + username " to the system
-calculate the year they were born in
-display the year the user was born



we first declare variables that will hold the data we need from the user


String FirstName, SurName;
*/
int age, currentYear, DateOfBirth; 
/*
//we ask the user to enter their Firstname


System.out.println("May You please enter your FirstName.\n");

Scanner name1= new Scanner(System.in);// Scanner method detects the input

FirstName = name1.next();// Input is stored in Variable FirstName

//System.out.print(FirstName);

//we ask the user to enter their Firstname

System.out.println("\nMay You please enter your Surname.\n");

Scanner name2= new Scanner(System.in);//Scanner method detects the user input

SurName = name2.next();//User input is stored in Variable SurName

System.out.println("\nYour Names Are\n");//prints out " Your Names Are "
System.out.println(SurName+"\t"+FirstName+"\n");// Prints out the name starting with the surname then firstname


the program below calculates the year someone was born using the current ( month && year ) and the age of the user as well as the month they were born 
*/
      age = 0 ;
	  
	 while (age <1 ){ 
	 age = Integer.parseInt(JOptionPane.showInputDialog("\nMAY YOU PLEASE ENTER YOUR AGE \n"));

		age +=0 ;}
			
	int monthOfBirth = Integer.parseInt(JOptionPane.showInputDialog("\nMay you please enter the month in which you were born according to the table below.\n\nfor example if you were born in the month of May enter the code \"5\"\n\nCode-----Month\n\n 1----January\n 2----February\n 3----March\n 4----April\n 5----May\n 6----June\n 7----July\n 8----August\n 9----September\n10----October\n11----November\n12----December\n\t\t"));

			while (monthOfBirth < 1 || monthOfBirth > 12 ){
				
				 monthOfBirth = Integer.parseInt(JOptionPane.showInputDialog("\nMay you please enter the month in which you were born according to the table below.\n\nfor example if you were born in the month of May enter the code \"5\"\n\nCode-----Month\n\n 1----January\n 2----February\n 3----March\n 4----April\n 5----May\n 6----June\n 7----July\n 8----August\n 9----September\n10----October\n11----November\n12----December\n\t\t"));
				
				monthOfBirth += 0;
				
			}

													//asks for the user to enter the current month

	int currentMonth = Integer.parseInt(JOptionPane.showInputDialog("\nMay you please enter the current month according to the table below.\n\nfor example if the current month is December you may enter the code \"12\"\n\nCode-----Month\n\n 1----January\n 2----February\n 3----March\n 4----April\n 5----May\n 6----June\n 7----July\n 8----August\n 9----September\n10----October\n11----November\n12----December\n\t\t"));

while ( currentMonth < 1  || currentMonth > 12 ) {
	
	 currentMonth = Integer.parseInt(JOptionPane.showInputDialog("\nMay you please enter the current month according to the table below.\n\nfor example if the current month is December you may enter the code \"12\"\n\nCode-----Month\n\n 1----January\n 2----February\n 3----March\n 4----April\n 5----May\n 6----June\n 7----July\n 8----August\n 9----September\n10----October\n11----November\n12----December\n\t\t"));

	
               }

		currentYear = Integer.parseInt(JOptionPane.showInputDialog("\nMay you please enter Current Year"));
					// Input is stored in Variable currentYear
while (currentYear < 0 || currentYear < age){
	
	currentYear = Integer.parseInt(JOptionPane.showInputDialog("\nMay you please enter Current Year"));
}
/*

the calculations below are going to be used to better calculate the year the user was born using the current month, year and the age, the month they were 

born

*/
	DateOfBirth = currentYear - age;

			int monthOfBirth1 = monthOfBirth - currentMonth;

if ( monthOfBirth1 < 0 && monthOfBirth1 > -12 ){

			monthOfBirth1 *= -1;

					int monthsRemaining = 12 - monthOfBirth1; 

if (monthsRemaining == 1){

	JOptionPane.showMessageDialog(null,"\nYou were born in "+DateOfBirth,"SUMMARY",JOptionPane.INFORMATION_MESSAGE);
									}

else if (monthsRemaining > 1) {

	JOptionPane.showMessageDialog(null,"\nYou were born in "+DateOfBirth+"\n\nAnd as a result you are "+age+" years old with more than or equal to "+monthOfBirth1+" months"+"\nSimply put, You have less or equal to "+monthsRemaining+" months Remaining Until your next birthday","SUMMARY",JOptionPane.INFORMATION_MESSAGE);

}

}


else if ( monthOfBirth1 > 0 && monthOfBirth < 12 ){

 DateOfBirth--;
 
 if (monthOfBirth1==1){
 
 JOptionPane.showMessageDialog(null,"\nYou were born in "+DateOfBirth+" But you are not yet "+age+" You still have "+monthOfBirth1+" months remaining.","SUMMARY",JOptionPane.INFORMATION_MESSAGE);
 
 }
 
 else if (monthOfBirth1 > 1){
 
			JOptionPane.showMessageDialog(null,"\nYou were born in "+DateOfBirth+" But you are not yet "+age+" You still have "+monthOfBirth1+"+ months remaining.","SUMMARY",JOptionPane.INFORMATION_MESSAGE);
}

} 

else if (monthOfBirth1==0){

		JOptionPane.showMessageDialog(null,"\n\t!! Happy Birthmonth!! ","SUMMARY",JOptionPane.INFORMATION_MESSAGE);

}





}
}
