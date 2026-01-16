package synchronizingthreads;

public class Hilo extends Thread {
    Contador contador;

    public Hilo(String nombre, Contador c) {
        setName(nombre);
        this.contador = c;
    }

    @Override
    public void run() {
        synchronized (contador) {
            for (int i = 0; i < 5000; i++) {
                contador.incrementa();
            }
            System.out.println(getName() + ": " + contador.getValor());
        }
    }
}
