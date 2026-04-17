package Herencia;

/*
 * Clase hija que hereda de Figura.
 * Se sobreescribe calcularArea() para obtener el área del rectángulo
 */

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color); //llama al constructor de Figura
        this.base = base;
        this.altura = altura;
    }

    //Se sobreescribe calcularArea()
    @Override
    public double calcularArea() {
        return base * altura;
    }
}