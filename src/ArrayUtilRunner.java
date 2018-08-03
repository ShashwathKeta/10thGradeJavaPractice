
public class ArrayUtilRunner {
	public static void main(String[] args0) {
		int[] arr = {2,7,5,1};
		
		ArrayUtil.reverseArray(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
