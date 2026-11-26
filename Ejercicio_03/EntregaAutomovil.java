class EntregaAutomovil extends Entrega {
    EntregaAutomovil(double distancia) { super(distancia); }
    @Override double calcularCosto() { return 10 + 3 * getDistancia(); }
}
