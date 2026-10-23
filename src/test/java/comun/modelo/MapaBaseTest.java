package comun.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MapaBaseTest {

    // Prepara dos zonas contiguas y un camino entre ellas.
    private MapaBase crearMapa() {
        Zona zona0 = new Zona(0, 0, 0, 100, 100, new Posicion(50, 50));
        Zona zona1 = new Zona(1, 100, 0, 100, 100, new Posicion(150, 50));
        Camino camino = new Camino(0, 1, zona0.getCentro(), zona1.getCentro(), 100);
        return new MapaBase(new ArrayList<>(List.of(zona0, zona1)),
                new ArrayList<>(List.of(camino)));
    }

    @Test
    void buscaZonaPorId() {
        MapaBase mapa = crearMapa();
        assertEquals(1, mapa.getZona(1).getId());
    }

    @Test
    void retornaNullSiZonaNoExiste() {
        assertNull(crearMapa().getZona(99));
    }

    @Test
    void identificaZonaQueContienePunto() {
        assertEquals(0, crearMapa().zonaDe(new Posicion(20, 30)).getId());
    }

    @Test
    void puntoSobreBordePerteneceASiguienteZona() {
        assertEquals(1, crearMapa().zonaDe(new Posicion(100, 30)).getId());
    }

    @Test
    void retornaNullSiPuntoEstaFuera() {
        assertNull(crearMapa().zonaDe(new Posicion(500, 500)));
    }

    @Test
    void encuentraCaminosDeUnaZona() {
        assertEquals(1, crearMapa().getCaminosDe(0).size());
    }

    @Test
    void zonaSinCaminosDevuelveListaVacia() {
        assertTrue(crearMapa().getCaminosDe(99).isEmpty());
    }

    @Test
    void resultadoDeCaminosEsListaIndependiente() {
        MapaBase mapa = crearMapa();
        mapa.getCaminosDe(0).clear();
        assertEquals(1, mapa.getCaminos().size());
    }

    @Test
    void constructorDeCopiaCreaListasDistintas() {
        MapaBase original = crearMapa();
        MapaBase copia = new MapaBase(original);
        assertNotSame(original.getZonas(), copia.getZonas());
        assertNotSame(original.getCaminos(), copia.getCaminos());
        assertSame(original.getZona(0), copia.getZona(0));
    }
}
