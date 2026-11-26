class EmpleadoPorHora extends Empleado {
    private final double horas, tarifa;
    EmpleadoPorHora(String n, String id, double h, double t) { super(n,id); horas=h; tarifa=t; }
    @Override double calcularPago() { return horas * tarifa; }
}
