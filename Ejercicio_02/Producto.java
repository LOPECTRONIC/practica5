class Producto {
    private final String nombre;
    private final double precio;
    Producto(String nombre, double precio) {
        if (!Double.isFinite(precio) || precio <= 0) throw new IllegalArgumentException("Precio inválido");
        this.nombre = nombre; this.precio = precio;
    }
    String getNombre() { return nombre; }
    double getPrecio() { return precio; }
}
