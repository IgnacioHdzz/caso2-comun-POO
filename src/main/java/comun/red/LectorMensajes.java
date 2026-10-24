package comun.red;

import java.io.IOException;
import comun.protocolo.ConvertidorJson;
import comun.protocolo.Mensaje;
import comun.protocolo.MensajeInvalidoException;

/**
 * Hilo que escucha una línea: lee mensajes uno tras otro y se los entrega al receptor.
 * Cuando la línea se cierra o se corta, la cierra de su lado y avisa al receptor.
 */
public class LectorMensajes implements Runnable {

    private final Conexion conexion;
    private final ConvertidorJson convertidor;
    private final IReceptorMensajes receptor;

    public LectorMensajes(Conexion pConexion, ConvertidorJson pConvertidor, IReceptorMensajes pReceptor) {
        this.conexion = pConexion;
        this.convertidor = pConvertidor;
        this.receptor = pReceptor;
    }

    @Override
    public void run() {
        try {
            String linea = conexion.leerLinea();
            while (linea != null) {
                entregar(linea);
                linea = conexion.leerLinea();
            }
        } catch (IOException e) {
            // La línea se cortó de golpe: se trata igual que un cierre normal (abajo, en el finally).
        } finally {
            conexion.cerrar();
            receptor.alDesconectarse();
        }
    }

    private void entregar(String pLinea) {
        try {
            Mensaje mensaje = convertidor.desdeJson(pLinea);
            receptor.recibir(mensaje);
        } catch (MensajeInvalidoException e) {
            // Una línea mala no corta la conexión: se ignora y se sigue escuchando.
        }
    }
}