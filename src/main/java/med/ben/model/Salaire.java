package med.ben.model;

public class Salaire {

    private String nom;
    private String prenom;
    private double salaireBase;
    private int nbrEnfant;

    public Salaire(String nom, String prenom, double salaireBase, int nbrEnfant) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaireBase = salaireBase;
        this.nbrEnfant = nbrEnfant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

    public double calculerSalaire(){
        return (salaireBase+nbrEnfant)*300;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaireBase=" + salaireBase +
                ", nbrEnfant=" + nbrEnfant;
    }
}
