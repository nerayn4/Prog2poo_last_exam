import java.time.Instant;

public class Note {
    int valeur_initail;
    Instant Historique;
    String description;

    public Note(int valeur_initail, Instant historique, String description) {
        this.valeur_initail = valeur_initail;
        this.Historique = historique;
        this.description = description;
    }

    public int getValeur_initail() {
        return valeur_initail;
    }

    public void setValeur_initail(int valeur_initail) {
        this.valeur_initail = valeur_initail;
    }

    public Instant getHistorique() {
        return Historique;
    }

    public void setHistorique(Instant historique) {
        Historique = historique;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

