public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impresa", Color.ROJO, 2.0, 40);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil auto = new Automovil();

        subaru.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setTipo(TipoAutomovil.STATION_WAGON);
        nissan.setTipo(TipoAutomovil.HATCHBACK);
        auto.setTipo(TipoAutomovil.COUPE);

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

    }
}

