package cards;

import java.util.ArrayList;
import java.util.Iterator;

public class Card {
	 private final int rows = 3;
	    private final int columns = 3;
	    private Symbols matrix[][];
	    
	    public Card() {
        matrix = new Symbols[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                
                matrix[i][j] = Symbols.EMPTY;
            }
        }
    }
	    
	    /**
	     *
	     * @return the matrix of card
	     */
	    public Symbols[][] getCard() {
	        return matrix;
	    }

	     

}
