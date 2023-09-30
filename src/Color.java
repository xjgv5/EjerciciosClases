public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    GRIS("Gris"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NARANJA("Naranja");

    private final String color;

    Color(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
