public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impresa", Color.ROJO, 2.0, 40);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil auto = new Automovil();

        subaru.setColor(Color.AZUL);


        System.out.println(subaru.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(nissan.detalle());

    }
}

