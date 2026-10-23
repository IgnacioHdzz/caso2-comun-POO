package comun.protocolo.datos;

import java.util.List;
import comun.modelo.Especie;

// ANIMAL_SELECTION: especies disponibles y lo que ya eligió cada uno (null si todavía no).
public class DatosSeleccionEspecies {

    private List<Especie> disponibles;
    private Especie especiePropia;
    private Especie especieRival;

    public DatosSeleccionEspecies(List<Especie> pDisponibles, Especie pEspeciePropia, Especie pEspecieRival) {
        this.disponibles = pDisponibles;
        this.especiePropia = pEspeciePropia;
        this.especieRival = pEspecieRival;
    }

    public List<Especie> getDisponibles() {
        return disponibles;
    }

    public Especie getEspeciePropia() {
        return especiePropia;
    }

    public Especie getEspecieRival() {
        return especieRival;
    }
}
