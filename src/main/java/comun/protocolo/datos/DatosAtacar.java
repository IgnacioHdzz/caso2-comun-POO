package comun.protocolo.datos;

import java.util.List;

// ATTACK: animales seleccionados y el animal objetivo.
public class DatosAtacar {

    private List<Integer> idsAnimales;
    private int idObjetivo;

    public DatosAtacar(List<Integer> pIdsAnimales, int pIdObjetivo) {
        this.idsAnimales = pIdsAnimales;
        this.idObjetivo = pIdObjetivo;
    }

    public List<Integer> getIdsAnimales() {
        return idsAnimales;
    }

    public int getIdObjetivo() {
        return idObjetivo;
    }
}
