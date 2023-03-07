package Model;

import Utile.Constante;
import Utile.CutieViteze;
import Utile.TipVehicul;

public class Autoturism extends Vehicul{

    private CutieViteze cutieViteze;

    public Autoturism(String denumire, int vitezaMaxima, CutieViteze cutieViteze) {
        super(denumire, vitezaMaxima, TipVehicul.RUTIER);
        this.cutieViteze = cutieViteze;
    }

    public CutieViteze getCutieViteze() {
        return cutieViteze;
    }

    public void setCutieViteze(CutieViteze cutieViteze) {
        this.cutieViteze = cutieViteze;
    }

    @Override
    public String move(){
      return Constante.MOVE_AUTOTURISM;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cutieViteze=" + cutieViteze +
                '}';
    }

    @Override
    public boolean equals(Object obj){
       if(this == obj)
           return true;
       if(!(obj instanceof Autoturism))
           return false;
       Autoturism object = (Autoturism) obj;
       if(object.getDenumire() != this.getDenumire()
         || object.getVitezaMaxima() != this.getVitezaMaxima()
               || object.getTipVehicul() != this.getTipVehicul()
               || object.getCutieViteze() != this.getCutieViteze())
           return false;
       return true;
    }
}
