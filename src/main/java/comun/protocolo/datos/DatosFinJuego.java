package comun.protocolo.datos;

// GAME_OVER: quién ganó y el resumen.
public class DatosFinJuego {

    private String nicknameGanador;
    private DatosResumen resumen;

    public DatosFinJuego(String pNicknameGanador, DatosResumen pResumen) {
        this.nicknameGanador = pNicknameGanador;
        this.resumen = pResumen;
    }

    public String getNicknameGanador() {
        return nicknameGanador;
    }

    public DatosResumen getResumen() {
        return resumen;
    }
}
