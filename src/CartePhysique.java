public class CartePhysique extends CarteBancaire {

    public CartePhysique(String numeroCarte, int pin) {
        super(numeroCarte, pin, 10000);
    }

    @Override
    public String getType() {
        return "CARTE_PHYSIQUE";
    }
}

