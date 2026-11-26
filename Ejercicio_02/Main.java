public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        p.agregar(new Producto("Cafe", 12)); p.agregar(new Producto("Sandwich", 18)); p.agregar(new Producto("Jugo", 10));
        p.mostrar();
        System.out.println("Cuarto producto: " + p.agregar(new Producto("Pan", 5)));
        try { new Producto("Pan", 0); } catch (IllegalArgumentException e) { System.out.println("Precio rechazado"); }
    }
}
