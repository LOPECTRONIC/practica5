abstract class Entrega {
    private final double distancia;
    Entrega(double distancia) {
        if (!Double.isFinite(distancia) || distancia < 0) throw new IllegalArgumentException();
        this.distancia = distancia;
    }
    double getDistancia() { return distancia; }
    abstract double calcularCosto();
    double calcularCosto(double recargo) { return calcularCosto() + recargo; }
}
