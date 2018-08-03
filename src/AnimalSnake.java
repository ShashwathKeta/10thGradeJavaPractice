
public class AnimalSnake implements Animal{
	
	private int averageLifeSpan = 9;
	
	public boolean isACarnivore() {
		
		System.out.println("Snake is a Carnivore");
		return true;
	}
	
	public int howManyLegs() {
		
		System.out.println("Snake has 0 legs");
		return 0;
	}
	
	public int averageLifeSpan() {
		
		System.out.println("Snake has an average life span of 9 years.");
		return averageLifeSpan;
	}
}
