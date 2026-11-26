class Prestamo {
    private final Libro libro;
    private final Lector lector;
    private boolean activo;
    private int diaLimite;
    Prestamo(Libro libro, Lector lector) { this.libro = libro; this.lector = lector; }
    boolean registrar(int dia) {
        if (activo || !libro.prestar()) return false;
        activo = true; diaLimite = dia + 7; return true;
    }
    boolean devolver() {
        if (!activo) return false;
        libro.devolver(); activo = false; return true;
    }
    boolean vencido(int dia) { return activo && dia > diaLimite; }
}
