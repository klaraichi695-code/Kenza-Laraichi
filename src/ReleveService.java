
public class ReleveService {

    public static String genererHTML(Compte compte) {
        StringBuilder html = new StringBuilder();

        html.append("<html><body>");
        html.append("<h1>Relevé du compte</h1>");
        html.append("<p>Solde : ").append(compte.getSolde()).append("</p>");
        html.append("<ul>");

        for (Transaction t : compte.getTransactions()) {
            html.append("<li>").append(t.toString()).append("</li>");
        }

        html.append("</ul></body></html>");

        return html.toString();
    }
}
