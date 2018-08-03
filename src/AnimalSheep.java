
public class AnimalSheep implements Animal{

	private int averageLifeSpan = 11;
	
	public boolean isACarnivore() {
		
		System.out.println("Sheep is a not a Carnivore");
		return false;
	}
	
	public int howManyLegs() {
		
		System.out.println("Sheep has 4 legs");
		return 4;
	}
	
	public int averageLifeSpan() {
		
		System.out.println("Sheep has an average life span of 12 years");
		return averageLifeSpan;
	}
}

