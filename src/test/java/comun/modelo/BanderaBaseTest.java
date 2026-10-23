package comun.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class BanderaBaseTest {

    @Test
    void conservaIdentificadorPosicionZonaYManadaDuena() {
        Posicion posicion = new Posicion(100, 200);
        BanderaBase bandera = new BanderaBase(5, posicion, 2, 42);

        assertEquals(5, bandera.getId());
        assertSame(posicion, bandera.getPosicion());
        assertEquals(2, bandera.getIdZona());
        assertEquals(42, bandera.getIdManadaDuena());
    }

    @Test
    void constructorDeCopiaConservaDatos() {
        BanderaBase original = new BanderaBase(7, new Posicion(10, 20), 4, 9);
        BanderaBase copia = new BanderaBase(original);

        assertEquals(original.getId(), copia.getId());
        assertSame(original.getPosicion(), copia.getPosicion());
        assertEquals(original.getIdZona(), copia.getIdZona());
        assertEquals(original.getIdManadaDuena(), copia.getIdManadaDuena());
    }
}
