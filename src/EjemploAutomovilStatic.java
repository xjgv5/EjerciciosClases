public class EjemploAutomovilStatic {
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


        subaru.setColor(Color.AZUL);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setTipo(TipoAutomovil.PICKUP);
        nissan.setTipo(TipoAutomovil.PICKUP);

        System.out.println(subaru.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(nissan.detalle());

    }
}

