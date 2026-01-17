

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**Classe abstraite représentant un compte bancaire,
 * définit les méthodes de base : dépôt, retrait et historique.
 */

public abstract class Compte {

    protected String numero;
    protected double solde;
    protected List<Transaction> transactions;
    protected List<CarteBancaire> cartes = new ArrayList<>();
    //Constructeur d'un compte
    public Compte(String numero, double soldeInitial) throws MontantInvalideException {
        if (soldeInitial < getMontantMinimum()) {
            throw new MontantInvalideException("Montant initial insuffisant");
        }
        this.numero = numero;
        this.solde = soldeInitial;
        this.transactions = new ArrayList<>();
    }


    public abstract double getMontantMinimum();
       //Retirer un montant du compte
    public abstract void retirer(double montant) throws Exception;
      //Déposer un montant sur le compte
    public void deposer(double montant) throws MontantInvalideException {
        if (montant <= 0)
            throw new MontantInvalideException("Montant invalide");

        solde += montant;
        transactions.add(new Transaction(LocalDateTime.now(), "DEPOT", montant));
    }

    public double getSolde() {
        return solde;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void ajouterCarte(CarteBancaire carte) {
        cartes.add(carte);
    }
    public void verifierSolde(Notification notification) {
        if (solde < 200) {
            notification.envoyer("Solde faible : " + solde);
        }
    }
    public abstract double calculerFraisGestion();

}
