public class Main {
    public static void main(String[] args) {
        Libro l = new Libro("El principito");
        Prestamo p = new Prestamo(l, new Lector("Luis"));
        System.out.println("Prestamo: " + p.registrar(1));
        System.out.println("Repetido: " + p.registrar(2));
        System.out.println("Vencido dia 8: " + p.vencido(8));
        System.out.println("Vencido dia 9: " + p.vencido(9));
        System.out.println("Devolucion: " + p.devolver());
        System.out.println("Disponible: " + l.isDisponible());
    }
}
