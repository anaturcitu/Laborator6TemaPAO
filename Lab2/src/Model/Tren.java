package Model;

import Utile.TipVehicul;

import static Utile.Constante.MOVE_TREN;

public class Tren extends Vehicul {

    private String ruta;

    public Tren(String denumire, int vitezaMaxima, String ruta) {
        super(denumire, vitezaMaxima, TipVehicul.FEROVIAR);
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String move() {
        return MOVE_TREN;
    }

    @Override
    public String toString() {
        return super.toString() + ", ruta=" + this.getRuta() + "}";
    }
}
