package cards;

public class Cell {
	private Object obj;
	private Resources resource;
	private final Coordinate coordinata;
	
	public Cell(Coordinate coordinata, Object obj ) {
		//setPezzo(null);
		this.coordinata = coordinata;	
		this.obj = obj;
	}
	public Cell (Coordinate coordinata, Resources resource) {
		this.coordinata = coordinata;
		this.resource = resource;
		}
	
	public Object getSymbolObject() {
		return obj;
		}
	
	public Resources getSymbolResources() {
		return resource;
		}
	
	public Coordinate getCoordinata() {
		return coordinata;
		}


	/*

	 * public Cell(Coordinata coordinata) {
	 * 
	// chiama il costruttore di coordinata
	setPezzo(null);
	this.coordinata = coordinata;
	}
	public SymbolOfCell getSymbol() {
	return ;
	}
	public void setPezzo(Pezzo pezzo) {
	this.pezzo = pezzo;
	}
	public boolean isEmpty() {
	if (this.pezzo == null) {
	return true;
	}
	return false;
	}
	public Pezzo unsetPezzo() {
	Pezzo pieceToBeReturned = this.pezzo;
	this.pezzo = null;
	return pieceToBeReturned;
	}
	@Override
	public String toString() {
	if (this.getPezzo() != null) {
	return this.getPezzo().toString();
	} else {
	return " ";
	}
	}
	


	 */
}
