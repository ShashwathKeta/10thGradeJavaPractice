import java.util.ArrayList;

public class Person {
	
	private String name;
	private String username;
	private String password;
	private ArrayList<BankAccount> accounts;
	
	public Person(String nam, String user, String pass) {
		name = nam;
		username = user;
		password = pass;
		accounts = new ArrayList<BankAccount>();
	}
	
	public ArrayList<BankAccount> getAccounts() {
		return accounts;
	}



	public void setAccounts(ArrayList<BankAccount> accounts) {
		this.accounts = accounts;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	public void createAccount(int number) {
		BankAccount account = new BankAccount(number);
		accounts.add(account);
	}
	
	public boolean deposit(int accountNumber, double amount) {
		
		for(BankAccount item: accounts) {
			if(item.getNumber()==accountNumber) {
				item.deposit(amount);
				return true;
			}
		}
		return false;
	}
	
public boolean withdraw(int accountNumber, double amount) {
		
		for(BankAccount item: accounts) {
			if(item.getNumber()==accountNumber) {
				item.withdraw(amount);
				return true;
			}
		}
		return false;
	}
}
