/*
 
 Name = Philip Mumbi
 
 Question:
 
 Write a program with a loop that lets the user enter a series of integers The user should enter -99 to signal the end of the series. After all the numbers have been entered , the program should display the largest and smallest numbers entered
 
 */




import java.util.*;
import java.io.*;
import javax.swing.*;



class LargestandSmallest{
	
	public static void main(String[]args){
		
		
		int smallest; 
		
		int largest=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number");
		
		int num = scan.nextInt();
		
		smallest = num;
		
		while (num!=-99){
		
			System.out.println("Enter Number Again.");
			
			num = scan.nextInt();
			
			if (num!=-99){
			
				if (num<smallest){
				
					smallest = num;
				}
				
				else if (num>smallest){
					
					 largest=num;
					
					}
			}
			
			num+=0;
		}
		
		System.out.print("/n smallest "+ smallest + "  largest  " + largest);
	}
}
