package comun.modelo;

// Lo que el servidor y el cliente conocen de un animal. El servidor la extiende con el comportamiento (moverse, atacar) y el cliente con lo visual (cómo se dibuja).
public class AnimalBase extends ElementoMapa {

    private Especie especie;
    private int energia;
    private int idManada;
    private boolean esBot;

    public AnimalBase(int pId, Posicion pPosicion, int pIdZona, Especie pEspecie,
                      int pEnergia, int pIdManada, boolean pEsBot) {
        super(pId, pPosicion, pIdZona);
        this.especie = pEspecie;
        this.energia = pEnergia;
        this.idManada = pIdManada;
        this.esBot = pEsBot;
    }

    // Copia solo los datos base. Es lo que se envía por la red.
    public AnimalBase(AnimalBase pOriginal) {
        super(pOriginal);
        this.especie = pOriginal.especie;
        this.energia = pOriginal.energia;
        this.idManada = pOriginal.idManada;
        this.esBot = pOriginal.esBot;
    }

    public Especie getEspecie() {
        return especie;
    }

    public int getEnergia() {
        return energia;
    }

    public int getIdManada() {
        return idManada;
    }

    public boolean esBot() {
        return esBot;
    }

    public boolean estaVivo() {
        return energia > 0;
    }

    // Solo las subclases cambian la energía; el servidor protege que no baje de 0.
    protected void setEnergia(int pEnergia) {
        this.energia = pEnergia;
    }
}
