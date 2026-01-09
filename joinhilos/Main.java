package joinhilos;

public class Main {
    public static void main(String[] args) {
        Hilo h1 = new Hilo( "Piero", 5);
        Hilo h2 = new Hilo( "Stalin", 5);
        Hilo h3 = new Hilo( "Alba", 5);

        System.out.println(h1.isAlive());
        System.out.println(h1.getState());
        h1.start();
        System.out.println(h1.isAlive());
        System.out.println(h1.getState());
        try {
            h1.join();
            h1.sleep(2000);
            System.out.println(h1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(h1.isAlive());
        System.out.println(h1.getState());
        h2.start();
        h3.start();

        System.out.println("Final del programa.");
    }
}
