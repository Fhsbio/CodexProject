package game;

import java.util.ArrayList;
import java.util.Iterator;

import cards.Card;
import cards.Symbols;

public class Manuscript {
	 	private final int rows = 6; //NON SI SA
	    private final int columns = 5; //NON SI SA
	    private Card matrix[][];
	    
	    public Manuscript() {
	        matrix = new Card[rows][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                
	               // matrix[i][j] = Symbols.EMPTY;
	            }
	        }
	    }

	    /**
	     *
	     * @return the matrix of Manuscript
	     */
	    public Card [][] getManuscript() {
	        return matrix;
	    }
	    
	    /**
	     *
	     * @return the number of empty cells on the manuscript?
	     */
	    public int NumberOfEmptyCells() {
	        int count = 0;
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                Symbols empty = Symbols.EMPTY;
					if (matrix[i][j].equals(empty)) {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	    
	    /**
	     *
	     * @param column
	     * @return the number of empty cells on the single column
	     */
	    public int NumberOfEmptyCellsOnColumn(int column) {
	        int count = 0;
	        for (int i = 0; i < matrix.length; i++) {
	            Symbols empty = Symbols.EMPTY;
				if (matrix[i][column].equals(empty)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    /**
	     *
	     * @return true if the Manuscript is full????????
	     */
	    public Boolean isFull() {
	        if (this.NumberOfEmptyCells() == 0) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    
	    /**
	     *
	     * @param column
	     * @param numberOfSymboles
	     * @return true if there is enough empty cells on the column for the number
	     * of Symboles??????????
	     */
	    public Boolean isPlaceable(int column, int numberOfSymboles) {
	        if (this.NumberOfEmptyCellsOnColumn(column) >= numberOfSymboles) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    
	    
	    
	 /**
	 * a method that fills the column with the symbols passed
     *
     * @param column
     * @param symbols
     * @return true if the filling of column has been done successfully false
     */
    public boolean fillColumn(int column, ArrayList<Symbols> symbols) {
        Iterator<Symbols> it = symbols.iterator();
        if (isPlaceable(column, symbols.size())) {
            int firstEmpty = 0;
            //searches for the first empty element in the specified column
            for (int i = 0; i < matrix.length; i++) {
                if (this.matrix[i][column].equals(Symbols.EMPTY)) {
                    firstEmpty = i;
                }
            }
            //the element 0 will be placed first and so on
            while (it.hasNext()) {
                //matrix[firstEmpty][column] = it.next();
                firstEmpty--;
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return an array of two positions, in the first element we have the
     * column with the maximum number of empty cells. in the second element we
     * have the number of empty symbols if it is smaller than 3.
     */
    public int[] nMaxsymbols() {
        int cont = 0;
        int colCon[] = new int[2];
        for (int i = 0; i < columns; i++) {
            if (cont < this.NumberOfEmptyCellsOnColumn(i)) {
                cont = this.NumberOfEmptyCellsOnColumn(i);
                colCon[0] = i;
                colCon[1] = cont;
            }
        }
        if (colCon[1] > 3) {
            colCon[1] = 3;
        }
        return colCon;
    }

    /**
     * a method that use the DFS algorithm, a recursive algorithm that uses the
     * backtracking principle , to calculate the score obtained
     *
     * @return the score obtained
     */
    public int nearbySymbolsScore() {
        int score = 0;
        boolean[][] discovered = new boolean[6][5]; // a boolean used for the DFS algorithm to mark the counted cell
        for (int i = 0; i < 6; i++) { //initialize the boolean matrix to false
            for (int j = 0; j < 5; j++) {
                discovered[i][j] = false;
            }
        }
        Symbols[] symbol  = new Symbols[]{Symbols.ANIMAL_KINGDOM, Symbols.FUNGI_KINGDOM, Symbols.INSECT_KINGDOM, Symbols.PLANT_KINGDOM, Symbols.INKWELL, Symbols.MANUSCRIPT, Symbols.QUILL};// an array that contain all the symbols
        for (int i = 0; i < symbol.length; i++) {//a loop that repeat the following operations for all type of symbol
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (matrix[j][k].equals(symbol[i]) && !discovered[j][k]) { //find the cell that contain the same symbol contained in symbol[i] and not counted yet
                        int groupSize = dfs(j, k, symbol[i], discovered); //groupSize contain the number of nearby symbol on the same group that obtained from the dfs method;
                        if (groupSize == 3) {
                            score += 2;
                        } else if (groupSize == 4) {
                            score += 3;
                        } else if (groupSize == 5) {
                            score += 5;
                        } else if (groupSize >= 6) {
                            score += 8;
                        }
                    }
                }
            }
        }
        return score;
    }

    /**
     * the method that implement the DFS algorithm
     *
     * @param i contain the position of the current symbol
     * @param j contain the position of the current symbol
     * @param symbol contain the symbol founded by the method nearbysymbolsScore on the
     * first round of the recursion
     * @param discovered a matrix of boolean to mark the cell counted
     * @return the number of nearby symbol on the same group
     */
    private int dfs(int i, int j, Symbols symbol, boolean[][] discovered) {
        /*the base condition of the recursion method that return 0 if the position is not available on the matrix
			or the new cell not contain the same symbol, or the cell is already counted
		 * */
        if (i < 0 || i >= rows || j < 0 || j >= columns || !(matrix[i][j].equals(symbol)) || discovered[i][j]) {
            return 0;
        }
        discovered[i][j] = true; //mark the current cell as discovered 
        /*if the cell contain the same symbol contained on the precedent cell
	     * return 1 + the number of symbol of the nearby symbol and call the same method to do the same check
         */
        return 1 + dfs(i - 1, j, symbol, discovered) + dfs(i + 1, j, symbol, discovered)
                + dfs(i, j - 1, symbol, discovered) + dfs(i, j + 1, symbol, discovered);
    }

    @Override
    public String toString() {
        String s = "";

        //build of the first row with all the indexs
        for (int j = 0; j < matrix[0].length; j++) {
            s += j + "\t";
        }
        s += "\n";
        //build of the rest of the matrix in the string
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                s += matrix[i][j] + "\t";
            }
            s += "\n";
        }
        return s;
    }
	    
	    
	    
	    
}
