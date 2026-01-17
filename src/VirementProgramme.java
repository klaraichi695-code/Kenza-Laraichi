

import java.time.LocalDate;

public class VirementProgramme {

    private Compte source;
    private Compte destination;
    private double montant;
    private LocalDate dateExecution;
    private int periodiciteJours;

    public VirementProgramme(Compte source, Compte destination,
                             double montant, LocalDate dateExecution, int periodiciteJours) {
        this.source = source;
        this.destination = destination;
        this.montant = montant;
        this.dateExecution = dateExecution;
        this.periodiciteJours = periodiciteJours;
    }

    public void executerSiDateAtteinte(LocalDate aujourdHui) throws Exception {
        if (!aujourdHui.isBefore(dateExecution)) {
            source.retirer(montant);
            destination.deposer(montant);
            dateExecution = dateExecution.plusDays(periodiciteJours);
        }
    }
}
