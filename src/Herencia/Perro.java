package Herencia;

/*
 * Clase hija Perro
 */
public class Perro extends Animal {

	//Se sobreescribe hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau guau");
    }
}
