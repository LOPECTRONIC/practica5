class EntregaBicicleta extends Entrega {
    EntregaBicicleta(double distancia) { super(distancia); }
    @Override double calcularCosto() { return 5 + 2 * getDistancia(); }
}
