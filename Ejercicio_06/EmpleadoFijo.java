class EmpleadoFijo extends Empleado {
    private final double sueldo;
    EmpleadoFijo(String n, String id, double s) { super(n,id); sueldo=s; }
    @Override double calcularPago() { return sueldo; }
}
