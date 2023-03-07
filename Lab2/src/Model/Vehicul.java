package Model;

import Utile.TipVehicul;

public class Vehicul {

    private String denumire;
    private int vitezaMaxima;
    private TipVehicul tipVehicul;

    public Vehicul(String denumire, int vitezaMaxima, TipVehicul tipVehicul) {
        this.denumire = denumire;
        this.vitezaMaxima = vitezaMaxima;
        this.tipVehicul = tipVehicul;
    }

    public void setDenumire(String denumire){
        this.denumire = denumire;
    }

    public String getDenumire(){
        return this.denumire;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public TipVehicul getTipVehicul() {
        return tipVehicul;
    }

    public void setTipVehicul(TipVehicul tipVehicul) {
        this.tipVehicul = tipVehicul;
    }

    public String move(){
        return "Modul de deplasare al acestui vehicul nu este definit";
    }

    @Override
    public String toString() {
        return "Vehicul{" +
                "denumire='" + denumire + '\'' +
                ", vitezaMaxima=" + vitezaMaxima +
                ", tipVehicul=" + tipVehicul ;
    }
}
