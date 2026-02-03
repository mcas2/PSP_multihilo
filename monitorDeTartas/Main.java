package monitorDeTartas;

public class Main {
    public static void main(String[] args) {
        Vitrina vitrina =  new Vitrina();
        Repostero r1 = new Repostero(vitrina, "Angelo Cakes", "Nata", 4);
        Repostero r2 = new Repostero(vitrina, "Fruity Flavours", "Naranja", 3);
        Repostero r3 = new Repostero(vitrina, "Martínez S.L.", "Chocolate", 5);

        Comprador c1 = new Comprador(vitrina, "Fabio", 8);
        Comprador c2 = new Comprador(vitrina, "Alba", 4);

        r1.start();
        r2.start();
        r3.start();
        c1.start();
        c2.start();
    }
}
