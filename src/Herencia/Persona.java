package Herencia;

//Clase padre que contiene atributos comunes para Docente y Estudiante

public class Persona {
	protected String nombre;
	protected int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
	}

}
