/*
 * --------------------------An Exception 
 * is an error or unexpected event that occurs when the program is running
 * 
 * By default the compiler does not detect exceptions and so if it were to occur (and the program is not designed to handle such an exception) the program can crash(i.e stop running) 
 * 
 * examples of exception subclasses
 * -IOexception
 * -TimeoutException
 * 
 * --------------------------Exceptions to be discussed 
 * 
 * -IOException    -FileNotFoundException    -NumberFormatException
 *
 * -ArithmeticException		-ArrayIndexOutOfBoundsException   
 * 
 * -NullPointerException
 *
 * --------------------------Keywords used for handling exceptions
 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * 
 * 
 * 								throws	
 * 
 * thrown exception means an exception has occurred, thus the throws keyword is used to indicate that the method might throw a listed exception type
 * 
 * 
 * 	e.g public static void main(String[]args)throws IOException{--code--}
 * 
 * }
 * 
 * 
 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * 
 * 
 * 							-try and -catch  
 *
 *The try and catch keywords are used to identify exceptions and run alternative code such that the program will not crash 
 * 
 * ---------examples
 * 
 *   try { 
 * 
 * ////code that could have an exception		
 *
 *	}
 * 
 * 	 catch {
 * ////code to exceute when the exception is detect or occurs
 * 
 * }
 * 
 * 
 * 
 *}}}} -----
 * 
 *-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * 
 * -finally (optional, sometimes recommended but not a requirement )
 * 
 * e.g 
 * 
 * finally{
 * 
 * code to be excecuted wether or not the exception occurs
 * 
 * this code will be excecuted everytime the program runs
 * 
 * }
 * 
 * 
 *
 *    The program below is a demonstration of how types of exceptions can be " tried " and " caught " .
 */




import java.util.*;
import javax.swing.*;
import java.io.*;

class Exceptions{
	
	public static void main(String[]args)throws IOException{

		JOptionPane.showMessageDialog(null,"TOPIC : EXCEPTIONS","",JOptionPane.PLAIN_MESSAGE);

		String Response = JOptionPane.showInputDialog("1== for Explanation\n 2== for Examples\n 3==to Exit");
		
		int num1 = 0, num2 = 1;
		
		JOptionPane.showMessageDialog(null,"Program under construction","",JOptionPane.ERROR_MESSAGE);
		
		try{
			//code that may have an exception(an error or unexpected event that occurs when a program is running)
			int num3= num2/num1;
			}
			//catch (exceptiontype objectName)( code to run if exception is occurs)
		catch (ArithmeticException ex){
			//when the exception type is detected by the compiler the code below will be exceuted
			
			System.out.println("Sacre blur");
		}
		
		finally{
		
			System.out.println("you are welcome");
		}
	}
}
