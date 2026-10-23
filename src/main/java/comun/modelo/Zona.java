package comun.modelo;

/**
 * Una de las 12 zonas del mapa: un rectángulo del mundo con un punto central
 * (el cruce donde llegan sus caminos).
 */
public class Zona {

    private int id;
    private double x;
    private double y;
    private double ancho;
    private double alto;
    private Posicion centro;

    public Zona(int pId, double pX, double pY, double pAncho, double pAlto, Posicion pCentro) {
        this.id = pId;
        this.x = pX;
        this.y = pY;
        this.ancho = pAncho;
        this.alto = pAlto;
        this.centro = pCentro;
    }

    public boolean contiene(Posicion pPosicion) {
        return pPosicion.getX() >= x && pPosicion.getX() < x + ancho
                && pPosicion.getY() >= y && pPosicion.getY() < y + alto;
    }

    public int getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public Posicion getCentro() {
        return centro;
    }
}
