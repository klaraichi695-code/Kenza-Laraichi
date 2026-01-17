public class CompteEntreprise extends Compte {
/**Classe représentant un compte entreprise.
 * Autorise un plafond de retrait élevé.*/
    private double plafondJournalier = 50000;

    public CompteEntreprise(String numero, double soldeInitial) throws MontantInvalideException {
        super(numero, soldeInitial);
    }

    @Override
    public void retirer(double montant) throws Exception {
        if (montant > plafondJournalier)
            throw new LimiteDepasseeException("Plafond journalier dépassé");

        if (montant > solde)
            throw new SoldeInsuffisantException("Solde insuffisant");

        solde -= montant;
        transactions.add(new Transaction(java.time.LocalDateTime.now(), "RETRAIT", montant));
    }

    @Override
    public double getMontantMinimum() {
        return 1000;
    }
    @Override
    public double calculerFraisGestion() {
        return 300;
    }

}

