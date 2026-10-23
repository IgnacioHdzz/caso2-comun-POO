package comun.protocolo.datos;

import java.util.Map;
import comun.modelo.Especie;

// El resumen de una partida terminada.
public class DatosResumen {

    private long duracionMs;
    private Map<String, Integer> botsEliminadosPorJugador;
    private Map<Especie, Integer> animalesEliminadosPorEspecie;
    private Map<String, Integer> tazasPorJugador;

    public DatosResumen(long pDuracionMs, Map<String, Integer> pBotsEliminadosPorJugador, Map<Especie, Integer> pAnimalesEliminadosPorEspecie, Map<String, Integer> pTazasPorJugador) {
        this.duracionMs = pDuracionMs;
        this.botsEliminadosPorJugador = pBotsEliminadosPorJugador;
        this.animalesEliminadosPorEspecie = pAnimalesEliminadosPorEspecie;
        this.tazasPorJugador = pTazasPorJugador;
    }

    public long getDuracionMs() {
        return duracionMs;
    }

    public Map<String, Integer> getBotsEliminadosPorJugador() {
        return botsEliminadosPorJugador;
    }

    public Map<Especie, Integer> getAnimalesEliminadosPorEspecie() {
        return animalesEliminadosPorEspecie;
    }

    public Map<String, Integer> getTazasPorJugador() {
        return tazasPorJugador;
    }
}
