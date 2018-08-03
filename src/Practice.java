
public class Practice {
	public static int whatisit(int x, int y) {
		if(x>y) {
			return x*y;
		}
		else {
			return whatisit(x-1,y);
		}
	}
	
	public static void main(String[] args) {
		
		/*int [] unsortedArray = {10,3,4,7,2,39,20,34,76,31};
		SelectionSort obj = new SelectionSort(unsortedArray);	
		
		System.out.print("Original List: ");
		for(int i = 0; i < unsortedArray.length; i++) {
			// returned = returned + sortedArray[i] + " ";
			System.out.print(unsortedArray[i] + " ");

		}
		
		int[] sortedArray = obj.sort();
		
		System.out.print("\nSorted List: ");
		for(int i = 0; i < sortedArray.length; i++) {
			// returned = returned + sortedArray[i] + " ";
			System.out.print(sortedArray[i] + " ");*/

		}
		
}
