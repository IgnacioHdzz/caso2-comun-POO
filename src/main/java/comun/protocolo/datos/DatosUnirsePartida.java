package comun.protocolo.datos;

// JOIN_MATCH: el jugador quiere unirse a una partida con un código.
public class DatosUnirsePartida {

    private String nickname;
    private String codigo;

    public DatosUnirsePartida(String pNickname, String pCodigo) {
        this.nickname = pNickname;
        this.codigo = pCodigo;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCodigo() {
        return codigo;
    }
}
