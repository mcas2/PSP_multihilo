package basiccommunication;

public class HiloSumador extends Thread {
    private Contador contador;

    public HiloSumador(String n, Contador c) {
        setName(n);
        this.contador = c;
    }

    public void run() {
        synchronized (contador) {
            for (int i = 0; i < 300; i++) {
                contador.incrementa();
                // try {
                //     sleep(100);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
            }
            System.out.println(getName()+" contador vale "+contador.getValor());
        }
    }
}
