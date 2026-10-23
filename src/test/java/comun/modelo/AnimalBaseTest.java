package comun.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnimalBaseTest {

    // Comprueba que un animal con energía positiva está vivo.
    @Test
    void energiaPositivaEstaVivo() {
        AnimalBase animal = crearAnimal(20);
        assertTrue(animal.estaVivo());
    }

    // Comprueba que energía cero significa que ya no está vivo.
    @Test
    void energiaCeroNoEstaVivo() {
        AnimalBase animal = crearAnimal(0);
        assertFalse(animal.estaVivo());
    }

    // Comprueba la regla para energía negativa, aunque no deba ocurrir en el juego.
    @Test
    void energiaNegativaNoEstaVivo() {
        AnimalBase animal = crearAnimal(-2);
        assertFalse(animal.estaVivo());
    }

    // El constructor de copia conserva la energía y los demás datos básicos.
    @Test
    void copiaConservaDatos() {
        AnimalBase original = crearAnimal(5);
        AnimalBase copia = new AnimalBase(original);
        assertEquals(original.getId(), copia.getId());
        assertEquals(original.getEnergia(), copia.getEnergia());
        assertEquals(original.getEspecie(), copia.getEspecie());
        assertEquals(original.getIdManada(), copia.getIdManada());
        assertEquals(original.esBot(), copia.esBot());
        assertTrue(copia.estaVivo());
    }

    // Comprueba que estaVivo se recalcula a partir de la energía actual.
    @Test
    void estaVivoRespondeACambiosDeEnergia() {
        AnimalPrueba animal = new AnimalPrueba(10);
        assertTrue(animal.estaVivo());
        animal.cambiarEnergia(0);
        assertFalse(animal.estaVivo());
        animal.cambiarEnergia(1);
        assertTrue(animal.estaVivo());
    }

    private AnimalBase crearAnimal(int pEnergia) {
        return new AnimalBase(7, new Posicion(12, 15), 2,
                Especie.JAGUAR, pEnergia, 3, false);
    }

    // Subclase exclusiva de la prueba para utilizar el método protegido.
    private static class AnimalPrueba extends AnimalBase {
        AnimalPrueba(int pEnergia) {
            super(1, new Posicion(0, 0), 0, Especie.JAGUAR, pEnergia, 1, false);
        }

        void cambiarEnergia(int pEnergia) {
            setEnergia(pEnergia);
        }
    }
}
