package comun.protocolo;

// Un mensaje del protocolo: su tipo y sus datos
public class Mensaje {

    private final TipoMensaje tipo;
    private final Object datos;

    public Mensaje(TipoMensaje pTipo, Object pDatos) {
        this.tipo = pTipo;
        this.datos = pDatos;
    }

    public TipoMensaje getTipo() {
        return tipo;
    }

    public Object getDatos() {
        return datos;
    }

    // Devuelve los datos ya convertidos a la clase que se pide.
    public <T> T getDatos(Class<T> pClase) {
        return pClase.cast(datos);
    }
}
