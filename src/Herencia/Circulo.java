package Herencia;

/*
 * Clase hija que hereda de Figura.
 * Representa un círculo con un radio.
 * Se sobreescribe calcularArea() para obtener el área del círculo.
 */

public class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color); //llama al constructor de Figura
        this.radio = radio;
    }

    //Se sobreescribe calcularArea()
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}