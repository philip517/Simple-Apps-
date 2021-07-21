
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;




	//ALL PROGRAMS ARE USING THE SAME CLASS WHICH IS ******  Convert   *****





class   Convert{


            
//                            [           This is the first program          ]
    
/*


public static void main(String [] args ){
    
   
        int  hours;
        int  minutes;
        double days;
        
     for(minutes=0; minutes < 1441 ; minutes= minutes+60){
     
     hours = minutes / 60;
     days = hours / 24;
     
     
     if( minutes == 720){
     
     System.out.println("halo, you are almost there, you have; " + minutes + " minutes"   + "  thats half a day");
     
     }
     
     
     if(minutes == 360)  {
     
     System.out.println(  " you have; " + hours + "  hours, thats quarter a day");
     
     }
     
     
     if(hours == 24) {
     
     System.out.println( " wow an entire day!");}
     
       }
            } 
                    } 
     
     
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


     
     /*                                         [ Question ]
     
     
     
     
     The moon’s gravity is about 17 percent that of earth’s. Write a program that computes your effective weight on the moon.
         
         n.b      10 newtons make  1 kg 
                                                
                                               
       //                                         [ ANSWER BELOW   ]
   
         public static void main(String [] args){
         
         double earthweight, moonweight, mass ;
          
        //earthweight = 10;
    
   /* for(earthweight = 100; earthweight < 2000; earthweight = earthweight + 100){
    
    moonweight = (earthweight * 17) / 100;
    
    mass = earthweight / 10; 
    
    System.out.println("if you are :" + mass + "kg" + "," + "  your weight on the moon is " + moonweight);
    
   if(mass == 50){
   System.out.println( mass + " kg" +" Jubilee mass");
   }
    if(mass == 100){
    
    System.out.println(mass + " kg" + " Century mass");
         
      String Testing = "Hallo my name is testing string and 2010 ict is nice i guess";     
          
       System.out.println(Testing);                          }
    
                     }
                 
        */
    
    //Sytem.out.println("To find your weight on the moon, 
  
  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
         
    /*                       [        Next QUESTION       ]
     
     
     
     
     Adapt Try This 1­2 so that it prints a conversion table of inches to meters. Display 12 feet of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals approximately 39.37 inches.)
     
  
     1 feet = 12 inches
     1 inch = 2.5cm
     10 inches = 25 cm
     1 meter = 100 cm
     
     
     public static void two(String [] args){
         
         
         double inches;
         
         double feet, counter, meters;
         
         
         counter = 0;
         
     for(inches = 1; inches <= 144; inches = inches + 1){
    
    feet = inches / 12;
    
    meters = inches / 40;
    
    if(inches <= 1){
    
    System.out.println(inches + "  inch is equal to " + feet + " feet" );
    }
    
    
    if(inches > 1){
    
    System.out.println(inches + "  inches is equal to " + feet + " feet");
    }
     
     
     counter++;
     
     if ( counter == 12 ){
     
     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"  ) ;
     
     counter=0;
     
     }
     
       }
         }
          }


*/
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/*                            [    QUESTION    ]




  In this project, you will create a program that computes how far away, in feet, a listeneris from a lightning strike. Sound travels approximately 1,100 feet per      second through air. Thus, knowing the interval between the time you see a lightning bolt and the time the sound reaches you enables you to compute the distance to the lightning. For this project, assume that the time interval is 7.2 seconds.



 1. Create a new file called Sound.java.

 2. To compute the distance, you will need to use floating­point values. Why? Because the time interval, 7.2, has a fractional component. Although it would be permissible to use a value of type float, we will use double in the example.

 3. To compute the distance, you will multiply 7.2 by 1,100. You will then assign thisvalue to a variable.
 
 4. Finally, you will display the result.

 
                                          
                                      //  [  ANSWER ]

public static void main( String [] args ){

double x , y , z;

x = 7.2;

y = 1100;

z = x * y;

System.out.println("The distance is :" + z + " feet");

//the program is too bulky, just make the variable z and equate it to 7.2*1100 

 } 

}

*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/*                                        [   QUESTION   ]


6. Extra challenge: You can compute the distance to a large object, such as a rock wall,
by timing the echo. For example, if you clap your hands and time how long it takes for
you to hear the echo, then you know the total round­trip time. Dividing this value by
two yields the time it takes the sound to go one way. You can then use this value to
compute the distance to the object. Modify the preceding program so that it computes
the distance, assuming that the time interval is that of an echo.

                  [ ANSWER ]



 public static void main(String [] args){

double dist;

dist= (7.2*1100) / 2;

System.out.print("The distance to the wall is " + dist + " feet" );

} 
 
}

*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*                               [         some simple practice          ] 

public static void main(String[] args){

int y, t, r, s;
 
y = 1000;

s = 50;

for (y = 1000; y > -1000 ; y = y -100){

r = y / s;
System.out.print(r + "  \n\n");


if (r == 10){
System.out.println( );
}
  
    //y = r ;
//System.out.println("the new value of r is" + y);

  
  }   
     }
       }


*/


	/*



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



	public static void main(String[]args) {
		
		
		System.out.println("Enter you name ");
	
		Scanner nameOfUser = new Scanner (System.in);
		
		String text = nameOfUser.next();
		
		System.out.println("Enter your age");
		
		Scanner ageOfUser = new Scanner (System.in);
		
		String age  = ageOfUser.next();  
		
		System.out.println("Your name is " + text + "\tand your age is  " + age);
	}
}

	
*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
/*	
public static void main(String [ ] args){

char test;
 
String Testing ,Retesting;

Testing = "HAllo WE are Testing The AbiLIty to cHANGE MixEd CAse Letters into LOwer or UpperCaSE";

Retesting = Testing.toLowerCase();// every word in 'Testing' will be lowercase


System.out.println(Testing.toUpperCase()); // Every word will be uppercase 
// to get lowercase letters throughout replace 'UppperCase' with 'LowerCase'

test = Testing.charAt(3);
     *
	 * to display the # of characters in the string 'Testing' we can	  use two methods
	 *
	 *( 1 ) we can store the value in an int variable and then display   	that invariable on the taerminal. like below. 
         int tests = Testing.length();
         System.out.println(tests);
       
       ( 2 ) we can directly use the length method and type it directly 	in println statement like below
       
			System.out.println(Testing.length());
     
         
    
	String Tests = Testing.toLowerCase();  
	
	System.out.println(Tests.substring(0,70));
 
	*/
	
	/*
  double mint2= 239.9731;
 
 int mint = (int)mint2;// double to int conversion (esplicit type casting)
 
 mint2 = mint; //implicit type casting int -> double
 
 System.out.println(mint2);
 */
   
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* 
	 * 		A program about file handling 
	 * 
	 * 
	 * the loop below asks for the name of the user and then saves it into the file Mwansa.txt. It requires a total of 3 names/users for the loop to stop

	
	public static void main(String[]args) throws IOException
	{
	int number_of_member = 0;
		
	while (number_of_member < 3){		//start of loop 
			
		String Name = JOptionPane.showInputDialog("May you pleas enter your name"); //box to collect names of user

	
		
			FileWriter textFile = new FileWriter("philipps.txt", true);
		
			PrintWriter write = new PrintWriter(textFile);
			
			write.print("hallo mr :" + Name+ "\n");//print to the file philipps.txt 
			
			
			textFile.close();	//stop operation to file
		
			number_of_member +=1;	//increment value of members by 1
	}			
	Scanner readFile = new Scanner(new FileReader("philipps.txt"));//read data from philip.txt 
	
	while (readFile.hasNext()){//loop to continously get data from philip.txt as long as it has a next line.
			
			String data = readFile.next(); //store the data in the string variable data. readFile.next would have been used but it only reads the next word in the file and will not jump to the next line.
			
			
			System.out.println(data);//	display the data on console
	}
			
			
			
			
			
			
			
			
		}
	
	
/*
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String[]args){
		
		int seconds,hours,minutes;
		
  // Simulate the clock.
 for ( hours = 1; hours <= 12; hours++)
	{
		for ( minutes = 0; minutes <= 59; minutes++)

			{

				for ( seconds = 0; seconds <= 59; seconds++)

				{

			System.out.printf("%d:%d:%d\n",hours, minutes, seconds);

				}

			}

		}

	}
	
	
	*/
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 											 THE NEXT TWO PROGRAMS ARE  FROM 										THE LECTURE SLIDE NESTED LOOPS
 * 
 */
	//public static void main (String[]args)	{
		
		//String num = JOptionPane.showInputDialog("ENTER THE ROW");
		
		/*a nested while  loop
		
		int i=0;
		int j=0;
		//Nested loops
		while (i < 10 ){
			
			while ( j < 10){
				System.out.print(j + "  ");
				j++;//increase value of j in inner loop
			}	
		
		System.out.println();//move to next line 
		j=0; // reset inner loop's variable
		i++; // increase value of i in outer loop
			
		}
		
		
		// a nested for loop
		
		for (int row = 1; row <= 10; row++) {
			
			for(int col = 1; col <= 10; col++){
			
				System.out.print(col + " ");
				
			}
			System.out.println();
			//inner loops variable will be reset with initialization col = 1
		
	
}				
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

								A program to display the letter N
 
		String num =JOptionPane.showInputDialog("ENTER SIZE OF MATRIX");
		
		int Size = Integer.parseInt(num);
		
		System.out.println("You have selected a "+Size+" by "+Size+" Matrix\n\n");
		int row = 0; //initial value of row
		
		while (row < Size) {  //loop will execute 10 times
			
			for(int col=1; col < Size; col++){
				
				if (col==1){
					System.out.print("1");
					
					while (col < row){
						System.out.print("0");
						col++;
					}
				}
				if (row == col  ) {
					System.out.print("1");
				}
				
				else if (col == Size-1){
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}//end of inner loop
			
			System.out.println(); //move to next row
			row++;
			
			//end of outer loop
		}
		
		
	} 
					  
*/
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//						A SIMPLE FILE HANDLING PROGRAM

//	Writing to a file , the program utilizes some basic string methods

/*

	
	public static void main(String[]args) throws IOException{
	
		
		String Filename = JOptionPane.showInputDialog("YOU ARE ABOUT TO CREATE A FILE THAT WILL SAVE YOUR USERNAME TO THE FILE OF YOUR CHOOSING \n\nPlease enter File name of your choosing");
		
		String FileName=Filename.toUpperCase()+".txt";//convert input in Filename into uppercase and add the txt extension 
		
		JOptionPane.showMessageDialog(null,"File Created :"+FileName,"INFO",JOptionPane.PLAIN_MESSAGE);
		
		//prepare to write to a file
		PrintWriter File1 = new PrintWriter(FileName);
		
		//dialog box to get user input
		String UserName = JOptionPane.showInputDialog("May you enter your user name");
		
		//user input is written to file
		File1.println("Name of User " + UserName);
		
		File1.close();//close file no longer writing to file
		
		//time to read the data
		
		Scanner UserFile = new Scanner (new FileReader(FileName));
		//data in file is stored in string variable InfoInFile
		String InfoInFile = UserFile.nextLine();
		//output printed to screen using JOptionPane
		JOptionPane.showMessageDialog(null, InfoInFile,"Comfirmation",JOptionPane.INFORMATION_MESSAGE);
		File1.close();
	}

*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public static void main (String[]args){
	
	///a program that prints a pattern
	   /*   *
		   ***
		  *****
		   ***
	        *
	     */   
	        System.out.print("    *\n   ***\n  *****\n   ***\n    *");
	
}

























































































                 }
