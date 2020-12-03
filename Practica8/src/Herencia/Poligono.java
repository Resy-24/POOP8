package Herencia;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Poligono {
    /**
     * Consturctor de un Poligono que heredara en Cuadrilatero y Trangulo
     */
    public Poligono() {
    }
    /**
     * Metodo area del poligono
     * @return retorna un valor de area especificado, en este caso es 0 en valor flotante
     */
    public float area(){
       return 0f; 
    }
    /**
     * Metodo area del poligono
     * @return retorna un valor de perimetro especificado, en este caso es 0 en valor flotante
     */
    public float perimetro(){
        return 0f;
    }
    /**
     * Metodo toString
     * @return Imprime en la consola los atributos del poligono creado
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
