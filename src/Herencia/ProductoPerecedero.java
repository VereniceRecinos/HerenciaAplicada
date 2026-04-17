package Herencia;

/*
 * Clase hija ProductoPerecedero
 */
public class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencido(String fechaActual) {
        return fechaActual.equals(fechaVencimiento);
    }

    //Se sobreescribe mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);
    }
}
