import java.time.Instant;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Etudiant {
    int Id;
    String Nom;
    String Prenom;
    Instant Date_de_naissance;
    int Telephone;
    String Groupe;
    String Tuteur;
    static Note note;

    public Etudiant(int id, String nom, String prenom, Instant date_de_naissance, int telephone, String groupe, String
            tuteur) {
        this.Id = id;
        this.Nom = nom;
        this.Prenom = prenom;
        this.Date_de_naissance = date_de_naissance;
        this.Telephone = telephone;
        this.Groupe = groupe;
        this.Tuteur = tuteur;


    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public Instant getDate_de_naissance() {
        return Date_de_naissance;
    }

    public void setDate_de_naissance(Instant date_de_naissance) {
        Date_de_naissance = date_de_naissance;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public String getGroupe() {
        return Groupe;
    }

    public void setGroupe(String groupe) {
        Groupe = groupe;
    }

    public String getTuteur() {
        return Tuteur;
    }

    public void setTuteur(String tuteur) {
        Tuteur = tuteur;
    }

    public static Note getNote() {
        return note;
    }

    public static void setNote(Note note) {
        Etudiant.note = note;
    }

    void getExamGrade(Examen exam, Etudiant student, Instant t){
    };
}
