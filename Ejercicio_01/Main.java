public class Main {
    public static void main(String[] args) {
        CuentaDigital c = new CuentaDigital("Ana", "C01", 1000);
        System.out.println(c.depositar(100) + " saldo: " + c.consultarSaldo());
        System.out.println(c.retirar(200) + " saldo: " + c.consultarSaldo());
        System.out.println(c.depositar(0) + " saldo: " + c.consultarSaldo());
        System.out.println(c.retirar(1000) + " saldo: " + c.consultarSaldo());
        System.out.println(c.retirar(400) + " saldo: " + c.consultarSaldo());
    }
}
