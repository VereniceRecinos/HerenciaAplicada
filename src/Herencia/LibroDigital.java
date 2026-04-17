package Herencia;

//Clase hija LibroDigital
 
public class LibroDigital extends Libro {
    private double tamanoMB;

    public LibroDigital(String titulo, String autor, double tamanoMB) {
        super(titulo, autor);
        this.tamanoMB = tamanoMB;
    }

    //Se sobreescribe mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño: " + tamanoMB + " MB");
    }
}