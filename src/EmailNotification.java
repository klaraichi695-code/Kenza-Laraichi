public class EmailNotification implements Notification {

    private double solde; // le solde du compte

    public EmailNotification(double solde) {
        this.solde = solde;
    }

    @Override
    public void envoyer(String message) {
        // On n'envoie le mail que si le solde est inférieur à 200 MAD
        if(solde < 200) {
            System.out.println("EMAIL : " + message + " (solde faible : " + solde + " MAD)");
        } else {
            System.out.println("Email non envoyé, solde suffisant : " + solde + " MAD");
        }
    }
}

