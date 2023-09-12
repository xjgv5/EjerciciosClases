public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.fabricante = "Subaru";
        auto.modelo = "Impresa";
        auto.cilindrado = 2.0;
        auto.color = "Blanco";

        System.out.println(auto.detalle());
        System.out.println();
        System.out.println(auto.acelerandoFrenar(4000));

        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 0.75f));
        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 60));

    }
}
