package interfaz;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Practica83 {
    public static void main(String[] args) {
        /**
         * creamos un instrumento
         */
        InstrumentoMusical instrumento;
        /**
         * Especificamos que ese instrumento es una Flauta
         */
        instrumento = new Flauta();
        /**
         * invocamos al metodo tocar para la flauta creada
         */
        instrumento.tocar();
        /**
         * invocamos al metodo afinar para la flauta creada
         */
        instrumento.afinar();
        /**
         * imprimimos el tipo de instrumento que es
         */
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);
    }
}
