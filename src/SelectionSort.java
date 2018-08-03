
public class SelectionSort {
	
	private int[] unsortedArray = new int[10];
	private int[] sortedArray = new int[10];
	
	public SelectionSort(int[] arr) {
		unsortedArray = arr;
	}
	
	public int[] sort() {
		int minPos = 0;
		int min = unsortedArray[0];
		
		for (int j = 0; j < sortedArray.length; j++) {
			
			min = Integer.MAX_VALUE;
			
			for (int i = 0; i < sortedArray.length; i++) {
				if (unsortedArray[i] < min) {
					min = unsortedArray[i];
					minPos = i;	
				}

				//System.out.println( "sortedArray[" + i + "] " + sortedArray[i] 
						//+ "\tunsortedArray[" + i + "] " + unsortedArray[i] + "\tmin = " + min);
	
			} 
			sortedArray[j] = min;
			unsortedArray[minPos] = Integer.MAX_VALUE;
		}
		
		return sortedArray;
	}
}
