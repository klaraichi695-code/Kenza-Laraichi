//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


                System.out.println("Système de Gestion Bancaire – Démonstration\n");

                //Création d’un client
                Client client = new Client("Laraichi", "Kenza", "AB123", "Fes");
                System.out.println("Client créé : " + client.getNom() + " " + client.getPrenom() + "\n");

                //Création des comptes
                CompteCourant compteCourant = new CompteCourant("C001", 1000);
                CompteEpargne compteEpargne = new CompteEpargne("E001", 2000);
                CompteEntreprise compteEntreprise = new CompteEntreprise("ENT001", 50000);

                // Ajout des comptes au client
                client.ajouterCompte(compteCourant);
                client.ajouterCompte(compteEpargne);
                client.ajouterCompte(compteEntreprise);

                //  Dépôts
                compteCourant.deposer(500);
                compteEpargne.deposer(1000);
                compteEntreprise.deposer(20000);

                //Retraits
                compteCourant.retirer(300);
                compteEpargne.retirer(500);
                compteEntreprise.retirer(10000);

                //  Virement entre comptes du même client
                compteCourant.retirer(200);
                compteEpargne.deposer(200);

                //Application des intérêts sur le compte épargne
                compteEpargne.appliquerInteret();
                EmailNotification notif = new EmailNotification(compteCourant.getSolde());
                notif.envoyer("Attention ! Votre solde est faible.");


        // Affichage des soldes
                System.out.println("Soldes après opérations :");
                System.out.println("Compte Courant (C001) : " + compteCourant.getSolde());
                System.out.println("Compte Epargne (E001) : " + compteEpargne.getSolde());
                System.out.println("Compte Entreprise (ENT001) : " + compteEntreprise.getSolde() + "\n");

                //  Affichage de l’historique des transactions pour le compte courant
                System.out.println("Transactions Compte Courant :");
                for (Transaction t : compteCourant.getTransactions()) {
                    System.out.println(t);
                }

                //  Affichage de l’historique des transactions pour le compte épargne
                System.out.println("\nTransactions Compte Epargne :");
                for (Transaction t : compteEpargne.getTransactions()) {
                    System.out.println(t);
                }

                //  Affichage de l’historique des transactions pour le compte entreprise
                System.out.println("\nTransactions Compte Entreprise :");
                for (Transaction t : compteEntreprise.getTransactions()) {
                    System.out.println(t);
                }

                System.out.println("\n Fin de la démonstration");
    }
}
