import java.time.Instant;

public class Enseignant {
    int Id;
    String Nom;
    String Prenom;
    Instant Date_de_naissance;
    String email;
    int Telephone;
    String Specialite;

    public Enseignant(int id, String nom, String prenom, Instant date_de_naissance, String email, int telephone, String
            specialite) {
        this.Id = id;
        this.Nom = nom;
        this.Prenom = prenom;
        this.Date_de_naissance = date_de_naissance;
        this.email = email;
        this.Telephone = telephone;
        this.Specialite = specialite;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String specialite) {
        Specialite = specialite;
    }

}
