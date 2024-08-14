package Training;
import java.util.*;
class BankAccount {
    protected double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 100;
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal denied: " + MINIMUM_BALANCE);
        }
    }
}
public class java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s = new SavingsAccount(150);
        s.withdraw(30);
        s.withdraw(50);
        System.out.println("Final balance: " + s.getBalance());
	}

}
