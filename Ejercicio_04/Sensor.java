abstract class Sensor {
    private final String id, ubicacion;
    Sensor(String id, String ubicacion) { this.id = id; this.ubicacion = ubicacion; }
    String datos() { return id + " " + ubicacion; }
    abstract String leer();
}
