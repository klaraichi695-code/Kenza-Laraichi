
import java.time.LocalDateTime;

/**Classe représentant une transaction sur un compte bancaire.
 * Stocke le type, le montant et la date/heur
 */
public class Transaction {

    private LocalDateTime date;
    private String type;
    private double montant;

    public Transaction(LocalDateTime date, String type, double montant) {
        this.date = date;
        this.type = type;
        this.montant = montant;
    }

    public String toString() {
        return date + " | " + type + " | " + montant;
    }
}

