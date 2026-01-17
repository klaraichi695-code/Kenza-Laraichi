import java.util.ArrayList;
import java.util.List;

/**Classe représentant un client bancaire.
 * Un client peut posséder plusieurs comptes.
 */

public class Client {

    private String nom;
    private String prenom;
    private String CIN;
    private String adresse;
    private List<Compte> comptes;
     //Constructeur d'un client
    public Client(String nom, String prenom, String CIN, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.CIN = CIN;
        this.adresse = adresse;
        this.comptes = new ArrayList<>();
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCIN() {
        return CIN;
    }

    public String getAdresse() {
        return adresse;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    // Ajouter un compte
    public void ajouterCompte(Compte compte) {
        comptes.add(compte);
    }
}
