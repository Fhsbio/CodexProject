public class Carta {
    private boolean[][] fronte; // Matrice per rappresentare il fronte
    private boolean[][] retro = { {true, true}, {true, true} }; // Retro con tutti gli angoli piazzabili
    private String colore;
    private int punteggio;

    public Carta(boolean[][] fronte, String colore, int punteggio) {
        this.fronte = fronte;
        this.colore = colore;
        this.punteggio = punteggio;
    }

    // Metodi getter per ottenere informazioni sulla carta
    public boolean[][] getFronte() {
        return fronte;
    }

    public boolean[][] getRetro() {
        return retro;
    }

    public String getColore() {
        return colore;
    }

    public int getPunteggio() {
        return punteggio;
    }

    // Metodo per controllare se un angolo del fronte è piazzabile
    public boolean angoloPiazzabile(int riga, int colonna) {
        return fronte[riga][colonna];
    }
}

//Metodo per ottenere il simbolo di un angolo piazzabile


public class CartaRossa extends Carta { // Per esempio le carte potremmo creare man mano cosi
    public CartaRossa() {
        super(new boolean[][] {{true, false}, {false, true}}, "rosso", 0);
    }
}

//ho pensato che le carte dovrebbero anche avere un numero identificativo


