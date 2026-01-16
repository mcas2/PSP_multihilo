package cuentabancaria;

public class Cajero {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1000);
        SacarDinero transaccion1 = new SacarDinero("Fabio", cuenta, 900);
        SacarDinero transaccion2 = new SacarDinero("Alba", cuenta, 900);
        SacarDinero transaccion3 = new SacarDinero("Adrián", cuenta, 900);
        SacarDinero transaccion4 = new SacarDinero("Piero", cuenta, 900);
        SacarDinero transaccion5 = new SacarDinero("Rodrigo", cuenta, 900);

        transaccion1.start();
        transaccion2.start();
        transaccion3.start();
        transaccion4.start();
        transaccion5.start();
    }
}
