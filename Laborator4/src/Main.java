import model.*;

public class Main {

    public static void main(String[] args){

        MijlocDeTransport mijlocDeTransport = new Avion("Bucuresti", "Paris");
        Tren tren = new Tren(TipTren.MARFAR);
        Tren tren1 = new Tren(TipTren.TRANSPORT_PERSOANE);
/*

        System.out.println(mijlocDeTransport.getDefaultMessage());
        System.out.println(mijlocDeTransport.ruta());
        System.out.println(tren.ruta());
        System.out.println(tren1.ruta());
*/

        Aeroport aeroport = new Aeroport("Henri Coanda");

        Avion avion = new Avion("Bucuresti" , "Istanbul");
        Avion avion1 = new Avion("Bucuresti", "Roma");
        Avion avion2 = new Avion("Bucuresti", "Londra");
/*
        aeroport.addAvion((Avion) mijlocDeTransport);
        aeroport.addAvion(avion);*/

        aeroport.addAvion(avion2);

        Personal personal1 = new Personal("Ionescu", "pilot", 10000);
        Personal personal2 = new Personal("Exemplu1" , "insotitor de zbor", 5000);

        avion1.addPersonal(personal1);
        avion1.addPersonal(personal2);

        aeroport.addAvion(avion1);

        for(Avion avion3 : aeroport.getAvioane())
            System.out.println(avion3);
    }

}
