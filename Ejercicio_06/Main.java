public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {new EmpleadoPorHora("Ana","1",40,15), new EmpleadoFijo("Luis","2",2500), new EmpleadoComision("Eva","3",3000)};
        for (Empleado e : empleados) System.out.println(e.getNombre() + ": " + e.calcularPago());
        System.out.println(new EmpleadoPorHora("Sol","4",0,15).calcularPago());
    }
}
