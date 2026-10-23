package comun.protocolo;

import comun.protocolo.datos.DatosAtacar;
import comun.protocolo.datos.DatosAviso;
import comun.protocolo.datos.DatosCrearPartida;
import comun.protocolo.datos.DatosError;
import comun.protocolo.datos.DatosEstado;
import comun.protocolo.datos.DatosFinJuego;
import comun.protocolo.datos.DatosInicioJuego;
import comun.protocolo.datos.DatosMoverAnimales;
import comun.protocolo.datos.DatosPartidaCreada;
import comun.protocolo.datos.DatosPartidaUnida;
import comun.protocolo.datos.DatosSeleccionEspecies;
import comun.protocolo.datos.DatosSeleccionarEspecie;
import comun.protocolo.datos.DatosUnirsePartida;
import comun.protocolo.datos.DatosVerZona;

// Se necesita importar todos los tipos de mensaje que existen. 
// Cada tipo sabe qué datos lleva, así ConvertidorJson puede reconstruir los datos correctos al recibir.

public enum TipoMensaje {

    // Cliente -> Servidor
    CREATE_MATCH(DatosCrearPartida.class),
    JOIN_MATCH(DatosUnirsePartida.class),
    SELECT_ANIMAL(DatosSeleccionarEspecie.class),
    MOVE_ANIMALS(DatosMoverAnimales.class),
    ATTACK(DatosAtacar.class),
    VIEW_ZONE(DatosVerZona.class),

    // Servidor -> Cliente
    MATCH_CREATED(DatosPartidaCreada.class),
    MATCH_JOINED(DatosPartidaUnida.class),
    ERROR(DatosError.class),
    ANIMAL_SELECTION(DatosSeleccionEspecies.class),
    OPPONENT_LEFT(DatosAviso.class),
    GAME_STARTED(DatosInicioJuego.class),
    STATE_UPDATE(DatosEstado.class),
    GAME_OVER(DatosFinJuego.class);

    private final Class<?> claseDatos;

    TipoMensaje(Class<?> pClaseDatos) {
        this.claseDatos = pClaseDatos;
    }

    public Class<?> getClaseDatos() {
        return claseDatos;
    }
}
