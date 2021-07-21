

// The program is incomplete , i went as far as writing the data to file but i will continue soon

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

class WaterBillGen{
	
	
	public static void main(String[]args) throws IOException{
		//prepare to write to file names.txt
		PrintWriter file = new PrintWriter("names.txt");
	
		//ask for number of customers 
		String num1 = JOptionPane.showInputDialog("May you enter number of Customers");
		//convert the String to integer value
		int number_of_Customers = Integer.parseInt(num1);
		int i=0;
		//a loop that continues to get the needed data until the total number of customers is reached . Collection done with Joptionpane
		while ( i < number_of_Customers){
			
			String account_Number = JOptionPane.showInputDialog("Enter Customer Account Number \n e.g Lusxxxxxx(B or R)");
			
			String water_Meter_Number = JOptionPane.showInputDialog("Enter Customer Water Meter Number \n e.g xxxxxx");
			
			String First_Name = JOptionPane.showInputDialog("Enter Customer First Name");
			
			String Surname = JOptionPane.showInputDialog("Enter Customer Surname");
			
			String opening_Meter_Reading = JOptionPane.showInputDialog("Enter opening Meter Reading");
			
			String closing_Meter_reading = JOptionPane.showInputDialog("Enter closing Meter reading");
			
			String outstanding_Balance = JOptionPane.showInputDialog("Enter Customer Outstanding Balnce");
		//write the collected data to the file in a single line and then move to next line
			file.println(account_Number +" " + water_Meter_Number +" " + First_Name +" "+ Surname + " " + opening_Meter_Reading +" " + closing_Meter_reading +" " + outstanding_Balance );
			//increment i by 1
			i++;
		}
		
		file.close();
		
		//creating an instance of filewriter to write to a file, the true means the file already exits
		FileWriter Fwrite = new FileWriter("names.txt", true);
		
		//PrintWriter object used to write data to file
		PrintWriter file1 = new PrintWriter(Fwrite);
		
		//string hallo again being appended to the file
		file1.println("hallo again");
		
		//file closed
		file1.close();
		
		
		
		Scanner data1 = new Scanner(new FileReader("names.txt"));
		
		if (data1.hasNextLine()){
			
			
			String Data1 = data1.nextLine(); 
			
		
			System.out.println(Data1);
		
	
			
		} 
	}
}
