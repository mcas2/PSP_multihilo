package basiccommunication;

public class Compartir {
    public static void main(String[] args) {
        Contador cont = new Contador(100);
        HiloSumador hS = new HiloSumador("Sumador", cont);
        HiloRestador hR = new HiloRestador("Restador", cont);
        hS.start();
        hR.start();
    }
}
