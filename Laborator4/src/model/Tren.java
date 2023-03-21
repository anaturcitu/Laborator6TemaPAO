package model;

public class Tren implements MijlocDeTransport{

    private TipTren tipTren;

    public Tren(TipTren tipTren) {
        this.tipTren = tipTren;
    }

    public TipTren getTipTren() {
        return tipTren;
    }

    public void setTipTren(TipTren tipTren) {
        this.tipTren = tipTren;
    }

    @Override
    public String ruta() {
        if(this.tipTren.equals(TipTren.MARFAR))
            return "Trenul nu are o ruta publica";
        return "Trenul are ruta Bucuresti-Brasov";
    }

    @Override
    public String toString() {
        return "Tren{" +
                "tipTren=" + tipTren +
                '}';
    }
}
