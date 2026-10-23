package comun.protocolo.datos;

import java.util.List;

// MOVE_ANIMALS: animales seleccionados y punto de destino.
public class DatosMoverAnimales {

    private List<Integer> idsAnimales;
    private double destinoX;
    private double destinoY;

    public DatosMoverAnimales(List<Integer> pIdsAnimales, double pDestinoX, double pDestinoY) {
        this.idsAnimales = pIdsAnimales;
        this.destinoX = pDestinoX;
        this.destinoY = pDestinoY;
    }

    public List<Integer> getIdsAnimales() {
        return idsAnimales;
    }

    public double getDestinoX() {
        return destinoX;
    }

    public double getDestinoY() {
        return destinoY;
    }
}
