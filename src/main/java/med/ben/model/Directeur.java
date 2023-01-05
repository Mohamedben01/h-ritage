package med.ben.model;

import java.time.LocalDate;

public class Directeur extends Salaire {

    private LocalDate dateReponsabilite;
    private double indeminiteResp;

    public Directeur(String nom, String prenom, double salaireBase, int nbrEnfant, LocalDate dateReponsabilite, double indeminiteResp) {
        super(nom, prenom, salaireBase, nbrEnfant);
        this.dateReponsabilite = dateReponsabilite;
        this.indeminiteResp = indeminiteResp;
    }

    public LocalDate getDateReponsabilite() {
        return dateReponsabilite;
    }

    public void setDateReponsabilite(LocalDate dateReponsabilite) {
        this.dateReponsabilite = dateReponsabilite;
    }

    public double getIndeminiteResp() {
        return indeminiteResp;
    }

    public void setIndeminiteResp(double indeminiteResp) {
        this.indeminiteResp = indeminiteResp;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire()+indeminiteResp;
    }

    @Override
    public String toString() {
        return "Directeur{" +
                super.toString()+
                "dateReponsabilite=" + dateReponsabilite +
                ", indeminiteResp=" + indeminiteResp +
                '}';
    }
}
