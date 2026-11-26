public class Main {
    public static void main(String[] args) {
        SensorTemperatura t = new SensorTemperatura("T1", "Norte");
        System.out.println(t.leer()); t.calibrar(-1);
        Sensor[] sensores = {t, new SensorHumedad("H1", "Sur"), new SensorLuz("L1", "Centro")};
        for (Sensor s : sensores) System.out.println(s.leer());
    }
}
