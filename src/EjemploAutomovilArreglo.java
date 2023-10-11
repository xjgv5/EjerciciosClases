import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martinez");

        Motor motorSubaru = new Motor(2.0, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("Subaru", "Impresa");
        subaru.setMotor(motorSubaru);
        subaru.setEstanque(new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
       // subaru.setRuedas(ruedaSub);


        Persona conductorMazda = new Persona("Pato", "Rodriguez");
        Motor motorMazda = new Motor(3.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, motorMazda);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(conductorMazda);
        //mazda.setRuedas(ruedaMzd);


        Persona conductorNissan = new Persona("Bea", "Navara");
        Motor motorNissan = new Motor(3.5, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.ROJO,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan.setConductor(conductorNissan);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil audi = new Automovil("Audi","A3");

        audi.setConductor(new Persona("Jano","Pérez"));

        Automovil[] autos = new Automovil[4];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = audi;

        Arrays.sort(autos);
        for (int i = 0; i < autos.length; i++){
            System.out.println(autos[i]);
        }
    }
}

