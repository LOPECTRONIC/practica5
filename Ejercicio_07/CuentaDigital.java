class CuentaDigital {
    private final String titular, identificador;
    private double saldo, retirado;
    CuentaDigital(String titular, String identificador, double saldo) {
        if (!Double.isFinite(saldo) || saldo < 0) throw new IllegalArgumentException();
        this.titular = titular; this.identificador = identificador; this.saldo = saldo;
    }
    boolean depositar(double monto) {
        if (!Double.isFinite(monto) || monto <= 0 || !Double.isFinite(saldo + monto)) return false;
        saldo += monto; return true;
    }
    boolean retirar(double monto) {
        if (!Double.isFinite(monto) || monto <= 0 || monto > saldo || retirado + monto > 500) return false;
        saldo -= monto; retirado += monto; return true;
    }
    double consultarSaldo() { return saldo; }
}
