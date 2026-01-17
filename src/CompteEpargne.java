public class CompteEpargne extends Compte implements CalculInteret {
    /** Classe représentant un compte épargne.
     Applique un taux d'intérêt et n'autorise pas le découvert.*/

    private double taux = 0.03;

    public CompteEpargne(String numero, double soldeInitial) throws MontantInvalideException {
        super(numero, soldeInitial);
    }

    @Override
    public void retirer(double montant) throws Exception {
        if (montant > solde)
            throw new SoldeInsuffisantException("Solde insuffisant");

        solde -= montant;
        transactions.add(new Transaction(java.time.LocalDateTime.now(), "RETRAIT", montant));
    }

    @Override
    public double calculerInteret(double solde) {
        return solde * taux;
    }

    public void appliquerInteret() {
        solde += calculerInteret(solde);
    }

    @Override
    public double getMontantMinimum() {
        return 500;
    }
    @Override
    public double calculerFraisGestion() {
        return 60;
    }

}
