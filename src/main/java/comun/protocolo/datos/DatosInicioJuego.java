package comun.protocolo.datos;

import comun.modelo.Especie;
import comun.modelo.MapaBase;

// GAME_STARTED: la forma del mapa y los datos iniciales de este jugador.
public class DatosInicioJuego {

    private MapaBase mapa;
    private int idManadaPropia;
    private int idZonaInicial;
    private Especie especiePropia;

    public DatosInicioJuego(MapaBase pMapa, int pIdManadaPropia, int pIdZonaInicial, Especie pEspeciePropia) {
        this.mapa = pMapa;
        this.idManadaPropia = pIdManadaPropia;
        this.idZonaInicial = pIdZonaInicial;
        this.especiePropia = pEspeciePropia;
    }

    public MapaBase getMapa() {
        return mapa;
    }

    public int getIdManadaPropia() {
        return idManadaPropia;
    }

    public int getIdZonaInicial() {
        return idZonaInicial;
    }

    public Especie getEspeciePropia() {
        return especiePropia;
    }
}
