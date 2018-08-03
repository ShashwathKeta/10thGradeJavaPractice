
public class Deck {
	public static void main(String[] args) {
		int[] numArr = {5,7,3,9,12};
		int check = 100;
		
		for(int i: numArr) {
			if(i<check) {
				check=i;
			}
		}
		System.out.println("The lowest number in the array is: " + check);
	}
}
