package med.ben.model;

import java.time.LocalDate;

public class Mission {
    private String intitule;
    private String indemnite;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    public Mission(String intitule, String indemnite, LocalDate dateDebut, LocalDate dateFin) {
        this.intitule = intitule;
        this.indemnite = indemnite;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getIndemnite() {
        return indemnite;
    }

    public void setIndemnite(String indemnite) {
        this.indemnite = indemnite;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "intitule='" + intitule + '\'' +
                ", indemnite='" + indemnite + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                '}';
    }
}
