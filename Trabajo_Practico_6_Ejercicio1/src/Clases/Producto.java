package Clases;


public class Producto {
    
    //Atributos
    private String nombre;
    private double precio;
    private String categoria; 
    
    //Constructor
    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria; 
    }
    
    //Getters and Setters
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //ToString
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + '}';
    }

}
