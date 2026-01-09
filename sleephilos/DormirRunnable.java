package sleephilos;

public class DormirRunnable implements Runnable {

    Thread hilo;

    public DormirRunnable(String nombre) {
        hilo = new Thread(this, nombre);
        hilo.start();
        try {
            hilo.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new DormirRunnable("A1");
        new DormirRunnable("A2");
    }

    @Override
    public void run() {
        System.out.println("Hola" + hilo.getName());
    }
}
