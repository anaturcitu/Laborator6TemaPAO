import Model.Autoturism;
import Model.Tren;
import Model.Vehicul;
import Utile.CutieViteze;
import Utile.MetodeStatice;

import static Utile.Constante.RUTA_BRASOV_BUCURESTI;

public class Main {

    public static void main(String[] args){

        Vehicul vehicul1 = new Autoturism("Ford", 200, CutieViteze.AUTOMATA);
        System.out.println(vehicul1.toString());

        System.out.println(vehicul1.move());

        Vehicul vehicul2 = new Tren("Sageata albastra", 200, RUTA_BRASOV_BUCURESTI);
        System.out.println(vehicul2.toString());

        System.out.println(vehicul2.move());

        Vehicul vehicul3 = new Autoturism("Ford", 200, CutieViteze.AUTOMATA);
        System.out.println(vehicul1.toString());

        System.out.println(vehicul1.equals(vehicul3));

        System.out.println(vehicul1.equals(vehicul2));

        System.out.println(MetodeStatice.vitezaMedie(100, 50) + "km/minut");
    }

}
