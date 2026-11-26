public class Main {
    public static void main(String[] args) {
        CuentaDigital c = new CuentaDigital("Ana", "C01", 100);
        System.out.println(c.depositar(20));
        System.out.println(c.depositar(0));
        System.out.println(c.depositar(Double.NaN));
        System.out.println(c.retirar(121));
        System.out.println(c.retirar(120));
        System.out.println(c.consultarSaldo());
    }
}
