
package examen_programacion_orientada_a_Objetos;

class Producto {
    private String nombre;
    private double precio;
    private long existencias;

    
    public Producto(int identificador, String nombre, double precio, long existencias) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }

    // Métodos para mostrar los atributos
    public void mostrarNombre() {
        System.out.println("Nombre del producto: " + nombre);
    }

    public void mostrarPrecio() {
        System.out.println("Precio del producto: " + precio);
    }

    public void mostrarExistencias() {
        System.out.println("Existencias del producto: " + existencias);
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getExistencias() {
        return existencias;
    }

    public void setExistencias(long existencias) {
        this.existencias = existencias;
    }
}

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Producto A", 10.99, 100);

        producto1.mostrarNombre();
        producto1.mostrarPrecio();
        producto1.mostrarExistencias();

        producto1.setNombre("Producto A Modificado");
        producto1.setPrecio(15.99);
        producto1.setExistencias(150);

        System.out.println("\nDespués de modificar el producto1:");
        producto1.mostrarNombre();
        producto1.mostrarPrecio();
        producto1.mostrarExistencias();
    }
}
