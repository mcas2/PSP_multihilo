package cuentabancaria;

public class Cuenta {
    private int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public int consultarSaldo() {
        return saldo;
    }

    public void restar(int cantidad) {
        saldo -= cantidad;
    }

    public synchronized void retirarDinero(int cantidad, String persona) {
        if (consultarSaldo() >= cantidad) {
            System.out.println(persona + " va a retirar dinero. (Cuenta: "+consultarSaldo()+"€)");
            restar(cantidad);
            System.out.println(persona+ " retira " + cantidad  + "€. (Cuenta: "+consultarSaldo()+"€)");
        } else {
            System.out.println(persona + ": no se puede retirar el dinero requerido. (Cuenta: "+consultarSaldo()+"€)");
        }

        if (consultarSaldo() < 0) {
            System.out.println("NÚMEROS ROJOS: " + consultarSaldo());
        }
    }
}
