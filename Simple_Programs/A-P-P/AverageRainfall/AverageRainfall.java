/* Name : Philip Mumbi
 * 
 * Question
 * 
 * 
 * 
 */

import java.util.*;
import javax.swing.*;
import java.io.*;

class AverageRainfall{
	
	public static void main(String[]args){
		
		//declaring scanner method
		Scanner scan = new Scanner(System.in);
		
		//initializing variable which will be used in pprogram
		int totalRain= 0;
		int rain=0;
		int m=1;
		
		
		String [] MonthName=  {"January","February","March ","April ","May ","June ","July ","August ","September", "October","November ","December"};
		
		System.out.print("Enter Number of Years   ");
		
		
		int Years = scan.nextInt();
		int TotalMonths=Years*12;
		
		//input validation for number of years
		while (Years<1){
			
			System.out.println("Number of years cannot be less than 1");
		
			Years = scan.nextInt();
		}
			//multidemensional array to store rainfall for each month according to number of years
			int [][] Months = new int [Years][12];
			
		//loop to get amount of rainfall for each month
		for (int k=0;k<Years;k++){
			
			//title for year
			System.out.print("\nYear  "+m+"\n");
			//loop to get values for respective month
			for (int q=0;q<12;q++){
				
				//ask for user input
				System.out.print("Enter Amount of inches of rainfall for "+MonthName[q]+"  ");
				
				//get rainfall from user
				 rain = scan.nextInt();
				 
				 if (rain==0){
					 //reduce the value of TotalMonths by 1
					 TotalMonths--;
				}
				
				 //if value is negative, loop to get values again(input validation)
				 while (rain<0){
					 System.out.println("Values should not be negative, please enter correct amaount");
					 rain=scan.nextInt();
				}
				 
				 //keep total amount of rainfall
				 totalRain+=rain;
				 //keep rainfall for each month
				 Months[k][q]=rain;
				
			}
		
			//increment value of year
			m++;
	}
	
		int f=1;
		
		int j =0;
		
		//loop to display year month and rainfall recorded
		for (int g=0;g<Years;g++){
			
			//display year and needed month and rainfall titles
			System.out.println("\n\t\t\tYear :"+f+"\n");
			System.out.println("Months\t\t\tRainfall(inches)");
			//loop to display month and rainfall data
			for (int t=0;t<12;t++){	
			
				System.out.println(MonthName[t]+"    \t\t\t"+Months[j][t]);
				
				
			}
		//increment current year number	
		f++;	
		
		//increment array from which to get rainfall data
		j++;
		}
		
		//calculate average rainfall
		Double AverageRainfall=0.0+ totalRain/TotalMonths;
		
		//display average rainfall and total rainfall
		System.out.print("\nTotal Months with Rainfall : "+TotalMonths+"\nTotal Rainfall : "+totalRain+" inches/month\nAverage Rainfall : "+AverageRainfall+"inches/month");
		
	}
}
