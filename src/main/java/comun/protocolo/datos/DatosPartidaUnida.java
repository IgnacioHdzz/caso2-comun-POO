package comun.protocolo.datos;

// MATCH_JOINED: confirmación de que el jugador entró a la partida.
public class DatosPartidaUnida {

    private String codigo;
    private String nicknameRival;

    public DatosPartidaUnida(String pCodigo, String pNicknameRival) {
        this.codigo = pCodigo;
        this.nicknameRival = pNicknameRival;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNicknameRival() {
        return nicknameRival;
    }
}
