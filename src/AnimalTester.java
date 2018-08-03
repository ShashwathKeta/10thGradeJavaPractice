import java.util.Scanner;

public class AnimalTester {

	public static void main(String[] args) {
		
		AnimalFactory factory = new AnimalFactory();
		Scanner scan = new Scanner(System.in);
		String myAnimal;
		
		while(true) {
			System.out.print("What Animal would you like to create? ");
			myAnimal = scan.next();
			

			if(myAnimal.equals("q")) {
				break;
			}
			
			Animal animal = factory.getAnimal(myAnimal);
			
			System.out.println(myAnimal + " Successfully created");
			animal.isACarnivore();
			animal.howManyLegs();
			animal.averageLifeSpan();
			System.out.println("\n");
			
			/*if(input.equals("Cheetah")) {
				Animal cheetah = factory.getAnimal("Cheetah");
				
				System.out.println("Cheetah Successfully created");
				cheetah.isACarnivore();
				cheetah.howManyLegs();
				cheetah.averageLifeSpan();
				System.out.println("\n");
			}
			
			else if(input.equals("Human")) {
				Animal man = factory.getAnimal("Human");
				
				System.out.println("Human created Successfully");
				man.isACarnivore();
				man.howManyLegs();
				man.averageLifeSpan();
				System.out.println("\n");
			}
			
			else if(input.equals("Snake")) {
				Animal snake = factory.getAnimal("Snake");
				
				System.out.println("Snake created Successfully");
				snake.isACarnivore();
				snake.howManyLegs();
				snake.averageLifeSpan();
				System.out.println("\n");
			}*/
			
		}
	}
}
