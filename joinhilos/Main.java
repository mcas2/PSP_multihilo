package joinhilos;

public class Main {
    public static void main(String[] args) {
        Hilo h1 = new Hilo( "Piero", 8);
        Hilo h2 = new Hilo( "Stalin", 3);
        Hilo h3 = new Hilo( "Alba", 8);

        h1.start();
        try {
            h1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h2.start();
        h3.start();

        System.out.println("Final del programa.");
    }
}
