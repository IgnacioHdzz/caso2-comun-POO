package comun.modelo;

import java.util.ArrayList;
import java.util.List;

// Contiene las zonas y los caminos que conocen tanto el cliente como el servidor.
public class MapaBase {

    private List<Zona> zonas;
    private List<Camino> caminos;

    public MapaBase(List<Zona> pZonas, List<Camino> pCaminos) {
        this.zonas = pZonas;
        this.caminos = pCaminos;
    }

    // Copia las listas para representar la forma del mapa sin compartir esas listas.
    public MapaBase(MapaBase pOriginal) {
        this(new ArrayList<>(pOriginal.zonas), new ArrayList<>(pOriginal.caminos));
    }

    // Busca una zona por su identificador, o devuelve null si no existe.
    public Zona getZona(int pIdZona) {
        for (Zona zona : zonas) {
            if (zona.getId() == pIdZona) {
                return zona;
            }
        }
        return null;
    }

    // Encuentra la zona que contiene una posicion concreta.
    public Zona zonaDe(Posicion pPosicion) {
        for (Zona zona : zonas) {
            if (zona.contiene(pPosicion)) {
                return zona;
            }
        }
        return null;
    }

    // Obtiene los caminos que conectan con la zona indicada.
    public List<Camino> getCaminosDe(int pIdZona) {
        List<Camino> resultado = new ArrayList<>();
        for (Camino camino : caminos) {
            if (camino.conecta(pIdZona)) {
                resultado.add(camino);
            }
        }
        return resultado;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public List<Camino> getCaminos() {
        return caminos;
    }
}
