public class Automovil {
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrado;
    int capacidadTanque = 40;

    public String detalle(){
        return "auto.fabricante = " + this.fabricante +
        "\nauto.modelo = " + this.modelo +
        "\nauto.color = " + this.color +
        "\nauto.cilindrado = " + this.cilindrado;

    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return "el auto " + this.fabricante + " frenando !";
    }

    public String acelerandoFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return  km/(capacidadTanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return  km/(capacidadTanque*porcentajeBencina/100f);
    }
}
