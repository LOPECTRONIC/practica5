class SensorLuz extends Sensor {
    SensorLuz(String id, String ubicacion) { super(id, ubicacion); }
    @Override String leer() { return datos() + ": 400 lux"; }
}
