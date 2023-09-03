public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        auto.fabricante = "Subaru";
        auto.modelo = "Impresa";
        auto.cilindrado = 2.0;
        auto.color = "Blanco";

        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindrado = " + auto.cilindrado);
    }
}
