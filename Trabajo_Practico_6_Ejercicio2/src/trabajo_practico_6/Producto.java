package trabajo_practico_6;


public class Producto implements Comparable<Producto>{

     //Atributos
    private long codigo;
    private String descripcion; 
    private double precio;
    private String categoria;
    private int stock; 
    private String rubro; 
    
    //Constructor 
    public Producto(long codigo, String descripcion, double precio, int stock, String rubro) {
        this.codigo = codigo; 
        this.descripcion = descripcion;
        this.precio = precio; 
        this.stock = stock; 
        this.rubro = rubro; 
        this.categoria = rubro; 
    }

    //Getters and setters
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    //ToString
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", rubro=" + rubro + '}';
    }

    //Métodos del TreeSet
    
    public int compareTo(Producto otro) {      // Método compareTo para ordenar por codigo                Para usar este método hay que implementarlo en la clase. Esto está en la linea 6
        return Long.compare(this.codigo, otro.codigo);  //Compara los códigos y los ordena
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return codigo == producto.codigo; 
    }

    @Override
    public int hashCode() {
        return Long.hashCode(codigo); 
    }
}
