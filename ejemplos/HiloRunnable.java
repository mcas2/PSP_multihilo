package ejemplos;

public class HiloRunnable implements Runnable {
    Thread hilo;

    public HiloRunnable(String nombre) {
        hilo = new Thread(this, nombre);
        System.out.println("Hilo creado: " + hilo);
        hilo.start();
    }

    public void run() {
        System.out.println("Ejecución" + hilo.getName());
    }

    public static void main(String[] args) {
        System.out.println("Creación de un hilo en main: ");
        new HiloRunnable("Hilo 1");
        new HiloRunnable("Hilo 2");
        System.out.println("Ha terminado el hilo.");
    }
}
