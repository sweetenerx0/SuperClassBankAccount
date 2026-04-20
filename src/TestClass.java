import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("> TEST CHECKING ACCOUNT");
        CheckingAccount checkAcct = new CheckingAccount("Dani", "Munoz", 123456, 0.05);
        checkAcct.displayAccount();
        System.out.println("> TEST DEPOSIT METHOD");
        checkAcct.deposit(scnr);
        System.out.println("> TEST WITHDRAWAL METHOD");
        checkAcct.processWithdrawal(scnr);
        System.out.println("> TEST OVERDRAFT WITHDRAWAL");
        checkAcct.processWithdrawal(scnr);
        System.out.println("> TEST ACCOUNT SUMMARY");
        checkAcct.displayAccount();
    }
}