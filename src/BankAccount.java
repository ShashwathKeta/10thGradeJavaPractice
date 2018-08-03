
public class BankAccount {
	
	private int number;
	private double balance;
	
	public BankAccount(int num) {
		balance = 0;
		number = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
