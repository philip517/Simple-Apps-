/*
Some more debbugging is needed if current month is 7 and birth month is 6
 as well as when birth month is 1 and current month is 9

We inport the Scanner Method which will alllow us to collect data from the user via keyboard, other files .etc
*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class AgeCalc{


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




String age1 = JOptionPane.showInputDialog("\nMAY YOU PLEASE ENTER YOUR AGE \n");

 age = Integer.parseInt(age1);

if (age >= 1){

System.out.println("\nMay you please enter the month in which you were born according to the table below.\n\nfor example if you were born in the month of May enter the code \"5\"\n");

System.out.println("Month\t\t Code\n\nJanuary\t\t1\nFebruary\t2\nMarch\t\t3\nApril\t\t4\nMay\t\t5\nJune\t\t6\nJuly\t\t7\nAugust\t\t8\nSeptember\t9\nOctober\t\t10\nNovember\t11\nDecember\t12\n\t\t");

Scanner month = new Scanner(System.in);// Scanner method detects the input

int monthOfBirth = month.nextInt();

if (monthOfBirth > 0 && monthOfBirth < 13 ){

//asks for the user to enter the current month

System.out.println("\nMay you please enter the current month according to the table below, if the current month is December enter \"12\"\n");

System.out.println("Month\t\t Code\n\nJanuary\t\t1\nFebruary\t2\nMarch\t\t3\nApril\t\t4\nMay\t\t5\nJune\t\t6\nJuly\t\t7\nAugust\t\t8\nSeptember\t9\nOctober\t\t10\nNovember\t11\nDecember\t12\n\t\t");

Scanner month2= new Scanner(System.in);// Scanner method detects the input

int currentMonth = month2.nextInt();// Input is stored in Variable age

if ( currentMonth > 0 && currentMonth < 13 ) {

System.out.println("\nMay you please enter Current Year\n");

Scanner Year= new Scanner(System.in);// Scanner method detects the input

currentYear = Year.nextInt();// Input is stored in Variable currentYear

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

System.out.println("\nYou were born in "+DateOfBirth);/*+"\n\nAnd as a result you are "+age+" years old with "+monthOfBirth1+" months and counting");

System.out.println("\nSimply put, You have "+monthsRemaining+"+ months Remaining Until your Birthmonth");*/
}

else if (monthsRemaining > 1) {

System.out.println("\nYou were born in "+DateOfBirth+"\n\nAnd as a result you are "+age+" years old with more than or equal to "+monthOfBirth1+" months");

System.out.println("\nSimply put, You have less or equal to "+monthsRemaining+" months Remaining Until your next birthday");

}

}


/*else if (monthOfBirth1 > 1){
int monthsRemaining = 12 - monthOfBirth1; 

if (monthsRemaining == 1){
System.out.println("\nSimply put, You have "+monthsRemaining+" month Remaining");
}

else if (monthsRemaining > 1) {

System.out.println("\nYou were born in "+DateOfBirth+"\n\nAnd as a result you are "+age+" years old with "+monthsRemaining+" months and counting");

System.out.println("\nSimply put, You have "+monthOfBirth1+"+ months Remaining Until your birthday");

}

}
*/

else if ( monthOfBirth1 > 0 && monthOfBirth < 12 ){

 DateOfBirth--;
 
 if (monthOfBirth1==1){
 
 System.out.println("\nYou were born in "+DateOfBirth+" But you are not yet "+age+" You still have "+monthOfBirth1+"+ months remaining.");
 
 }
 
 else if (monthOfBirth1 > 1){
 
System.out.println("\nYou were born in "+DateOfBirth+" But you are not yet "+age+" You still have "+monthOfBirth1+"+ months remaining.");
}

} 

else if (monthOfBirth1==0){

System.out.println("\n\t!! Happy Birthmonth!! ");

}
}


//ERRORS TO DISPLAY IF currentMonth is < 0 or > 13



else if (currentMonth < 0 ){


System.out.println("\n!! OUT OF RANGE !!\n\n The range has benn given ? What were you thinking "+currentMonth+" Months , Check the Table above.\n !! The program will now Terminate, Goodbye !!");

} 

else if(currentMonth > 13){

System.out.println("\n!! OUT OF RANGE !!\n\n You need Therapy ? You even wrote "+currentMonth+" Months\n !! The program will now Terminate, Goodbye !!");
}


}
   

////ERRORS TO DISPLAY IF monthOfBirth is < 0 or > 13
   
else if (monthOfBirth < 0 ){


System.out.println("\n!! OUT OF RANGE !!\n\n How can a month be negative ? What were you thinking "+monthOfBirth+" Months , I would like to see your Calendar.\n !! The program will now Terminate, Goodbye !!");

} 

else if(monthOfBirth > 13){

System.out.println("\n!! OUT OF RANGE !!\n\n How can a year have more than 12 months ? You even wrote "+monthOfBirth+" Months\n !! The program will now Terminate, Goodbye !!");
}


}

//Message to display when age is equal to or less than 0

else {

System.out.println("Enter a Valid Response");
}

}
}
