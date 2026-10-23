package comun.red;

import comun.protocolo.Mensaje;

/**
 * Quien recibe lo que lee un LectorMensajes. En el servidor es la SesionCliente;
 * en el cliente, la ConexionServidor. El mismo lector sirve para los dos.
 */
public interface IReceptorMensajes {

    void recibir(Mensaje pMensaje);

    void alDesconectarse();
}
