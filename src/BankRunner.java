
public class BankRunner {
	public static void main(String[] args) {
		Bank test = new Bank();
		test.signUp("Shreshi", "Shreshiters", "dubba");
		test.createAccount("Shreshi", 1000);
		
		if(test.signUp("Shreshi", "SomeDude", "notDubba")) {
			System.out.println("Sign up successful");
		}
		else {
			System.out.println("Sign up Failed");
		}
				
		test.createAccount("Shashi", 1001);
		
		System.out.println(test.getAccountHolders());
	}
}
