import javax.crypto.spec.PSource;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impresa", "Blanco", 2.0, 40);
        Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil auto = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println();
        System.out.println(subaru.acelerandoFrenar(4000));
        System.out.println(auto.equals(subaru));

        System.out.println("---------------------");
        System.out.println(mazda);

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 0.75f));
        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 60));

    }
}
