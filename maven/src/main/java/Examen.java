import java.time.Instant;

public class Examen {
    int IdExamen;
    static Cours cours;
    Instant Date_et_heure_examen;
    int coeficiente;

    public Examen(int idExamen, Instant date_et_heure_examen, int coeficiente) {
        this.IdExamen = idExamen;
        this.Date_et_heure_examen = date_et_heure_examen;
        this.coeficiente = coeficiente;
    }

    public int getIdExamen() {
        return IdExamen;
    }

    public void setIdExamen(int idExamen) {
        IdExamen = idExamen;
    }

    public static Cours getCours() {
        return cours;
    }

    public static void setCours(Cours cours) {
        Examen.cours = cours;
    }

    public Instant getDate_et_heure_examen() {
        return Date_et_heure_examen;
    }

    public void setDate_et_heure_examen(Instant date_et_heure_examen) {
        Date_et_heure_examen = date_et_heure_examen;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }
}
