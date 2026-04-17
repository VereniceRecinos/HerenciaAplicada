package Herencia;


 //Clase hija Moto

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, int velocidad, int cilindrada) {
        super(marca, velocidad);
        this.cilindrada = cilindrada;
    }

    //Se sobreescribe mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}
