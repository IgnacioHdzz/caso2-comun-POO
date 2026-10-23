package comun.red;

// Clases necesarias para abrir la línea de comunicación con otro programa. Son de java .io y .net, no librarías externas.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;   // La codificación UTF-8 es la que respeta tildes y eñes, y es la que usamos en el protocolo. 


public class Conexion {

    private final Socket socket;
    private final BufferedReader entrada;
    private final PrintWriter salida;

    public Conexion(Socket pSocket) throws IOException {
        this.socket = pSocket;
        this.entrada = new BufferedReader(new InputStreamReader(pSocket.getInputStream(), StandardCharsets.UTF_8));
        // El getInputStream() devuelve un flujo de bytes, el InputStreamReader convierte de bytes a caracteres, y el BufferedReader permite leer línea por línea.
        this.salida = new PrintWriter(new OutputStreamWriter(pSocket.getOutputStream(), StandardCharsets.UTF_8), true);
        // El PrintWriter permite escribir línea por línea, el outputStreamWriter convierte de caracteres a bytes, el getOutputStream mete todo al socket, y el true hace que se haga flush automáticamente al escribir una línea (si no, habría que llamar flush() a mano).
    } // Se puede ver el patrón decorator en la construcción de entrada y salida, cada clase envuelve a la anterior para añadirle funcionalidad.


    // Bloquea hasta que llega una línea completa. Devuelve null si el otro lado cerró la línea.
    public String leerLinea() throws IOException {
        return entrada.readLine();
    }

    public void escribirLinea(String pLinea) {
        salida.println(pLinea);
    }

    public void cerrar() {
        try {
            socket.close();
        } catch (IOException e) {
            // Si falla cerrar despúes, no hay nada más que hacer, igual esa conexión ya no se va a usar. 
            // Por eso se deja el catch vacío. 
        }
    }

    public boolean estaCerrada() {
        return socket.isClosed();
    }
}