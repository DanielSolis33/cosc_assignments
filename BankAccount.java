//Author: Daniel Solis//
	//Date 6-11-2026//
/* purpose: To develop a simple Java program that simulates basic bank account operations. 
 * The program will allow users to check their account balance, deposit funds, and withdraw money, 
 * ensuring that withdrawals do not exceed the available balance. 
 * This exercise provides practical experience with user input handling, method creation, 
 * conditional statements, and maintaining a consistent code structure. */ 

package cosc_assignments;

import java.util.Scanner; 

public class BankAccount {


		//constant for initial balance
		private static final double STARTING_BALANCE = 1000.00;
				
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double currentBalance = STARTING_BALANCE; 
			String choice = "";
			
			
		do {
			
				System.out.println("Welcome to the Bank of Narnia!");
				System.out.println();
				System.out.println("What would you like to do?");
		        System.out.println("1. Check Balance");
		        System.out.println("2. Deposit Money");
		        System.out.println("3. Withdraw Money");
		        System.out.println("4. Exit Program");
		        System.out.print("Enter your choice (1-4): ");
			
		   choice = scanner.next(); //reads as a string to prevent a crash and i preferred it to int
		   
		     currentBalance = processAction(scanner, choice, currentBalance);
		     
		} while (!choice.equals("4"));
				
				scanner.close();
				
		}	      
		private static double processAction(Scanner scanner, String choice, double currentBalance) {
		       switch (choice) {
		       		case "1":
		       			getBalance(currentBalance);
		       			System.out.println();
		               break; //using breaks to make sure the program doesn't continue automatically
		               
		       		case "2":
		       			System.out.println( "Enter the amount you would like to deposit: ");
		       			System.out.println();
		       			//just in case a user enters text or symbols
		       			if (scanner.hasNextDouble()) {		  
		       				double deposit = scanner.nextDouble();
		       			
		       			//just in case they decide to try and enter a negative number!
		       			if(deposit > 0) {
		       				currentBalance = depositMoney(currentBalance, deposit);
		       				System.out.println("ChaChing! Your money is deposited.");
		       				System.out.println();
		       			
		       			} else { 
		       				System.out.println("You cannot deposit a negative amount or $0.");
		       				System.out.println();
		       			}
		       				
		       		} else {
			       			System.out.println("Why would you try and deposit letters? This isn't the Post Office. Please enter a number.");
			       			System.out.println();
			       			scanner.next();
		       		}
		       		break;
		       			
		       		case "3":
		       			System.out.println("Enter the amount you would like to withdraw: ");
		       			
		       			//prevents text crashes 
		       			if (scanner.hasNextDouble()) {
		       				double withdrawal = scanner.nextDouble();
		       				
		       				//prevents negatives and overdrafts ... if only REAL banks protected overdrafts!
		       				if (withdrawal >0 && withdrawal <= currentBalance) {
		       					currentBalance = withdrawMoney(currentBalance, withdrawal);
		       					System.out.println("Withdrawn Successfully");
		       					System.out.println();
		       			} else if (withdrawal <= 0) {
		       				System.out.println("You cannot withdraw a negative amount or $0");
		       				System.out.println();
		       					
		       			} else {
		       				System.out.println("WhompWhomp, Insufficient Funds!");
		       				System.out.println();
		       			}
		       		} else {
		       			System.out.println("Why would you try and withdraw letters? This isn't the Post Office. Please enter a number.");
		       			System.out.println();
		       			scanner.next();
		       		}
		       			break;
		       			
		       		case "4":
		       			System.out.println("Adios!");
		       			break;
		           	
		       		default:
		       		   System.out.println();
		               System.out.println(" **Invalid choice. Choose (1-4)** ");		
		               System.out.println();
		               break;
		       }
		       return currentBalance; //makes sure the new balance is sent back to main loop
			}
//makes this modular and clean rather than implementing the methods in the main
		private static void getBalance(double currentBalance) {
			System.out.println();
			System.out.printf("Your current balance is: $%.2f%n", currentBalance);
			System.out.println();
		}
		
		 private static double depositMoney(double currentBalance, double depositAmount) {
				
				return currentBalance + depositAmount;
		
		 }
		private static double withdrawMoney(double currentBalance, double withdrawalAmount) {
		
			return currentBalance - withdrawalAmount;
		}

		
}

	

		 
 
