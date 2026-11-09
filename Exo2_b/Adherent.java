
import java.util.Date;

public class Adherent{
    protected String prenom;
    protected String nom;
    protected String adresse;
    protected String email;
    protected Date date;

    public Adherent(String prenom, String nom, String adresse, String email, Date date) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.date = date;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}