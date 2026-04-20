import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("> Thank you for banking with us. Let's create your account.");
		
		BankAccount account = new BankAccount("", "", 0, 0.0);
		account.setFirstName(scnr);
		account.setLastName(scnr);
		account.setAccountID(scnr);
		
		System.out.println("> Thank you.");
		while (true) {
			System.out.println("> Choose from the following options: ");
			System.out.println("> DEPOSIT");
			System.out.println("> WITHDRAWAL");
			System.out.println("> SUMMARY");
			String response = scnr.nextLine().toUpperCase();
				if (response.equals("DEPOSIT")) {
				account.deposit(scnr);
				}
				else if (response.equals("WITHDRAWAL")) {
					account.withdrawal(scnr);
				}
				else if (response.equals("SUMMARY")) {
					account.accountSummary();
				}
				else {
					System.out.println("> Please try again.");
			}
	}
	
	}
}
