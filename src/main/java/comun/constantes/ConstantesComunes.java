package comun.constantes;

/**
 * Valores que el servidor y el cliente tienen que compartir exactamente.
 * Si uno de estos cambia, cambia para los dos programas a la vez.
 */
public final class ConstantesComunes {

    private ConstantesComunes() {
    }

    // Red
    public static final String HOST = "localhost";
    public static final int PUERTO = 5000;

    // Ritmo del juego (el cliente lo usa para suavizar el movimiento)
    public static final int TICKS_POR_SEGUNDO = 20;
    public static final long MS_POR_TICK = 1000 / TICKS_POR_SEGUNDO;

    // Mapa: 12 zonas en una cuadrícula de 4 columnas x 3 filas
    public static final int CANTIDAD_ZONAS = 12;
    public static final int COLUMNAS_ZONAS = 4;
    public static final int FILAS_ZONAS = 3;
    public static final int ANCHO_ZONA = 600;
    public static final int ALTO_ZONA = 400;
    public static final int ANCHO_MAPA = ANCHO_ZONA * COLUMNAS_ZONAS;
    public static final int ALTO_MAPA = ALTO_ZONA * FILAS_ZONAS;

    // Partidas
    public static final int LONGITUD_CODIGO = 4;
    public static final int JUGADORES_POR_PARTIDA = 2;
    public static final int CANTIDAD_ESPECIES = 7;
}
