class Pedido {
    private final Producto[] productos = new Producto[3];
    private int cantidad;
    boolean agregar(Producto p) {
        if (p == null || cantidad == productos.length) return false;
        productos[cantidad++] = p; return true;
    }
    double subtotal() {
        double suma = 0;
        for (int i = 0; i < cantidad; i++) suma += productos[i].getPrecio();
        return suma;
    }
    double total() { return subtotal() > 30 ? subtotal() * 0.9 : subtotal(); }
    void mostrar() {
        for (int i = 0; i < cantidad; i++) System.out.println(productos[i].getNombre() + ": " + productos[i].getPrecio());
        System.out.printf("Subtotal: %.2f%nTotal: %.2f%n", subtotal(), total());
    }
}
