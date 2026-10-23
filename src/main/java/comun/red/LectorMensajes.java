package comun.red;

import comun.protocolo.ConvertidorJson;

/**
 * Hilo que escucha una línea: lee mensajes uno tras otro y se los entrega al receptor.
 * Cuando la línea se corta, avisa al receptor con alDesconectarse().
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
        // TODO (Ignacio): ciclo: leerLinea(); si es null, terminar; si no, convertir a Mensaje
        // y receptor.recibir(...). En el finally: conexion.cerrar() y receptor.alDesconectarse().
        // (run() no puede declarar throws: la IOException se atrapa aquí.)
    }
}
