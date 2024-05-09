package carte;

public class SpecialPositions {

	public int specialNum(int[][] mat) {
		
		//Create and init a matrix
		int rows = mat.length, cols = mat[0].length;
        int rowSum[] = new int[rows], colSum[] = new int[cols];
        
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                  rowSum[r] += mat[r][c];
            }
        }

        for(int c = 0; c < cols; c++){
            for(int r = 0; r < rows; r++){
                  colSum[c] += mat[r][c];
            }
        }
        
        int s = 0;
        for(int r = 0; r<rows; r++){
            for(int c = 0; c < cols; c++){
                if(mat[r][c] == 1 && rowSum[r] == 1 && colSum[c] == 1)s++;
            }
        }
        return s;
	}
}
