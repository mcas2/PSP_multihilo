package cuentabancaria;

public class SacarDinero extends Thread {
    private Cuenta cuenta;
    private int cantidad;

    public SacarDinero(String name, Cuenta cuenta, int cantidad) {
        super(name);
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        cuenta.retirarDinero(cantidad, getName());
    }
}
