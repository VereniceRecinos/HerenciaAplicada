package Herencia;

/*
 * Clase hija Docente
 * Hereda de Persona
 */

public class Docente extends Persona {
	private String especialidad;
	
	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}
	
	//Se sobreescribe mostrar()
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Especialidad: "+especialidad);
	}

}
