package comun.modelo;

// Todo lo que ocupa un lugar en el mapa: animales, tazas y banderas.
public abstract class ElementoMapa {

    private int id;
    private Posicion posicion;
    private int idZona;

    protected ElementoMapa(int pId, Posicion pPosicion, int pIdZona) {
        this.id = pId;
        this.posicion = pPosicion;
        this.idZona = pIdZona;
    }

    // Constructor de copia: crea un elemento con los mismos datos que pOriginal.
    protected ElementoMapa(ElementoMapa pOriginal) {
        this(pOriginal.id, pOriginal.posicion, pOriginal.idZona);
    }

    public int getId() {
        return id;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getIdZona() {
        return idZona;
    }

    // Solo las subclases pueden mover el elemento (en el servidor, el animal al caminar).
    protected void moverA(Posicion pPosicion, int pIdZona) {
        this.posicion = pPosicion;
        this.idZona = pIdZona;
    }
}
