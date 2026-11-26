public class Main {
    public static void main(String[] args) {
        String[] claves = {"abcde123", "abc123", "abcdefgh", "abcdefg9", "abcd 123", null};
        for (String c : claves) {
            try { System.out.print(new ValidadorInicial().esValida(c)); }
            catch (NullPointerException e) { System.out.print("Excepcion"); }
            System.out.println(" -> " + new ValidadorClave().esValida(c));
        }
    }
}
