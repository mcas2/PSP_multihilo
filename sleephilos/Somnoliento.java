package sleephilos;

public class Somnoliento extends Thread {

    public Somnoliento(String name) {
        System.out.println(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"Desperté.");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
