public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martinez");

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
       // subaru.setRuedas(ruedaSub);

        Rueda[] ruedaSub = new Rueda[5];
        for (int i = 0; i<ruedaSub.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }




        Persona conductorMazda = new Persona("Pato", "Rodriguez");
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(conductorMazda);
        //mazda.setRuedas(ruedaMzd);
        Rueda[] ruedaMzd = new Rueda[5];
        for (int i = 0; i < ruedaMzd.length; i++){
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }



        Persona conductorNissan = new Persona("Bea", "Navara");
        Motor motorNissan = new Motor(3.5, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan.setConductor(conductorNissan);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));
        nissan.setTipo(TipoAutomovil.PICKUP);

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());

        System.out.println("----------------------------------");




    }
}

