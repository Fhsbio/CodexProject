import java.util.ArrayList;
import java.util.List;

public class CartaObiettivoSimboli {
    private int id;
    private int simboliViola;
    private int simboliAzzurri;
    private int simboliVerdi;
    private int simboliRossi;
    private int punti;

    public CartaObiettivoSimboli(int id, int simboliViola, int simboliAzzurri, int simboliVerdi, int simboliRossi, int punti) {
        this.id = id;
        this.simboliViola = simboliViola;
        this.simboliAzzurri = simboliAzzurri;
        this.simboliVerdi = simboliVerdi;
        this.simboliRossi = simboliRossi;
        this.punti = punti;
    }

    public int getId() {
        return id;
    }

    public int getSimboliViola() {
        return simboliViola;
    }

    public int getSimboliAzzurri() {
        return simboliAzzurri;
    }

    public int getSimboliVerdi() {
        return simboliVerdi;
    }

    public int getSimboliRossi() {
        return simboliRossi;
    }

    public int getPunti() {
        return punti;
    }

    public static List<CartaObiettivoSimboli> creaCarteObiettivo() {
        List<CartaObiettivoSimboli> carte = new ArrayList<>();

        // Creazione delle carte obiettivo
        carte.add(new CartaObiettivoSimboli(5, 3, 0, 0, 0, 2)); // Carta viola che richiede 3 simboli viola, assegna 2 punti
        carte.add(new CartaObiettivoSimboli(6, 0, 3, 0, 0, 2)); // Carta azzurra che richiede 3 simboli azzurri, assegna 2 punti
        carte.add(new CartaObiettivoSimboli(7, 0, 0, 3, 0, 2)); // Carta verde che richiede 3 simboli verdi, assegna 2 punti
        carte.add(new CartaObiettivoSimboli(8, 0, 0, 0, 3, 2)); // Carta rossa che richiede 3 simboli rossi, assegna 2 punti

        return carte;
    }

    public static void main(String[] args) {
        List<CartaObiettivoSimboli> carteObiettivo = creaCarteObiettivo();

        for (CartaObiettivoSimboli carta : CartaObiettivoSimboli) {
            System.out.println("Carta " + carta.getId() + ": Simboli viola: " + carta.getSimboliViola() +
                    ", Simboli azzurri: " + carta.getSimboliAzzurri() +
                    ", Simboli verdi: " + carta.getSimboliVerdi() +
                    ", Simboli rossi: " + carta.getSimboliRossi() +
                    ", Punti: " + carta.getPunti());
        }
    }
}
