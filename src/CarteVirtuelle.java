public class CarteVirtuelle extends CarteBancaire {

    public CarteVirtuelle(String numeroCarte, int pin) {
        super(numeroCarte, pin, 3000);
    }

    @Override
    public String getType() {
        return "CARTE_VIRTUELLE";
    }
}
