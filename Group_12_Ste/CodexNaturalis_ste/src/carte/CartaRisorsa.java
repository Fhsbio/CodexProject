package carte;

public class CartaRisorsa extends Carta{
	
	private String simbolo;
	private String oggetto;
	private int nSimboli;
	private int nOggetti;

	public CartaRisorsa(Tipo tipo, FronteRetro faccia, int valore, String symbol, String obj, int numSymb, int numObj) {
		super(tipo, faccia, valore);
		this.simbolo = symbol;
		this.oggetto = obj;
		this.nSimboli = numSymb;
		this.nOggetti = numObj;
		// TODO Auto-generated constructor stub
		}

	/**
	 * @return the simbolo
	 */
	public String getSimbolo() {
		return simbolo;
	}

	/**
	 * @return the oggetto
	 */
	public String getOggetto() {
		return oggetto;
	}

	/**
	 * @return the nSimboli
	 */
	public int getnSimboli() {
		return nSimboli;
	}

	/**
	 * @return the nOggetti
	 */
	public int getnOggetti() {
		return nOggetti;
	}

	/**
	 * @param simbolo the simbolo to set
	 */
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	/**
	 * @param oggetto the oggetto to set
	 */
	public void setOggetto(String oggetto) {
		this.oggetto = oggetto;
	}

	/**
	 * @param nSimboli the nSimboli to set
	 */
	public void setnSimboli(int nSimboli) {
		this.nSimboli = nSimboli;
	}

	/**
	 * @param nOggetti the nOggetti to set
	 */
	public void setnOggetti(int nOggetti) {
		this.nOggetti = nOggetti;
	}
	
	
	}
	

