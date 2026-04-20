import java.util.Scanner;
import java.util.InputMismatchException;
public class BankAccount {
	public String firstName;
	public String lastName;
	public int accountID;
	public double balance;
	
	public BankAccount( String firstName, String lastName, int accountID, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountID = accountID;
		this.balance = balance;
	}
	public void deposit(Scanner scnr) {
		while (true){
			System.out.println("> Enter deposit amount: ");
			try {
				double depositAmount = scnr.nextDouble();
				scnr.nextLine();
				if (depositAmount < 0) {
					System.out.println("> Please try again.");
					}
				else {
					balance += depositAmount;
					System.out.println("> $" + depositAmount + " has been deposited to your balance.");
					System.out.println("> Current balance $" + balance);
					break;
					}
			}
			catch (InputMismatchException e) {
	            System.out.println("> Please try again");
	            scnr.nextLine();
	        }
		}
	}
	public void withdrawal(Scanner scnr) {
	    while (true) {
	        System.out.print("> Enter withdrawal amount: ");
	        try {
	            double withdrawalAmount = scnr.nextDouble();
	            scnr.nextLine(); // clear newline

	            if (withdrawalAmount <= 0) {
	                System.out.println("> Please try again");
	            }
	            else {
	                balance -= withdrawalAmount;
	                System.out.println("> $" + withdrawalAmount + " has been withdrawn from your balance.");
	                System.out.println("> Current balance $" + balance);
	                break;
	            }
	        }
	        catch (InputMismatchException e) {
	            System.out.println("> Please try again");
	            scnr.nextLine();
	        }
	    }
	}
	public void setFirstName(Scanner scnr) {
		System.out.println("> Enter first name: ");
		firstName = scnr.nextLine().toUpperCase();
	}
	public void setLastName(Scanner scnr) {
		System.out.println("> Enter last name: ");
		lastName = scnr.nextLine().toUpperCase();
	}
	public void setAccountID(Scanner scnr) {
		while (true) {
			System.out.println("> Enter account ID: ");
			try {
				accountID = scnr.nextInt();
				scnr.nextLine();
				break;
			}
			catch (Exception e) {
				System.out.println("> Please try again.");
					scnr.nextLine();
				}
			}
		}
	public void accountSummary() {
		System.out.println("> " + lastName + ", " + firstName + " account # " + accountID);
		System.out.println("> Your current balance is $" + balance);
		
	}
	}

