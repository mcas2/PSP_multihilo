package sleephilos;

public class Main {
    public static void main(String[] args) {
        Somnoliento dormido = new Somnoliento("dormido");
        dormido.start();
        System.out.println("CLASE MAIN: "+dormido.isAlive());
    }
}
