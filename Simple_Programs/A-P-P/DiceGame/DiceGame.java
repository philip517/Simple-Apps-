/*
Name :Philip Mumbi

Question: 
Write a program that plays a simple dice game between the computer and
the user. When the program runs, a loop should repeat 10 times. Each
iteration of the loop should do the following:
Generate a random integer in the range of 1 through 6. This is the
value of the computer’s die.
Generate another random integer in the range of 1 through 6. This is
the value of the user’s die.
The die with the highest value wins. (In case of a tie, there is no
winner for that particular roll of the dice.)
As the loop iterates, the program should keep count of the number of
times the computer wins, and the number of times that the user wins.
After the loop performs all of its iterations, the program should display
who was the grand winner, the computer or the user.

*/

import java.util.*;
import javax.swing.*;
import java.io.*;


class DiceGame{
	
	public static void main(String[]args){
		
		//initializing values that will be used in the program
		int i=1;
		int CompValue=0; 
		int UserValue=0;

		//loop that will facilitate rolling dice
		while (i<=10){
			
			//show rolling dice
			System.out.println("\nRolling dice .....     roll: "+i+"\n");
			
			//generate random method
			Random rand = new Random();
		
			//get random number Computer
			int Computer = rand.nextInt(6)+1;
		
			//get random number for user
			int User = rand.nextInt(6)+1;
		
			//add computer value to computer total
			CompValue+=Computer;
			
			//add user value to user total
			UserValue+=User;
		
			//show values of user and computer
			System.out.println("Computer Value: "+Computer+ "\nUser Value:  "+User+"\n");
	
			//increment the value of i
			i++;
		
			
		}
		
		//show total values of user and computer
		System.out.println("Computer Total : "+CompValue+"\nUser Total  : "+UserValue);
		
		//if statments that determing what is displayed when 
		
		if (CompValue>UserValue){
			
			System.out.print("Computer Wins");
			
		}
		
		// user value is greater than compvalue
		else if(UserValue>CompValue){
			
			System.out.println("User Wins");
			
		}
		
		else {//draw
			System.out.println("Its a draw");
			
		}
	}
}
