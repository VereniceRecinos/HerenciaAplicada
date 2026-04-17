package Herencia;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * En este main se realizan casos de prueba para cada ejercicio,
		 * verificando la herencia, la sobrescritura de métodos
		 * y el uso de super en las clases hijas.
		 */
		
		
		// Ejercicio 1: Persona, Docente y Estudiante
		// Se comprueba la herencia desde Persona
		// y la sobrescritura del método mostrar()

		Docente docente = new Docente("Carlos", 40, "Matemática");
		Estudiante estudiante = new Estudiante("Ana", 20, "2026012");
		
		docente.mostrar();
		
		System.out.println("-------------------------");
		estudiante.mostrar();
		
		System.out.println("===========================");
		
		
		// Ejercicio 2: Cuenta y CuentaCorriente
		// Se prueba el retiro con sobregiro permitido
		// mediante la sobrescritura de retirar()

		CuentaCorriente cuenta = new CuentaCorriente(500, 300);

		cuenta.mostrarSaldo();
		cuenta.retirar(700);
		cuenta.mostrarSaldo();
		cuenta.retirar(200);
		cuenta.mostrarSaldo();
		
		System.out.println("===========================");
		

		// Ejercicio 3: Producto y ProductoPerecedero
		// Se verifica el método estaVencido()

		ProductoPerecedero producto = new ProductoPerecedero("Leche", 12.50, "16/04/2026");

		producto.mostrarInfo();

		if (producto.estaVencido("16/04/2026")) {
		    System.out.println("El producto está vencido.");
		} else {
		    System.out.println("El producto no está vencido.");
		}

		System.out.println("===========================");
		
		
		// Ejercicio 4: Transporte y Bus
		// Se sobrescribe descripcion()

		Bus bus = new Bus(45, "Asunción Mita - Jutiapa");
		bus.descripcion();
		
		System.out.println("===========================");
		
		
		// Ejercicio 5: Empleado y Gerente
		// Se sobrescribe calcularSalario()
		// agregando un bono adicional

		Gerente gerente = new Gerente("María", 5000, 1200);
		gerente.mostrarInfo();
		
		System.out.println("===========================");
		
		
		// Ejercicio 6: Animal y Perro
		// Se cambia el comportamiento
		// del método hacerSonido()

		Perro perro = new Perro();
		perro.hacerSonido();
		
		System.out.println("===========================");
		

		// Ejercicio 7: Vehiculo y Moto
		// Se sobrescribe mostrarInfo()

		Moto moto = new Moto("Honda", 180, 600);
		moto.mostrarInfo();
		
		System.out.println("===========================");
		
		
		// Ejercicio 8: Figura, Rectangulo y Circulo
		// Se prueba calcularArea()
		// en distintas figuras

		Rectangulo rectangulo = new Rectangulo("Rojo", 5, 4);
		Circulo circulo = new Circulo("Azul", 3);

		rectangulo.mostrarColor();
		System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

		circulo.mostrarColor();
		System.out.println("Área del círculo: " + circulo.calcularArea());
		
		System.out.println("===========================");
		
		
		// Ejercicio 9: Libro y LibroDigital
		// Se sobrescribe mostrarInfo()
		// para agregar el tamaño en MB

		LibroDigital libro = new LibroDigital("Java Básico", "Juan Pérez", 15.7);
		libro.mostrarInfo();
		
		System.out.println("===========================");
		
		
		// Ejercicio 10: Sistema de Facturación
		// Se prueban dos tipos de factura:
		// contado con descuento y crédito con recargo

		Cliente cliente1 = new Cliente("Emilyn", "1234567-8");

		FacturaContado contado = new FacturaContado(1, cliente1, 500, 50);
		contado.mostrarFactura();

		System.out.println("-------------------------");

		FacturaCredito credito = new FacturaCredito(2, cliente1, 500, 75, 5);
		credito.mostrarFactura();
		credito.mostrarCuotas();
	}

}
