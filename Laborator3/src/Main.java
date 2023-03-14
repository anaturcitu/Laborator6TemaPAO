import model.Competitie;
import model.Institutie;
import model.InstitutieSportiva;

public class Main {

    public static void main(String[] args){

        InstitutieSportiva institutie = new InstitutieSportiva("Institutia sporturilor", "Bucuresti, sector 1");

        System.out.println(institutie.test());

        System.out.println(institutie.toString());

        String[] echipe = new String[2];
        echipe[0] = "Echipa1";
        echipe[1] = "Echipa2";

        Competitie competitie1 = new Competitie("baschet", "Dinamo", echipe);

        Competitie competitie2 = new Competitie("volei", "Stadion1", echipe);

        institutie.addCompetitie(competitie1);
        institutie.addCompetitie(competitie2);

        institutie.removeCompetitie(competitie1);

        institutie.removeCompetitieIndice(0);

        institutie.parcurgereCompetitii();

        institutie.addPersonal("Andrei Ion");

        institutie.addPersonal("Maria Calin");

        institutie.addPersonal("Claudia Ene");

        System.out.println(institutie.getPersonal());

        boolean userFoundAndUpdated = institutie.updatePersonal("Andrei Ion", "Cristian Popescu");
        if(!userFoundAndUpdated)
            System.out.println("Userul nu a fost gasit");
        else
            System.out.println(institutie.getPersonal());

        //System.out.println(institutie.toString());
    }


}
