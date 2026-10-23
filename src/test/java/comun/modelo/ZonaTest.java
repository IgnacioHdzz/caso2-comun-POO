package comun.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ZonaTest {

    private final Zona zona = new Zona(1, 10, 20, 100, 80, new Posicion(60, 60));

    @Test
    void puntoInteriorPerteneceALaZona() {
        assertTrue(zona.contiene(new Posicion(60, 60)));
    }

    @Test
    void esquinaSuperiorIzquierdaEstaIncluida() {
        assertTrue(zona.contiene(new Posicion(10, 20)));
    }

    @Test
    void bordeDerechoEstaExcluido() {
        assertFalse(zona.contiene(new Posicion(110, 60)));
    }

    @Test
    void bordeInferiorEstaExcluido() {
        assertFalse(zona.contiene(new Posicion(60, 100)));
    }

    @Test
    void puntoExteriorNoPerteneceALaZona() {
        assertFalse(zona.contiene(new Posicion(9, 60)));
        assertFalse(zona.contiene(new Posicion(60, 19)));
    }

    @Test
    void puntoEnBordeSuperiorEIzquierdoEstaIncluido() {
        assertTrue(zona.contiene(new Posicion(60, 20)));
        assertTrue(zona.contiene(new Posicion(10, 60)));
    }
}
