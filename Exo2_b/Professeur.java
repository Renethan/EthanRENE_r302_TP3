import java.util.Date;

public class Professeur extends Adherent{
    private String numen;

    public Professeur(String prenom, String nom, String adresse, String email, Date date, String numen){
        super(prenom, nom, adresse, email, date);
        this.numen = numen;
    }

    public String getNumen() {
        return numen;
    }

    public void setNumen(String numen) {
        this.numen = numen;
    }
}
