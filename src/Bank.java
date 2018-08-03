import java.util.ArrayList;

public class Bank {
	
	ArrayList <Person> people;
	
	public Bank() {
		people = new ArrayList<Person>();
	}
	
	public boolean signUp(String name, String user, String pass) {
		
		for(Person item: people) {
			if(item.getName().equals(name)) {
				System.out.println("Name already taken");
				return false;
			}
		}
		
		people.add(new Person(name, user, pass));
		return true;
	}
	
	public boolean createAccount(String name, int number) {
		for(Person item: people) {
			if(item.getName().equals(name)) {
				item.createAccount(number);
				return true;
			}
		}
		return false;
	}
	
	public String getAccountHolders() {
		String accountHolders = "";
		
		for(Person item: people) {
			
			if(item.getAccounts().isEmpty()) {
				
			}
			else {
				accountHolders = accountHolders + item.getName() + "\n";
			}
		}
		
		return accountHolders;
	}
}