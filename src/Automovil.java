public class Automovil {
    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrado;
    int capacidadTanque = 40;

    public Automovil(){

    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrado) {
        this(fabricante, modelo, color);
        this.cilindrado = cilindrado;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrado, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrado);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrado() {
        return cilindrado;
    }

    public void setCilindrado(double cilindrado) {
        this.cilindrado = cilindrado;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

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

    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }
}
