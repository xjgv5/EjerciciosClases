public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.setFabricante("subaru");
        auto.setModelo("Impresa");
        auto.setCilindrado(2.0);
        auto.setColor("blanco");

        System.out.println(auto.detalle());
        System.out.println();
        System.out.println(auto.acelerandoFrenar(4000));

        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 0.75f));
        System.out.println("kilometros por litro " + auto.calcularConsumo(300, 60));

    }
}
