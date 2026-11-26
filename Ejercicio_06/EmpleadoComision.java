class EmpleadoComision extends Empleado {
    private final double ventas;
    EmpleadoComision(String n, String id, double v) { super(n,id); ventas=v; }
    @Override double calcularPago() { return ventas * 0.1; }
}
