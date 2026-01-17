

public abstract class CarteBancaire {

    protected String numeroCarte;
    protected int pin;
    protected boolean active;
    protected double plafond;

    public CarteBancaire(String numeroCarte, int pin, double plafond) {
        this.numeroCarte = numeroCarte;
        this.pin = pin;
        this.plafond = plafond;
        this.active = true;
    }

    public void bloquer() {
        this.active = false;
    }

    public boolean verifierPin(int pin) {
        return this.pin == pin;
    }

    public abstract String getType();
}

