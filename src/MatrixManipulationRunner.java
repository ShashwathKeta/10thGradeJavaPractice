
public class MatrixManipulationRunner {

	public static void main(String[] args) {
		int[][] mat = {
				{2,4,6,3},
				{1,3,5,6},
				{8,9,0,5},
				{10,11,12,13},
				{5,3,2,5}
		};
		
		MatrixManipulation obj = new MatrixManipulation(mat);
		int[][] newMat = obj.topToBottom();
		
		for(int i = 0; i < newMat.length; i++) {
			for(int j = 0; j< newMat[0].length; j++) {
				System.out.print(newMat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
