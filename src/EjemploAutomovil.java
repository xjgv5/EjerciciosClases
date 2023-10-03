import javax.crypto.spec.PSource;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Motor motorSubraru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(motorSubraru);
        subaru.setEstanque(new Estanque());

        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);

        Motor motorNissan = new Motor(3.5, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));


        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println();
        System.out.println(subaru.acelerandoFrenar(4000));

        System.out.println("---------------------");
        System.out.println(mazda);

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 0.75f));
        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 60));

    }
}
