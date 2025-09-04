import java.time.Instant;

public class Tuteur {
    int Id;
    String Nom;
    String Prenom;
    Instant Date_de_Naissance;
    String email;
    int telephone;
    String description;

    public Tuteur(int id, String nom, String prenom, Instant date_de_Naissance, String email, int telephone, String
            description) {
        this.Id = id;
        this.Nom = nom;
        this.Prenom = prenom;
        this.Date_de_Naissance = date_de_Naissance;
        this.email = email;
        this.telephone = telephone;
        this.description = description;

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

    public Instant getDate_de_Naissance() {
        return Date_de_Naissance;
    }

    public void setDate_de_Naissance(Instant date_de_Naissance) {
        Date_de_Naissance = date_de_Naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
