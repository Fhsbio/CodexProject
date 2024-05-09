package carte;

public abstract class Carta {
	
	private final Tipo tipoCarta;
	private final FronteRetro facciaCarta;
	private int valore;
	
	public Carta (Tipo tipo, FronteRetro faccia,int valore) {
		this.tipoCarta = tipo;
		this.facciaCarta = faccia;
		this.valore = valore;
	}

	/**
	 * @return the tipoCarta
	 */
	public Tipo getTipoCarta() {
		return tipoCarta;
	}

	/**
	 * @return the facciaCarta
	 */
	public FronteRetro getFacciaCarta() {
		return facciaCarta;
	}
	
	
	
}
