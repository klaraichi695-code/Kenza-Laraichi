
import java.util.List;

public class DashboardService {

    public static double totalDepenses(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.toString().contains("RETRAIT"))
                .mapToDouble(t -> Double.parseDouble(t.toString().split("\\|")[2].trim()))
                .sum();
    }
}

