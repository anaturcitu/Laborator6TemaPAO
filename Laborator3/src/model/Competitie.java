package model;

import java.util.Arrays;

public class Competitie {

    private final String denumire;

    private final String stadion;

    private final String[] echipe;


    public Competitie(String denumire, String stadion, String[] echipe) {
        this.denumire = denumire;
        this.stadion = stadion;
        this.echipe = echipe;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getStadion() {
        return stadion;
    }

    public String[] getEchipe() {
        return echipe;
    }

    @Override
    public String toString() {
        return "Competitie{" +
                "denumire='" + denumire + '\'' +
                ", stadion='" + stadion + '\'' +
                ", echipe=" + Arrays.toString(echipe) +
                '}';
    }
}
