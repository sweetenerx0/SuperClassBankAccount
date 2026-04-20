import java.util.Scanner;
import java.util.InputMismatchException;
public class CheckingAccount extends BankAccount {

    public double interestRate;
    public static double overdraft = 30.00;

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID, 0.0);
        this.interestRate = interestRate;
    }
    public void processWithdrawal(Scanner scnr) {
        double withdrawalAmount;
        while (true) {
            System.out.print("> Enter withdrawal amount: ");
            try {
                withdrawalAmount = scnr.nextDouble();
                scnr.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("> Invalid input, please enter a number.");
                scnr.nextLine();
            }
        }
        processWithdrawal(withdrawalAmount);
    }
    private void processWithdrawal(double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            balance -= withdrawalAmount + overdraft;
            System.out.println("> Overdraft fee of $30 charged.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("> $" + withdrawalAmount + " has been withdrawn from your balance.");
        }
        System.out.println("> Current balance $" + balance);
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("> Current interest rate is " + interestRate + "%");
    }
}