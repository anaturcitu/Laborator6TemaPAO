package model;

import java.util.ArrayList;
import java.util.List;

public class Avion implements MijlocDeTransport{

    private String plecare;
    private String destinatie;
    private List<Personal> personalList;


    public Avion(String plecare, String destinatie) {
        this.plecare = plecare;
        this.destinatie = destinatie;
    }

    public String getPlecare() {
        return plecare;
    }

    public void setPlecare(String plecare) {
        this.plecare = plecare;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public List<Personal> getPersonalList() {
        return personalList;
    }

    public void addPersonal(Personal personal){
        if(this.personalList == null)
            this.personalList = new ArrayList<>();
        personalList.add(personal);
    }

    @Override
    public String ruta() {
        return "Avionul are ruta " + this.plecare + " - " + this.destinatie;
    }


    @Override
    public String toString() {
        return "Avion{" +
                "plecare='" + plecare + '\'' +
                ", destinatie='" + destinatie + '\'' +
                '}' + this.getPersonalList();
    }
}
