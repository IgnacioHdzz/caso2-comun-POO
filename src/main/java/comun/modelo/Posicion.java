package comun.modelo;

// Un punto del mapa. Es inmutable: para "mover" algo se crea una Posicion nueva.
public class Posicion {
    private final double x;
    private final double y;
    public Posicion(double pX, double pY) {
        this.x = pX;
        this.y = pY;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distanciaA(Posicion pOtra) {
        double dx = pOtra.getX() - this.x;
        double dy = pOtra.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
