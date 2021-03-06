/*
Name: Philip Mumbi

Question:



*/

import java.util.*;
import javax.swing.*;

class BarChart{

	public static void main (String[]args){
	
		//delare scanner method
		Scanner scan = new Scanner(System.in);
		
		//declare array
		int [] sales = new int [5];
		
		//initialize some variables
		int q=1;
		int t=0;
		
		//inform the user about accepted values
		System.out.print("\nSales for The superMarket shops are multiples of 100\n");

		//loop to get sale's values for individual store
		for (int i=0; i<5; i++){ 
			
			//ask the user for input
			System.out.print("\nEnter today's sales for store "+q+" : ");
			
			//get values
			int num = scan.nextInt();
			
			//get remainder after dividing user input by 100
			int w=num % 100;
			
			//loop if entered values are less than 100 and not multiples of 100
			while (w>0&&w<=99){
				System.out.print("\nsales must be multiples of 100 .\t\n\nEnter today' s sales: ");
				//get new values
				num = scan.nextInt();
			
				//get new values of modulus
				w = num % 100;
				
			}
			//add values to values array
			sales [i]=num;
			
			q++;
		}
		//set value of q to 1 , q will be used again below
		q=1;
		
		//title of bar chart
		System.out.println("\nSALES BAR CHART\n");
	    
		//loop that prints out the barchart
		for (int j=0; j<5;j++){
			
			//number of stars
			int numberOfStars = sales[j]/100;
			
			//first part of barchart
			System.out.print("Store "+q+":");
			
			//if statement that determines number of stars to print for barchart
			if (numberOfStars>0){
		
				//loop that prints out * according to numberOfStars
				while (t<numberOfStars){
					
					System.out.print("*");
					
					t++;
				}
				
				//jump to next line 
				System.out.print("\n");
				t=0;
			}
			//increment the value of q
			q++;
	
		}	
		
	}
	
}


