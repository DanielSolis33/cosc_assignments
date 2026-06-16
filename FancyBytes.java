
package cosc_assignments;

import java.util.Scanner; 

public class KBytes {

//double grandTotal = TAX_RATE; 
	//String choice = "";


		//constant for tax rate
		private static final double TAX_RATE = 0.0825; 
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
						
			  // Patron chooses to dine or not
	        System.out.println("Welcome to K-Bytes");
	        String welcomeMenu = chooseOption (scanner);
	        
	        // Menu loop
	        displayMenu(scanner, menuNumber, subTotal);
	        
	        // Call the method to calculate total price
	        double subTotal = calculateSubTotal(itemCount, scanner);
	        
	     // Apply a discount if the total price exceeds a certain threshold
	        if (subTotal > 0) {
	            subTotal = applyTax(subTotal, TAX_RATE);
	            System.out.println("Total with tax:");
	        }

	        
	        
		}		        
		   
		while (choice=1) {
		
	        public static String chooseOption(Scanner scanner) {
	            System.out.println("What would you like to do?");
	            System.out.println("1. See our menu items");	            
	            System.out.println("2. Exit the app");
	            System.out.print("Enter your choice (1-2): ");

	            int choice = scanner.nextInt();
	            
	        switch (choice) {
	        case 1:
	            	System.out.println("Here are your options:");
	            	String displayMenu() {
						return null;
					}
	            	break;
	        case 2:
	        	System.out.println("Thank you, have a great day!");
	        	String choice(int==2);
	        	break;
	        default:
	        	System.out.println("Invalid option, please select 1 or 2.");
	        	
	        
	            scanner.close();  
	            
	            
	        } 	        	        
	     	        
	        public static void displayMenu(Scanner scanner, String menuNumber, int subTotal) {
		       
		     
		            System.out.println("A wild monster appears!");

		            // while loop since it won't run if the condition is false AKA they chose to exit the menu for the jump
		            while (menuNumber) {
		                // 
		                System.out.println("\nWhat would you like to eat?");
		                System.out.println("1. Mandu (2pc) $12.99");
		                System.out.println("2. Beef Bibimbap $17.99");
		                System.out.println("3. Beef Bulgogi $17.99");
		                System.out.println("4. Tuna Kimbap $8.99");
		                System.out.println("5. Restart Order");
		                System.out.println("6. Complete order and print Receipt");
		                System.out.print("Please enter your selection (1-6): ");
		                
		                int choice = scanner.nextInt();
		                
		             switch (choice) {
		             case 1:
			            	System.out.println("Here are your options:");
			            	String displayMenu() {
								return null;
							}
			            	break;
		             case 2:
		            	 	System.out.println("Thank you, have a great day!");
		            	 	String choice(int==2);
		            	 	break;
		             case 3:
		            	 	System.out.println("Here are your options:");
		            	 	String displayMenu() {
							return null;
							}
		            		break;
		             case 4:
		            	 	System.out.println("Thank you, have a great day!");
		            	 	String choice(int==2);
		            	 	break;
		             case 5:
		            	 	System.out.println("Here are your options:");
		            	 	String displayMenu() {
		            	 	return null;
		            	 	}
		            	 	break;
		             case 6 :
		            	 	System.out.println("Thank you, have a great day!");
		            	 	String choice(int==2);
		            	 	break;
			        default:
			        	System.out.println("Invalid option, please select 1 or 2.");
			        	
			        
			            scanner.close();  
		             }
		        }
		            public static double calculateTotal(int itemCount, Scanner scanner) {
		                double totalPrice = 0.0;

		                // Loop to get the price of each item and calculate the total
		                for (int i = 1; i <= itemCount; i++) {
		                    System.out.print("Enter the price of item " + i + ": ");
		                    double price = scanner.nextDouble();
		                    totalPrice += price;  // Add the price of the item to the total
		                }

		                return totalPrice;
		            }

		            public static double applyTax(double total, double tax) {
		                return total * (1 + tax);  // Apply tax and return the new total
		            }
		        }