
public class MatrixReverse{
	private int[][] mat;
	
	public MatrixReverse(int [][] m) {
		mat = m;
	}
	
	public void reverseAllRows() {
		
		System.out.println("Original Matrix");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j< mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int j = 0; j < mat.length; j++){
		    /*for(int i = 0; i < mat[j].length / 2; i++) {
		        int temp = mat[j][i];
		        mat[j][i] = mat[j][mat[j].length - i - 1];
		        mat[j][mat[j].length - i - 1] = temp;
		    }*/
			ArrayUtil.reverseArray(mat[j]);
		}
		
		System.out.println("Reversed Rows Matrix");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j< mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void reverseMatrix() {
		
		System.out.println("Original Matrix");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j< mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}	
		for (int j = 0; j < mat.length; j++) {
			for (int i = 0; i < mat[j].length / 2; i++) {
				int temp = mat[j][i];
				mat[j][i] = mat[mat.length - j - 1][mat[j].length - i - 1];
				mat[mat.length - j - 1][mat[j].length - i - 1] = temp;
			} 
		}
		System.out.println("Reversed Matrix");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j< mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
