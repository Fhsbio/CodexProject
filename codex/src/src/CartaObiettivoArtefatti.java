package src;
import java.util.ArrayList;
import java.util.List;

public class CartaObiettivoArtefatti {
    private int id;
    private int piumeNecessarie;
    private int boccetteNecessarie;
    private int pergameneNecessarie;
    private int punti;

    public CartaObiettivoArtefatti(int id, int piumeNecessarie, int boccetteNecessarie, int pergameneNecessarie, int punti) {
        this.id = id;
        this.piumeNecessarie = piumeNecessarie;
        this.boccetteNecessarie = boccetteNecessarie;
        this.pergameneNecessarie = pergameneNecessarie;
        this.punti = punti;
    }

    public int getId() {
        return id;
    }

    public int getPiumeNecessarie() {
        return piumeNecessarie;
    }

    public int getBoccetteNecessarie() {
        return boccetteNecessarie;
    }

    public int getPergameneNecessarie() {
        return pergameneNecessarie;
    }

    public int getPunti() {
        return punti;
    }

    public static List<CartaObiettivoArtefatti> creaCarteObiettivo() {
        List<CartaObiettivoArtefatti> carte = new ArrayList<>();

        // Creazione delle carte obiettivo
        carte.add(new CartaObiettivoArtefatti(1, 2, 0, 0, 2)); // Carta che richiede 2 piume, assegna 2 punti
        carte.add(new CartaObiettivoArtefatti(2, 0, 2, 0, 2)); // Carta che richiede 2 boccette, assegna 2 punti
        carte.add(new CartaObiettivoArtefatti(3, 0, 0, 2, 2)); // Carta che richiede 2 pergamene, assegna 2 punti
        carte.add(new CartaObiettivoArtefatti(4, 1, 1, 1, 3)); // Carta che richiede piuma, boccetta, pergamena e assegna 3punti

        return carte;
    }

    public static void main(String[] args) {
        List<CartaObiettivoArtefatti> CartaObiettivoArtefatti = creaCarteObiettivo();

        for (CartaObiettivoArtefatti carta : CartaObiettivoArtefatti) {
            System.out.println("Carta " + carta.getId() + ": Piume necessarie: " + carta.getPiumeNecessarie() +
                    ", Boccette necessarie: " + carta.getBoccetteNecessarie() +
                    ", Pergamene necessarie: " + carta.getPergameneNecessarie() +
                    ", Punti: " + carta.getPunti());
        }
    }
}
