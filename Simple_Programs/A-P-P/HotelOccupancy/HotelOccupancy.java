/*
 Name: Philip Mumbi
 
 Question:
A hotel’s occupancy rate is calculated as follows:

Occupancy rate = N umber of rooms occupied ÷ T otal number of rooms

Write a program that calculates the occupancy rate for each floor of a hotel. The program should start by asking for the number of floors in the hotel. A loop should then iterate once for each floor. During each iteration, the loop should ask the user for the number of rooms on the floor and the number of them that are occupied. After all the iterations,the program should display the number of rooms the hotel has, the number of them that are occupied, the number that are vacant, and the occupancy rate for the hotel.

INPUT VALIDATION: Do not accept a value less than 1 for the number
of floors. Do not accept a number less than 10 for the number of rooms on a floor.

 */
import javax.swing.*;
import java.util.*;

class HotelOccupancy{
	
	public static void main(String[]args){
	 
		//create a scanner method
		Scanner scan= new Scanner(System.in);
		
		//ask the user for input
		System.out.print("Enter the number of floors in the hotel: ");
		
		//store input in variable
		int NumberOfFloors =scan.nextInt();
		
		//initialize number of rooms
		double TotalNumberOfRooms=0.0;
		
		//initialize number of occupied rooms
		double TotalNumberOfOccupiedRooms=0.0;
		
		//initialize vacant rooms
		int TotalNumberOfRoomsVacant=0;
		
		//initialize occpancy rate
		//double Occupancy=0.0;
		
		//loop to get user input if number of floors is less or equal to 1
		while (NumberOfFloors<1||NumberOfFloors==1){
			
			//ask the user for input
			System.out.print("\nA hotel does not have 1 or less Floors,\nEnter the number of floors in the hotel: ");
			//store the input (if the input is less or equal to one the loop will iterate)
			NumberOfFloors = scan.nextInt();
		}
		
		//Current floor
		int CurrentFloor=1;
		//loop to get user input
		while (CurrentFloor<=NumberOfFloors){
		
				//ask the user for input
				System.out.print("\n("+CurrentFloor+" floor) Enter the number of rooms on this floor: ");
				
				//store the input
				int NumberOfRooms = scan.nextInt(); 
				
				while (NumberOfRooms<10){
					
					//ask the user for input
					System.out.print("\n("+CurrentFloor+" floor) Enter the number of rooms on this floor more than 10: ");
				
					//store the input
					NumberOfRooms = scan.nextInt(); 
					
				}
				
				//ask user for input
				System.out.print("How many rooms are occupied? ");
				
				//store the input
				int OccupiedRooms = scan.nextInt();
				
				while (OccupiedRooms<0||OccupiedRooms>NumberOfRooms){
					
					//ask user for input
					System.out.print("How many rooms are occupied (greater than 0 and less or equal to number of rooms) ? ");
				
					//store the input
					OccupiedRooms = scan.nextInt();
					
				}
				
				//add number of rooms to total number of rooms
				TotalNumberOfRooms+= NumberOfRooms;
				
				//add occupied rooms to total number of occupied rooms
				TotalNumberOfOccupiedRooms+= OccupiedRooms;
				
				//increase the value of Current Floor (indicates the floor which is being checked)
				CurrentFloor++;
			
		}
		
		int NumOfRooms = (int)TotalNumberOfRooms;
		int NumOfOccupied = (int)TotalNumberOfOccupiedRooms;
		
		//calculate total number of rooms vacant
		TotalNumberOfRoomsVacant=(int)(TotalNumberOfRooms-TotalNumberOfOccupiedRooms);
		
		//calculate occupancy rate
		Double Occupancy = TotalNumberOfOccupiedRooms / TotalNumberOfRooms;
		
		//show number of rooms
		System.out.println("\nNumber of rooms the hotel has is: "+NumOfRooms);
		
		//show number of occupied rooms
		System.out.println("Number of rooms occupied is: "+NumOfOccupied);
		
		//show number of vacant rooms
		System.out.println("Number of rooms vacant is: "+TotalNumberOfRoomsVacant);
		
		//show hotel occupancy rate
		System.out.printf("Occupancy rate of the hotel is: "+"%1.2f",Occupancy);
	
		
	}
	
	
}
