package tp5_lab1;

public class Producto {

    private String nombre, categoria;
    private double precio;
    

    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public Producto() {
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    
    
    
    
}
