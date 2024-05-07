package cards;
//non penso servi questa classe
public class Cell {
	private Object obj;
	private Resources resource;
	private final Coordinate coordinata;
	
	public Cell(Coordinate coordinata, Object obj ) {
		
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

}
