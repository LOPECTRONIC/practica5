public class Main {
    public static void main(String[] args) {
        Entrega[] entregas = {new EntregaBicicleta(4), new EntregaAutomovil(4)};
        for (Entrega e : entregas) System.out.println(e.calcularCosto() + " con recargo: " + e.calcularCosto(2));
        System.out.println(new EntregaBicicleta(0).calcularCosto());
    }
}
