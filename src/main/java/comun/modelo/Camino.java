package comun.modelo;

// Un camino que une los centros de dos zonas. Los animales solo caminan por aquí.
public class Camino {

    private int idZonaA;
    private int idZonaB;
    private Posicion inicio;
    private Posicion fin;
    private double longitud;

    public Camino(int pIdZonaA, int pIdZonaB, Posicion pInicio, Posicion pFin, double pLongitud) {
        this.idZonaA = pIdZonaA;
        this.idZonaB = pIdZonaB;
        this.inicio = pInicio;
        this.fin = pFin;
        this.longitud = pLongitud;
    }

    public boolean conecta(int pIdZona) {
        return pIdZona == idZonaA || pIdZona == idZonaB;
    }

    public int otroExtremo(int pIdZona) {
        if (pIdZona == idZonaA) {
            return idZonaB;
        }
        if (pIdZona == idZonaB) {
            return idZonaA;
        }
        return -1;
    }

    public int getIdZonaA() {
        return idZonaA;
    }

    public int getIdZonaB() {
        return idZonaB;
    }

    public Posicion getInicio() {
        return inicio;
    }

    public Posicion getFin() {
        return fin;
    }

    public double getLongitud() {
        return longitud;
    }
}
