public class EjemploAutomovilEnum {
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



        subaru.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setTipo(TipoAutomovil.STATION_WAGON);
        nissan.setTipo(TipoAutomovil.HATCHBACK);


        TipoAutomovil tipo = subaru.getTipo();
        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE -> {
                System.out.println("El automovil es deportivo y descapotable de 2 puertas");
            }
            case FURGON -> {
                System.out.println("Es un automovil utilitario de transporte. Para empresas");
            }
            case COUPE -> {
                System.out.println("Es un automovil pequeño de 2 puertas y deportivo");
            }
            case HATCHBACK -> {
                System.out.println("Es un automovil mediano compacto de aspecto deportivo");
            }
            case PICKUP -> {
                System.out.println("Es un automovil de doble cabina");
            }
            case SEDAN -> {
                System.out.println("es un automovil mediano");
            }
            case STATION_WAGON ->{
                System.out.println("Es un automovil mas grande, con maleta grande");
            }
            default -> {
                System.out.println("Auto no registrado");
            }
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.name() + " , " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + " , " +
                    ta.getNumeroPuertas());
            System.out.println();
        }

    }
}

