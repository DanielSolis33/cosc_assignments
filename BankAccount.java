package cosc_assignments;

import java.util.Scanner; 

public class BankAccount {

	//constant  for starting account balance
	private static final int STARTING_BALANCE = 1000;
	

	public static String chooseOptions(int currentBalance) {
		System.out.println("Welcome to the Bank of Narnia!");
		System.out.println("What would you like to do?");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit Program");
        System.out.print("Enter your choice (1-4): ");
	

    // Return the value based on user selection
       switch (choice) {
       		case 1:
       			return "Your current balance is: $" + currentBalance;
               
       		case 2:
       			return "Enter the amount you would like to deposit: ";
           
       		case 3:
       			return "Enter the amount you would like to withdraw: ";
       		case 4:
       			return "Exit";
           	
       		default:
               System.out.println("Invalid choice. ");
               return "Choose (1-4)";
       }
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		String menuOptions = chooseOptions();
		
		
		int depositAmount = 0;
		int depositBalance = STARTING_BALANCE + depositAmount;
		
		int withdrawalAmount = 0;
		int withdrawalBalance = STARTING_BALANCE - withdrawalAmount ;
		
		//menu loop: user wants to do more
		nextAction(scanner, menuOptions, depositBalance, withdrawalBalance);
		
	}

        
	 private static int subtractMoney(int currentBalance, int withdrawalAmount) {
		// TODO Auto-generated method stub
		return currentBalance - withdrawalAmount;
	}

	 private static int addMoney(int currentBalance, int depositAmount) {
		// TODO Auto-generated method stub
		return currentBalance + depositAmount;
	}

	 public static int initializeBalance(String menuOptions  ) {
	        switch (menuOptions) {
	            case "Check Balance":
	                return STARTING_BALANCE;
	         
	            default:
	                return STARTING_BALANCE;  // Default to initial balance
	        }
	    }
        private static void nextAction(Scanner scanner, String optionsMenu, int currentBalance, int withdrawalBalance) {
    		
    		
    	
	}
        
      
        
	}
