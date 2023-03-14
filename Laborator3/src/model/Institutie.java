package model;

public abstract class Institutie {
    private String denumire;
    private String adresa;
    private TipInstitutie tipInstitutie;

    public Institutie(String denumire, String adresa, TipInstitutie tipInstitutie) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.tipInstitutie = tipInstitutie;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public TipInstitutie getTipInstitutie() {
        return tipInstitutie;
    }

    public void setTipInstitutie(TipInstitutie tipInstitutie) {
        this.tipInstitutie = tipInstitutie;
    }

    public abstract String scop();

    @Override
    public String toString() {
        return "Institutie{" +
                "denumire='" + denumire + '\'' +
                ", adresa='" + adresa + '\'' +
                ", tipInstitutie=" + tipInstitutie +
                '}';
    }
}
