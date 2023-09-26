public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil("Subaru", "Impresa", "Blanco", 2.0, 40);
        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);

        System.out.println(auto.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println();
        System.out.println(auto.acelerandoFrenar(4000));

        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 0.75f));
        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 60));

    }
}
