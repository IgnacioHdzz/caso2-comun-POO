package comun.modelo;

// La bandera de un jugador, situada en su zona inicial.
public class BanderaBase extends ElementoMapa {

    private int idManadaDuena;

    public BanderaBase(int pId, Posicion pPosicion, int pIdZona, int pIdManadaDuena) {
        super(pId, pPosicion, pIdZona);
        this.idManadaDuena = pIdManadaDuena;
    }

    // Copia los datos básicos y la manada dueña de otra bandera.
    public BanderaBase(BanderaBase pOriginal) {
        super(pOriginal);
        this.idManadaDuena = pOriginal.idManadaDuena;
    }

    public int getIdManadaDuena() {
        return idManadaDuena;
    }
}
