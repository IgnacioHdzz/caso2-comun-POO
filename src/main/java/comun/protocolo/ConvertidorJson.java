package comun.protocolo;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Convierte un Mensaje en una línea de texto JSON y viceversa.
 * Formato: { "type": "MOVE_ANIMALS", "payload": { ...datos... } }
 */
public class ConvertidorJson {

    private static final String CAMPO_TIPO = "type";
    private static final String CAMPO_DATOS = "payload";

    private final Gson gson;

    public ConvertidorJson() {
        this.gson = new Gson();
    }

    public String aJson(Mensaje pMensaje) {
        JsonObject sobre = new JsonObject();
        sobre.addProperty(CAMPO_TIPO, pMensaje.getTipo().name());  // EL .name() devuelve el nombre del enum en forma de texto.
        sobre.add(CAMPO_DATOS, gson.toJsonTree(pMensaje.getDatos())); 
        return sobre.toString();
    }

    public Mensaje desdeJson(String pLinea) throws MensajeInvalidoException {
        try {
            JsonObject sobre = JsonParser.parseString(pLinea).getAsJsonObject();
            if (!sobre.has(CAMPO_TIPO) || !sobre.has(CAMPO_DATOS)) {    // Valida que tenga los campos que esperamos
                throw new MensajeInvalidoException(pLinea, null);
            }
            TipoMensaje tipo = TipoMensaje.valueOf(sobre.get(CAMPO_TIPO).getAsString());
            JsonElement contenido = sobre.get(CAMPO_DATOS);
            Object datos = gson.fromJson(contenido, tipo.getClaseDatos());
            return new Mensaje(tipo, datos);
        } catch (RuntimeException e) {
            // Gson y valueOf avisan cada problema con una excepción distinta, pero aquí
            // todas significan lo mismo: el texto no es un mensaje válido.
            throw new MensajeInvalidoException(pLinea, e);
        }
    }
}