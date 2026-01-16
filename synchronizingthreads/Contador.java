package synchronizingthreads;

public class Contador {
    private int c = 0;

    Contador(int c) {
        this.c = c;
    }

    public synchronized void incrementa() {
        c++;
    }

    public int getValor() {
        return c;
    }
}
