package synchronizingthreads;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(0);
        Hilo h1 = new Hilo("h1", contador);
        Hilo h2 = new Hilo("h2", contador);
        Hilo h3 = new Hilo("h3", contador);
        Hilo h4 = new Hilo("h4", contador);
        Hilo h5 = new Hilo("h5", contador);
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        System.out.println(contador.getValor());
    }
}
