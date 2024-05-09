package cards;
//NON PENSO SERVA QUESTA CLASSE
public class Coordinate {
	private final int row;
	private final int column;
	
	
	public Coordinate(int x, int y){
	this.row=x;
	this.column=y;
	}
	
	/**
	 * 
	 * @return the row's cordinate of the cell
	 */
	public int getRow() {
	return row;
	}
	
	/**
	 * 
	 * @return the column's coordinate of the cell
	 */
	
	public int getColumn() {
	return column;
	}


}
