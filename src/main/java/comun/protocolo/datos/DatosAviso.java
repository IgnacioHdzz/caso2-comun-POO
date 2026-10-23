package comun.protocolo.datos;

// OPPONENT_LEFT: aviso de que el rival abandonó antes de empezar el juego.
public class DatosAviso {

    private String texto;

    public DatosAviso(String pTexto) {
        this.texto = pTexto;
    }

    public String getTexto() {
        return texto;
    }
}
