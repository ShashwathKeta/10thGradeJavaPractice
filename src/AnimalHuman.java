
public class AnimalHuman implements Animal{

private int averageLifeSpan = 79;
	
	public boolean isACarnivore() {
		
		System.out.println("Human is a Carnivore");
		return true;
	}
	
	public int howManyLegs() {
		
		System.out.println("Human has 2 legs");
		return 2;
	}
	
	public int averageLifeSpan() {
		
		System.out.println("Human has an average life span of 79 years.");
		return averageLifeSpan;
	}
}
