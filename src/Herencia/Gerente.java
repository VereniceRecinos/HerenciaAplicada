package Herencia;

/*
 * Clase hija Gerente que hereda de Empleado.
 * Se sobreescribe calcularSalario()
 * para agregar un bono al salario base
 */
public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    /*
     * Se sobreescribe calcularSalario()
     * para sumar el bono al salario base
     */
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bono;
    }
}
