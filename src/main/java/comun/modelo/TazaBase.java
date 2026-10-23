package comun.modelo;

// Una taza de café situada sobre un camino del mapa.
public class TazaBase extends ElementoMapa {

    public TazaBase(int pId, Posicion pPosicion, int pIdZona) {
        super(pId, pPosicion, pIdZona);
    }

    // Copia los datos básicos de otra taza.
    public TazaBase(TazaBase pOriginal) {
        super(pOriginal);
    }
}
