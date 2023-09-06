public class Automovil {
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrado;

    public void detalle(){
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindrado = " + this.cilindrado);
    }

}
