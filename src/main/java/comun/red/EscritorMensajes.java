package comun.red;

import java.util.concurrent.BlockingQueue;         // Una cola pensada para que varios hilos la usen al mismo tiempo sin synchronized. Es una interfaz. 
import java.util.concurrent.LinkedBlockingQueue;  //  La implementación de la interfaz, que es de tamaño ilimitado.
import comun.protocolo.ConvertidorJson;
import comun.protocolo.Mensaje;

/**
 * Hilo que escribe en una línea. Los demás hilos solo dejan mensajes en la cola
 * (enviar regresa de inmediato) y este hilo es el único que escribe en el socket.
 */
public class EscritorMensajes implements Runnable {

    /** Señal de fin: cuando el hilo la saca de la cola, termina. */
    private static final Mensaje FIN = new Mensaje(null, null);

    private final Conexion conexion;
    private final ConvertidorJson convertidor;
    private final BlockingQueue<Mensaje> cola;
    private volatile boolean activo;

    public EscritorMensajes(Conexion pConexion, ConvertidorJson pConvertidor) {
        this.conexion = pConexion;
        this.convertidor = pConvertidor;
        this.cola = new LinkedBlockingQueue<>(); // Se deduce el tipo de la cola por la declaración de antes, para no escribirlo dos veces.
        this.activo = true;
    }

    // Lo pueden llamar varios hilos a la vez, por eso solo deja el mensaje en la cola y regresa. 
    public void enviar(Mensaje pMensaje) {
        if (activo) {
            cola.offer(pMensaje);
        }
    }

    @Override
    public void run() {
        try {
            Mensaje mensaje = cola.take();
            while (mensaje != FIN) {
                conexion.escribirLinea(convertidor.aJson(mensaje));
                mensaje = cola.take();
            }
        } catch (InterruptedException e) {
            // Alguien interrumpió el hilo mientras esperaba en la cola: simplemente termina.
        }
    }

    // Deja de aceptar mensajes nuevos. Los que ya estaban en la cola se envían antes de terminar.
    public void detener() {
        activo = false;
        cola.offer(FIN);
    }
}