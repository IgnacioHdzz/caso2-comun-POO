package comun.modelo;

// Las 7 especies del juego. Todas tienen las mismas reglas; solo cambian
// su nombre y su imagen, por eso son un enum y no subclases.
public enum Especie {
    JAGUAR("Jaguar"),
    PEREZOSO("Perezoso"),
    TUCAN("Tucán"),
    MONO_CARABLANCA("Mono carablanca"),
    DANTA("Danta"),
    RANA_CALZONUDA("Rana calzonuda"),
    COCODRILO("Cocodrilo");

    private final String nombreVisible;

    Especie(String pNombreVisible) {
        this.nombreVisible = pNombreVisible;
    }

    public String getNombreVisible() {
        return nombreVisible;
    }
}
