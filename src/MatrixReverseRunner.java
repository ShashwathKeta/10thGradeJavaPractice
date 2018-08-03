
public class MatrixReverseRunner {
	public static void main(String[] args) {
		int[][] mat = { {1,2},
				{3,4},
				{5,6}
			  };
		MatrixReverse obj = new MatrixReverse(mat);
		obj.reverseMatrix();
	}
}