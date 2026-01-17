public class CompteCourant extends Compte {
    /**Classe représentant un compte courant.
     *Autorise un découvert limité.
     */
    private double decouvertAutorise = 1000;


    public CompteCourant(String numero, double soldeInitial) throws MontantInvalideException {
        super(numero, soldeInitial);
    }

    @Override
    public void retirer(double montant) throws Exception {
        if (montant <= 0)
            throw new MontantInvalideException("Montant invalide");

        if (solde - montant < -decouvertAutorise)
            throw new SoldeInsuffisantException("Découvert dépassé");

        solde -= montant;
        transactions.add(new Transaction(java.time.LocalDateTime.now(), "RETRAIT", montant));
    }

    @Override
    public double getMontantMinimum() {
        return 100;
    }
    @Override
    public double calculerFraisGestion() {
        return 120;
    }


}
