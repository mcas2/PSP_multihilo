package ejemplos;

public class Ejemplo {
    public static void main(String[] args) {
        HiloThread hiloThread = new HiloThread("Alo");
        hiloThread.start();
    }
}