package threadpriority;

/**
 * 1. Lo ejecutamos sin asignar prioridad
 * 2. Lo ejecutamos asignando más prioridad a la luna (Mirar antes que prioridad tiene cada uno)
 * 3. Lo ejecutamos asignando más prioridad al sol
 * 4. Lo ejecutamos asignando la mínima prioridad a uno de los 2
 * 5. ¿Obtienes los resultados esperados?
 */

public class HiloPrioridades extends Thread {
    public HiloPrioridades(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        HiloPrioridades h1 = new HiloPrioridades("Luna");
        HiloPrioridades h2 = new HiloPrioridades("Sol");
        System.out.println(h1.getPriority());
        System.out.println(h2.getPriority());
        h1.setPriority(MAX_PRIORITY);
        h2.setPriority(MIN_PRIORITY);
        System.out.println(h1.getPriority());
        System.out.println(h2.getPriority());

        h1.start();
        h2.start();
    }
}

