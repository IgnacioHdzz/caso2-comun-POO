package comun.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class TazaBaseTest {

    @Test
    void conservaIdentificadorPosicionYZona() {
        Posicion posicion = new Posicion(12, 25);
        TazaBase taza = new TazaBase(8, posicion, 3);

        assertEquals(8, taza.getId());
        assertSame(posicion, taza.getPosicion());
        assertEquals(3, taza.getIdZona());
    }

    @Test
    void constructorDeCopiaConservaDatos() {
        TazaBase original = new TazaBase(2, new Posicion(4, 6), 1);
        TazaBase copia = new TazaBase(original);

        assertEquals(original.getId(), copia.getId());
        assertSame(original.getPosicion(), copia.getPosicion());
        assertEquals(original.getIdZona(), copia.getIdZona());
    }
}
