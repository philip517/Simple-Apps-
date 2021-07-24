/*
 Name: Philip Mumbi
 
 Question:
 
 Write a program that asks the user for the names of two files. The first file should be opened for reading and the second file should be opened for writing. The program should read the contents of the first file, change all characters to uppercase, and store the results in the second file. The second file will be a copy of the first file, except that all the characters will be uppercase. Use Notepad or another text editor to create a simple filethat can be used to test the program.

 
 */

import java.util.*;
import java.io.*;
import javax.swing.*;

class UppercaseFileConverter{
	
	public static void main(String[]args)throws IOException{
		
		//getting user Input
		String Name1 = JOptionPane.showInputDialog("Enter Name of first file");
	    
		// preparing to read input from file1.txt
		Scanner scan = new Scanner(new FileReader("file1.txt"));
		
		//preparing to write to file2
		PrintWriter NewFile = new PrintWriter("file2.txt");
		
		// writing data to file2.txt
		while (scan.hasNextLine()){
		
			//converting info to uppercase and writing info in string Info
			String Info = (scan.nextLine()).toUpperCase();
			//checking to see if the conversion is successful
			System.out.println(Info);
			//writing info in the file2.txt
			NewFile.println(Info);		
			
		}
		
		//Closing file1 from reading
		scan.close();
		
		//Closing file2 from reading
		NewFile.close();
	}
}
