class Libro {
    private final String titulo;
    private boolean disponible = true;
    Libro(String titulo) { this.titulo = titulo; }
    boolean prestar() { if (!disponible) return false; disponible = false; return true; }
    void devolver() { disponible = true; }
    boolean isDisponible() { return disponible; }
}
