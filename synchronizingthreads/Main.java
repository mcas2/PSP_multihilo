package synchronizingthreads;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(0);
        ArrayList<Hilo> hilos = new ArrayList<>(Arrays.asList(
                new Hilo("h1", contador),
                new Hilo("h2", contador),
                new Hilo("h3", contador),
                new Hilo("h4", contador),
                new Hilo("h5", contador)));
        for (Hilo hilo: hilos) {
            hilo.start();
        }
        System.out.println(contador.getValor());
    }
}
