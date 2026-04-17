package Herencia;

/*
 * Clase hija CuentaCorriente
 * Permite sobregiro con límite
 */
public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    //Se sobreescribe retirar()
    @Override
    public void retirar(double monto) {
        if (saldo - monto >= -limiteSobregiro) {
            super.retirar(monto);
            System.out.println("Retiro realizado correctamente.");
        } else {
            System.out.println("Límite de sobregiro excedido.");
        }
    }
}
