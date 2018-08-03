
public class MatrixManipulation {
	
	int [][] matrix;
	
	public MatrixManipulation(int [][] mat) {
		matrix = mat;
	}
	
	public int[][] topToBottom(){
		int height = matrix.length;
		int numCols = matrix[0].length;
		
		for(int col = 0; col < numCols; col++) {
			for(int row = 0; row < height; row++) {
				matrix[height-row-1][col] = matrix[row][col];
			}
		}
		return matrix;
	}
}
