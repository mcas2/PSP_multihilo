package basiccommunication;

public class HiloRestador extends Thread {
    private Contador contador;

    public HiloRestador(String n, Contador c) {
        setName(n);
        this.contador = c;
    }

    public void run() {
        synchronized (contador) {
            for (int i = 0; i < 300; i++) {
                contador.decrementa();
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

