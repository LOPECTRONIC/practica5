abstract class Empleado {
    private final String nombre, id;
    Empleado(String nombre, String id) { this.nombre = nombre; this.id = id; }
    String getNombre() { return nombre; }
    abstract double calcularPago();
}
