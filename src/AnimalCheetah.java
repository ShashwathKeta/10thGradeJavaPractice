
public class AnimalCheetah implements Animal{

	private int averageLifeSpan = 11;
	
	public boolean isACarnivore() {
		
		System.out.println("Cheetah is a Carnivore");
		return true;
	}
	
	public int howManyLegs() {
		
		System.out.println("Cheetah has 4 legs");
		return 4;
	}
	
	public int averageLifeSpan() {
		
		System.out.println("Cheetah has an average life span of 11 years");
		return averageLifeSpan;
	}
}
