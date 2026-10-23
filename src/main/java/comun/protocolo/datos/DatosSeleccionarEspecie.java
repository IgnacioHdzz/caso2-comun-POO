package comun.protocolo.datos;

import comun.modelo.Especie;

// SELECT_ANIMAL: la especie que eligió el jugador.
public class DatosSeleccionarEspecie {

    private Especie especie;

    public DatosSeleccionarEspecie(Especie pEspecie) {
        this.especie = pEspecie;
    }

    public Especie getEspecie() {
        return especie;
    }
}
