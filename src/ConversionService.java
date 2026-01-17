public class ConversionService {

    public static double convertir(double montant, String devise) {
        switch (devise) {
            case "EUR": return montant * 0.092;
            case "USD": return montant * 0.10;
            default: return montant;
        }
    }
}

