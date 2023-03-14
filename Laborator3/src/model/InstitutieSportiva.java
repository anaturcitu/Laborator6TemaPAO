package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static Constants.Constants.SCOP_INSTITUTIE_SPORTIVA;

public class InstitutieSportiva extends Institutie {

    private ArrayList<Competitie> competitii;
    private String[] personal;

    public InstitutieSportiva(String denumire, String adresa) {
        super(denumire, adresa, TipInstitutie.SPORT);
        competitii = new ArrayList<>();
    }

    @Override
    public String scop() {
        return SCOP_INSTITUTIE_SPORTIVA;
    }

    public String test() {
        return "Clasa care extinde Institutie";
    }

    public void addCompetitie(Competitie competitie) {
        competitii.add(competitie);
    }

    public ArrayList<Competitie> getCompetitii() {
        return this.competitii;
    }

    public void parcurgereCompetitii() {
        for (int i = 0; i < this.competitii.size(); i++)
            System.out.println("Competitia " + (i + 1) + ": " + this.competitii.get(i));
    }

    public void removeCompetitie(Competitie competitie) {
        this.competitii.remove(competitie);
    }

    public void removeCompetitieIndice(int indice) {
        this.competitii.remove(indice);
    }

    public void addPersonal(String personal) {
        if (this.personal == null) {
            this.personal = new String[1];
            this.personal[0] = personal;
        } else {
            int size = this.personal.length;
            String[] copyPersonal = new String[size + 1];
            for (int i = 0; i < size; i++) {
                copyPersonal[i] = this.personal[i];
            }
            this.personal = new String[size + 1];

            this.personal = copyPersonal;
            this.personal[size] = personal;
        }

/*        for(int i = 0 ; i < size ; i++){
            this.personal[i] = copyPersonal[i];
        }*/

    }

    @Override
    public String toString() {
        return "InstitutieSportiva{ " + super.toString() + this.competitii + "}";
    }

    public String getPersonal() {
        return Arrays.toString(this.personal);
    }

    public boolean updatePersonal(String numeVechi, String numeNou) {

        for (int i = 0; i < this.personal.length; i++) {
            if (this.personal[i] == numeVechi) {
                this.personal[i] = numeNou;
                return true;
            }
        }
        return false;
    }
}