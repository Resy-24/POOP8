package interfaz;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{
    /**
     * Metodo tocar de un instrumento de viento: se encarga de especificar que se esta tocando un instrumento de viento
     */
    @Override
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
    }
    /**
     * Metodo afinar de un instrumento de viento: se encarga de especificar que se esta Afinando un instrumento de viento
     */
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }
    /**
     * Metodo tipoInstrumento del instrumento de viento
     * @return Regresa como impresion en consola un mensaje que especifica que tipo de instrumento es
     */
    @Override
    public String tipoInstrumento(){
        return "intrumento de viento";
    }
    /**
     * Metodo toString para el instrumento de viento
     * @return Imprime en consola la informacion del instrumento invocado
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
