package med.ben.model;

import java.util.ArrayList;
import java.util.List;

public class Ingenieur extends Salaire {
    private String grade;
    private double prime;
    private List<Mission> missions = new ArrayList<Mission>();

    public Ingenieur(String nom, String prenom, double salaireBase, int nbrEnfant, String grade, double prime, List<Mission> missions) {
        super(nom, prenom, salaireBase, nbrEnfant);
        this.grade = grade;
        this.prime = prime;
        this.missions = missions;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire()+prime;
    }

    @Override
    public String toString() {
        return "Ingenieur{" +
                super.toString() +
                "grade='" + grade + '\'' +
                ", prime=" + prime +
                ", missions=" + missions +
                '}';
    }
}
