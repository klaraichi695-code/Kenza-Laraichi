public class CompteFactory {

    public static Compte creerCompte(String type, String numero, double solde)
            throws MontantInvalideException {

        switch (type) {
            case "COURANT":
                return new CompteCourant(numero, solde);
            case "EPARGNE":
                return new CompteEpargne(numero, solde);
            case "ENTREPRISE":
                return new CompteEntreprise(numero, solde);
            default:
                throw new IllegalArgumentException("Type de compte inconnu");
        }
    }
}
