
/*
 Name:Philip Mumbi
 
 Question:
 
 Write a program that asks the user to enter the amount that he or she has budgeted for a month. A loop should then prompt the user to enter each of his or her expenses for the month, and keep a running total. When the loop finishes, the program should display the amount that the user is over or under budget
 
 */

import javax.swing.*;


class BudgetAnalysis{
	public static void main(String[]args) {
		
		//get user Input and convert to integer
		Double Budget = Double.parseDouble((JOptionPane.showInputDialog("Enter the Budgeted amount")));
		
		//display budget
		JOptionPane.showMessageDialog(null,"You have Budgeted to spend k"+Budget,"Info",JOptionPane.INFORMATION_MESSAGE);
	
		//set a parameter to end loop
		int Done= -1;
		
		//initialize ToatalMoneySpent
		Double TotalMoneySpent = 0.0;
		
		//Initialize Money used
		Double MoneyUsed = 0.0;
		
		//loop to get expenses
		while (MoneyUsed != Done){
			
			//ask for expenses
			MoneyUsed = Double.parseDouble((JOptionPane.showInputDialog("Enter the Budgeted amount for the month, when done enter '-1' ")));
			
			//add expenses to total money spent
			TotalMoneySpent += MoneyUsed;  
			
		}
		
		
		if(TotalMoneySpent > Budget){
			
			//calculate difference or exceeded amount
			Double MoneyExceeded = TotalMoneySpent - Budget;
			
			//Message to display if the user has used above the budget
			JOptionPane.showMessageDialog(null,"You have Exceeded your Budget by K"+MoneyExceeded,"Info",JOptionPane.INFORMATION_MESSAGE);
			
		}
	     //if user used less than budget
		else if(TotalMoneySpent < Budget){
			//calculate the surplus
			Double MoneySaved = Budget - TotalMoneySpent;
			
			//message to display if the user has used within the budget
			JOptionPane.showMessageDialog(null,"You have saved K"+MoneySaved,"Info",JOptionPane.INFORMATION_MESSAGE);
			
		}
		
		else{
			//message to display if the user has used Exactly the budget
			JOptionPane.showMessageDialog(null,"You have used Exactly the Budgeted Amount","Info",JOptionPane.INFORMATION_MESSAGE);
		}
	
		
	}
	
	
	
}
