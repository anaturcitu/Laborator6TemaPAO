package model;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {

    private List<Avion> avioane;

    private String denumireAeroport;

    public Aeroport(String denumireAeroport) {
        this.denumireAeroport = denumireAeroport;
    }

    public String getDenumireAeroport() {
        return denumireAeroport;
    }

    public void setDenumireAeroport(String denumireAeroport) {
        this.denumireAeroport = denumireAeroport;
    }

    public void addAvion(Avion avion){
        if(this.avioane == null)
            this.avioane = new ArrayList<>();
        if(!findAvion(avion))
            this.avioane.add(avion);
    }

    public List<Avion> getAvioane() {
        return avioane;
    }

    public boolean findAvion(Avion avion){
        if(this.avioane.contains(avion))
            return true;
        return false;
    }
}
