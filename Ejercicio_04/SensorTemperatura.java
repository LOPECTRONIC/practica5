class SensorTemperatura extends Sensor implements Calibrable {
    private double valor = 24;
    SensorTemperatura(String id, String ubicacion) { super(id, ubicacion); }
    public void calibrar(double ajuste) { valor += ajuste; }
    @Override String leer() { return datos() + ": " + valor + " C"; }
}
