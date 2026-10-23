package comun.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CaminoTest {

    private Camino crearCamino() {
        return new Camino(2, 7, new Posicion(0, 0), new Posicion(3, 4), 5.0);
    }

    @Test
    void conectaConElPrimerExtremo() {
        assertTrue(crearCamino().conecta(2));
    }

    @Test
    void conectaConElSegundoExtremo() {
        assertTrue(crearCamino().conecta(7));
    }

    @Test
    void noConectaConZonaAjena() {
        assertFalse(crearCamino().conecta(4));
    }

    @Test
    void devuelveSegundoExtremoDesdePrimero() {
        assertEquals(7, crearCamino().otroExtremo(2));
    }

    @Test
    void devuelvePrimerExtremoDesdeSegundo() {
        assertEquals(2, crearCamino().otroExtremo(7));
    }

    @Test
    void devuelveMenosUnoSiNoPertenece() {
        assertEquals(-1, crearCamino().otroExtremo(4));
    }

    @Test
    void conservaDatosDelConstructor() {
        Posicion inicio = new Posicion(0, 0);
        Posicion fin = new Posicion(3, 4);
        Camino camino = new Camino(2, 7, inicio, fin, 5.0);
        assertEquals(2, camino.getIdZonaA());
        assertEquals(7, camino.getIdZonaB());
        assertSame(inicio, camino.getInicio());
        assertSame(fin, camino.getFin());
        assertEquals(5.0, camino.getLongitud());
    }
}
