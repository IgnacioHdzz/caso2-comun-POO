package comun.protocolo.datos;

// MATCH_CREATED: el código de la partida nueva.
public class DatosPartidaCreada {

    private String codigo;

    public DatosPartidaCreada(String pCodigo) {
        this.codigo = pCodigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
