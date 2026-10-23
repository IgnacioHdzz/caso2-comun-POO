package comun.protocolo.datos;

// ERROR: algo que el servidor rechazó (código inválido, especie tomada...).
public class DatosError {

    private String texto;

    public DatosError(String pTexto) {
        this.texto = pTexto;
    }

    public String getTexto() {
        return texto;
    }
}
