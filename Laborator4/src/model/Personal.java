package model;

public class Personal {
    private String nume;
    private String functie;
    private double salariu;

    public Personal(String nume, String functie, double salariu) {
        this.nume = nume;
        this.functie = functie;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nume='" + nume + '\'' +
                ", functie='" + functie + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
