package comun.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PosicionTest {

    @Test
    void calculaDistanciaHorizontal() {
        Posicion inicio = new Posicion(2, 5);
        Posicion fin = new Posicion(9, 5);

        assertEquals(7.0, inicio.distanciaA(fin), 0.000001);
    }

    @Test
    void calculaDistanciaVertical() {
        Posicion inicio = new Posicion(4, 1);
        Posicion fin = new Posicion(4, 6);

        assertEquals(5.0, inicio.distanciaA(fin), 0.000001);
    }

    @Test
    void calculaDistanciaDiagonal() {
        Posicion inicio = new Posicion(0, 0);
        Posicion fin = new Posicion(3, 4);

        assertEquals(5.0, inicio.distanciaA(fin), 0.000001);
    }

    @Test
    void calculaDistanciaConCoordenadasNegativas() {
        Posicion inicio = new Posicion(-2, -3);
        Posicion fin = new Posicion(1, 1);

        assertEquals(5.0, inicio.distanciaA(fin), 0.000001);
    }

    @Test
    void devuelveCeroParaElMismoPunto() {
        Posicion posicion = new Posicion(5, 5);

        assertEquals(0.0, posicion.distanciaA(posicion), 0.000001);
    }

    @Test
    void distanciaEsSimetricaYSinModificarCoordenadas() {
        Posicion a = new Posicion(2, 3);
        Posicion b = new Posicion(7, 15);

        assertEquals(a.distanciaA(b), b.distanciaA(a), 0.000001);
        assertEquals(2.0, a.getX());
        assertEquals(3.0, a.getY());
        assertEquals(7.0, b.getX());
        assertEquals(15.0, b.getY());
    }
}