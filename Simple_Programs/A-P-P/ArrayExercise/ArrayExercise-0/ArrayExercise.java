/*
 
 Name: Philip Mumbi
 
 Question : 
 
Create a String array that will store 5 student ID numbers

assign 5 student ID values into the array elements from user input using
the Scanner class

Write a loop (While loop or For loop) which will display only the first 3
student ID values from the array

 
 */

import java.util.*;
import javax.swing.*;
import java.io.*;
class ArrayExercise{

	public static void main(String[]args){
	
		//getting number of Students
		int i  = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of student id "));
		
		//testing conversion
		JOptionPane.showMessageDialog(null,i);
		
		//adding to string
		int [] Names = new int [i] ;
		
		//loop to get names
		for (int j=0; j<i; j++){
		
		//adding names to array
		 Names [j] = Integer.parseInt(JOptionPane.showInputDialog("May you enter the name "));
		
		}
		
		int p=0;
		
		while (p<3){
			//getting names from array
			System.out.print(Names [p]+"\t");
		
			p++;
		}
		
		
		
		
	}
}
