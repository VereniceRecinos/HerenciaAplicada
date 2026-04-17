package Herencia;

/*
 * Clase hija FacturaContado
 */
public class FacturaContado extends Factura {
    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    //Se sobreescribe calcularTotal()
    @Override
    public double calcularTotal() {
        double totalFinal = total - descuento;

        if (totalFinal < 0) {
            return 0;
        }

        return totalFinal;
    }
}
