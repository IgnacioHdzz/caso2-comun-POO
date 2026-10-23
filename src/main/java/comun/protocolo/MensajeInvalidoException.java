package comun.protocolo;

// Para controlar que el texto recibido sea un mensaje válido del protocolo

public class MensajeInvalidoException extends Exception {

    private static final String MENSAJE_ERROR = "Mensaje inválido: ";

    public MensajeInvalidoException(String pLinea, Throwable pCausa) {
        super(MENSAJE_ERROR + pLinea, pCausa);
    }
}