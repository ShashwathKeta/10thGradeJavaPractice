
public class AnimalFactory {
	
	public Animal getAnimal(String animalType) {
		
		if(animalType.equals("Cheetah")) {
			return new AnimalCheetah();
		}
		
		else if(animalType.equals("Human")) {
			return new AnimalHuman();
		}
		
		else if(animalType.equals("Snake")) {
			return new AnimalSnake();
		}
		
		else if(animalType.equals("Sheep")) {
			return new AnimalSheep();
		}
		
		else {
			return null;
		}
	}
}