package interfaz;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Flauta extends InstrumentoViento{
    /**
     * Metodo tipoInstrumento del tipo instrumento de viento
     * @return Regresa una impresion en consola de que el tipo de instrumento es una Flauta
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
    /**
     * Metodo toString del tipo de instrumento de viento
     * @return Imprime en consola la informacion de la Flauta
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
}
