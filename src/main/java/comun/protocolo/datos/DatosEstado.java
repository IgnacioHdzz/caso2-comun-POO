package comun.protocolo.datos;

import java.util.List;
import comun.modelo.AnimalBase;
import comun.modelo.BanderaBase;
import comun.modelo.TazaBase;

// STATE_UPDATE: lo que este jugador puede ver en este momento.
public class DatosEstado {

    private int idZonaVisible;
    private List<Integer> zonasConAnimales;
    private List<AnimalBase> animales;
    private List<TazaBase> tazas;
    private List<BanderaBase> banderas;
    private int capacidadDanio;
    private int tazasConsumidas;
    private int botsEliminados;
    private List<String> eventos;

    public DatosEstado(int pIdZonaVisible, List<Integer> pZonasConAnimales, List<AnimalBase> pAnimales, List<TazaBase> pTazas, List<BanderaBase> pBanderas, int pCapacidadDanio, int pTazasConsumidas, int pBotsEliminados, List<String> pEventos) {
        this.idZonaVisible = pIdZonaVisible;
        this.zonasConAnimales = pZonasConAnimales;
        this.animales = pAnimales;
        this.tazas = pTazas;
        this.banderas = pBanderas;
        this.capacidadDanio = pCapacidadDanio;
        this.tazasConsumidas = pTazasConsumidas;
        this.botsEliminados = pBotsEliminados;
        this.eventos = pEventos;
    }

    public int getIdZonaVisible() {
        return idZonaVisible;
    }

    public List<Integer> getZonasConAnimales() {
        return zonasConAnimales;
    }

    public List<AnimalBase> getAnimales() {
        return animales;
    }

    public List<TazaBase> getTazas() {
        return tazas;
    }

    public List<BanderaBase> getBanderas() {
        return banderas;
    }

    public int getCapacidadDanio() {
        return capacidadDanio;
    }

    public int getTazasConsumidas() {
        return tazasConsumidas;
    }

    public int getBotsEliminados() {
        return botsEliminados;
    }

    public List<String> getEventos() {
        return eventos;
    }
}
