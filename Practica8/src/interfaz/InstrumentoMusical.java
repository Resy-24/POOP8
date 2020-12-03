package interfaz;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public interface InstrumentoMusical {
    /**
     * Metodo central tocar, este va a cambiar depende del tipo de instrumento
     */
    void tocar();
    /**
     * Metodo central afinar, este va a cambiar depende del tipo de instrumento
     */
    void afinar();
    /**
     * Metodo tipoInstrumento
     * @return Sirve para mostrar el tipo de instrumento hecho
     */
    String tipoInstrumento();
    
}
