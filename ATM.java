import java.util.*;
public class ATM {
    private static double balance = 0;
    public ATM(double in_Balance) {
        this.balance = in_Balance;
    }
    static void checkBal() {
        System.out.printf("Available Balance is Rs. %.2f  \n", balance);
    }
    static void withdraw(double amount) {
        if(amount < 0) {
            System.out.println("Invalid amount");
            checkBal();
            return;
        }
        if(amount <= balance) {
            balance -= amount;
            System.out.printf("Successfully withdrew Rs. %.2f \n", amount);
            checkBal();
        }
        else {
            System.out.println("Insufficient Balance");
            checkBal();
        }
    }
    static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited Rs. %.2f \n", amount);
            checkBal();
        }
        else {
            System.out.println("Invalid Amount!!");
        }
    }
    static void to_choose() {
        System.out.println("\nEnter 1 to withdraw money");
        System.out.println("Enter 2 to deposit money");
        System.out.println("Enter 3 to check your balance");
        System.out.println("Enter 4 to exit");
        System.out.print("Choose an option : ");
    }
    public static void main(String args[]) {
        double rand = Math.random() * 10000;
        ATM atm = new ATM(rand);
        to_choose();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        while(choice != 4) {
            switch(choice) {
                case 1:
                    System.out.print("Enter amount to withdraw : ");
                    double wid_amount = sc.nextDouble();
                    withdraw(wid_amount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : ");
                    double dep_amount = sc.nextDouble();
                    deposit(dep_amount);
                    break;
                case 3:
                    checkBal();
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
            to_choose();
            choice = sc.nextInt();
        }
        System.out.println("Thank You for using the ATM. Goodbye!");
    }
}