class SensorHumedad extends Sensor {
    SensorHumedad(String id, String ubicacion) { super(id, ubicacion); }
    @Override String leer() { return datos() + ": 65 %"; }
}
