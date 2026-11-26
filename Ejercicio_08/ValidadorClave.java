class ValidadorClave {
    boolean esValida(String clave) {
        return clave != null && clave.length() >= 8 && sinEspacios(clave) && tieneDigito(clave);
    }
    private boolean sinEspacios(String clave) {
        for (int i=0; i<clave.length(); i++) if (Character.isWhitespace(clave.charAt(i))) return false;
        return true;
    }
    private boolean tieneDigito(String clave) {
        for (int i=0; i<clave.length(); i++) if (Character.isDigit(clave.charAt(i))) return true;
        return false;
    }
}
