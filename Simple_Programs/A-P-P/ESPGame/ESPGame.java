/*
Name: Philip Mumbi

THIS IMPLEMENTATION IS BULKY (get rid of the if statment and use arrays)

Question :
 
 
Write a program that tests your ESP (extrasensory perception). The
program should randomly select the name of a color from the following list of words:

Red, Green, Blue, Orange, Yellow

To select a word, the program can generate a random number. For
example, if the number is 0, the selected word is Red, if the number is 1,the selected word is Green, and so forth. 

Next, the program should ask the user to enter the color that the computer has selected. After the user has entered his or her guess, the program should display the name of the randomly selected color. The program should repeat this 10 times and then display the number of times the user correctly guessed the selected color.

 */

import java.util.*;
import javax.swing.*;

class ESPGame{
	
	public static void main(String[]args){
		
		//create a random method
		Random Rand = new Random();
		
		//keep track of number of correctguesses
		int CorrectGuess = 0; 
		
		//keep track of number of attempts
		int numberOfAttempts =1; 
		
		//keep track of attempts remaining
		int Attempts=9 ;
		
		//loop to ask the user for colour
		while (numberOfAttempts<=10){
			int SelectedNumber=0;
			int SelectedNumber1= Rand.nextInt(5);
			//initialize the colour string variable
			String Colour="";
			//assigning the selected colour according to the selected number 
		
			if (SelectedNumber1==0){
				Colour = "Red";//if 0 is selected colour is red
			}
			if (SelectedNumber1==1){
				Colour = "Green";//if 0 is selected colour is Green
			}
			if (SelectedNumber1==2){
				Colour = "Blue";//if 0 is selected colour is Blue
			}
			if (SelectedNumber1==3){
				Colour = "Orange";//if 0 is selected colour is Orange
			}
			if (SelectedNumber1==4){
				Colour = "Yellow";//if 0 is selected colour is Yellow
			}
			
			//getting user input
			String UserColour1 = JOptionPane.showInputDialog("WELCOME!!\n Guess the Colour selected from\nRed, Green, Blue, Orange, and Yellow\nAttempts remaining: "+Attempts);
			
			if (UserColour1=="Red"){
				SelectedNumber += 0;//if 0 is selected colour is red
			}
			if (UserColour1 == "Green"){
				SelectedNumber +=1;//if 0 is selected colour is Green
			}
			if (UserColour1 == "Blue"){
				SelectedNumber +=2;//if 0 is selected colour is Green
			}
			if (UserColour1 == "Orange"){
				SelectedNumber +=3;//if 0 is selected colour is Green
			}
			if (UserColour1 == "Yellow"){
				SelectedNumber +=4;//if 0 is selected colour is Green
			}
			
			//display selected colour by computer
			JOptionPane.showMessageDialog(null,Colour);
			
			//increase the value of correct guesses by one everytime the user colour is equal to the random colour
			if (SelectedNumber==SelectedNumber1){
				
				CorrectGuess++;
			}
		  //increase the number of attempts so that the loop ends at 10 attempts
			numberOfAttempts++;
			Attempts--;
		
			
		}
		//display the number of correct guesses
		JOptionPane.showMessageDialog(null, "Guesses Correct: "+CorrectGuess);
		
	}
	
}

