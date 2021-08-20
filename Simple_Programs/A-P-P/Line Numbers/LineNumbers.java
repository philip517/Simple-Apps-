/*
 Name: Philip Mumbi
 
 Question:
 Write a program that asks the user for the name of a file . The program should display the contents of the file with each line preceded with a line number followed by a colon. The line numbering should start at 1. Use of exceptions is not mandatory.
 
 */

import java.util.*;
import javax.swing.*;
import java.io.*;


class LineNumbers {
	
	public static void main(String[]args)throws IOException{
		
		String FileName = JOptionPane.showInputDialog("Enter the name of the file which will hold the lines to be displayed later in This program. Do not add the extension just input the name .");
		FileName =  FileName.toLowerCase()+".txt";
		//this has been put in order to automatically create the file name which will hold the lines to later be displayed
		PrintWriter File = new PrintWriter(FileName);
		//the file.print method writing to the file
		File.println("He told fanny of it");
		File.println("Fanny gave her a look");
		File.println("Fanny he must give up");
		File.println("But Fanny held on tight");
		File.println("But Fanny still hung back");
		File.println("This is life , said Fanny");
		File.println("Fanny could not answer him");
		File.println("Fanny laid down Tom Jones");
		//the above code will be excecuted every time the program runs
		File.close();
		//Asking user for file name using JOptionPane
		String FileName1=JOptionPane.showInputDialog("May you Enter the name of the file. \n\n Do not add the extension, all files will be text (.txt) files.");
		
		//adding .txt extension to filename
		FileName1 = FileName+".txt";
		
		//method to read data feom file
		Scanner UserFile = new Scanner (new FileReader(FileName));
		
		//value that will help with line numbering
		int n=1;
		
		//loop to get data from file mwansa.txt
		while (UserFile.hasNextLine()){
		
			//data in file is stored in string variable InfoInFile
			String InfoInFile = UserFile.nextLine();
		
			//output printed to screen using Terminal
			
			System.out.print(n+":");
			System.out.print(InfoInFile);
			System.out.println(".");
			//line number incremented by 1
			n++;
			
		}
		//closing the file to avoid further reading
			UserFile.close();
	}
}
