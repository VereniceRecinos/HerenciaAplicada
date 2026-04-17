package Herencia;

/*
 * Clase padre Figura
 */
public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0;
    }

    public void mostrarColor() {
        System.out.println("Color: " + color);
    }
}
