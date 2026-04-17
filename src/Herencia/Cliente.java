package Herencia;

/*
 * Clase Cliente.
 * Almacena la información básica del cliente
 * Utilizada en las facturas, comonombre y NIT.
 */
public class Cliente {
    private String nombre;
    private String nit;

    public Cliente(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }
}
