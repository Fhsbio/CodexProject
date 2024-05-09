package game;

import java.util.ArrayList;

import cards.Card;
import cards.Symbols;

public class Player {

	private String name;
	private final int id;
	private Symbols [][] personalGoal;
	private int points;
	private boolean isFirst;
	private Manuscript personalManuscript;

	/**
	 * The constructor define player
	 * @param id player
	 * @param name player
	 * @param pGoal player
	 */
	
	public Player(int id, String name, Symbols [][] personalGoal) {
		this.id = id;
		this.personalManuscript = new Manuscript();
		this.name = name;
		this.personalGoal = personalGoal;
		points = 0;
	}

	/**
	 * @return player's Id
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * @return player's name
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * @param isFirst
	 */
	public void setIsFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}
	/**
	 * @return if player is first
	 */
	public boolean isFirst() {
		return isFirst;
	}
	/**
	 * @return player's points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * @param commonGoalPoints
	 */
	public void setPoints(int commonGoalPoints) {
		this.points = commonGoalPoints;
	}

	public int totalPoints() {
		int total = 0;
		total += personalGoalPoints();
		total += points;
		total += personalManuscript.nearbySymbolsScore();
		return total;
	}
	/**
	 * @return personal goal score 
	 */
	private int personalGoalPoints() {
		Card [][] matrix = personalManuscript.getManuscript();
		int rows = matrix.length;
		int cols = matrix[0].length;
		int cont = 0;
		int points=0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j].equals(personalGoal[i][j]) && !personalGoal[i][j].equals(Symbols.EMPTY)) {
					cont++;
				}
			}
		}
		switch (cont) {
		case 1:
			points += 1;
			break;
		case 2:
			points += 2;
			break;
		case 3:
			points += 4;
			break;
		case 4:
			points += 6;
			break;
		case 5:
			points += 9;
			break;
		case 6:
			points += 12;
			break;
		default: 
			System.out.println("There is not any tile matching the personal goal card.");
		}
		return points;
	}
	/**
	 * 
	 * @return true if the Manuscript is full
	 */
	public boolean checkManuscript() {
		return personalManuscript.isFull();
	}
	
	/**
	 * @return an array of two positions, in the first element we have the column with the maxinum number of empty cells. In the second element we have the number of symbols
	 */
	//public int[] nMaxSymbols() {
		//return personalManuscript.nMaxSimbols();
	//}

	/**
	 * a method that fills the column with the tiles passed
	 * @param column
	 * @param tiles
	 * @return true if column has been filled correctly, otherwise false
	 */
	public boolean fillManuscriptColumn(int col, ArrayList<Symbols> tiles) {
		return personalManuscript.fillColumn(col,tiles);
	}
	/**
	 * @return player's Manuscript
	 */
	public Card [][] getManuscript() {
		return personalManuscript.getManuscript();
	}
	/**
	 * @return print player's Manuscript
	 */
	public String printManuscript() {
		return personalManuscript.toString();
	}

	

}
