package comun.protocolo.datos;

// CREATE_MATCH: el jugador quiere crear una partida.
public class DatosCrearPartida {

    private String nickname;

    public DatosCrearPartida(String pNickname) {
        this.nickname = pNickname;
    }

    public String getNickname() {
        return nickname;
    }
}
