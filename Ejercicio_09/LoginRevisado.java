public class LoginRevisado {
    private final String usuarioConfigurado;
    private int intentos;
    LoginRevisado(String usuarioConfigurado) { this.usuarioConfigurado = usuarioConfigurado; }
    boolean permiteRevision(String usuario) {
        if (intentos >= 3) return false;
        intentos++;
        return usuarioConfigurado != null && usuarioConfigurado.equals(usuario);
    }
}
