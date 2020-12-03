package claseAbstracta;
/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public abstract class Poligono {
    /**
     * Metodo area del poligono
     * @return Regresa el area del poligono, el resultado depende de que poligono es
     */
    public abstract float area();
    /**
     * Metodo perimetro del poligono
     * @return Regresa el perimetro del poligono, el resultado depende de que poligono es
     */
    public abstract float perimetro();
    /**
     * Metodo to String del poligono
     * @return Imprime en consola la informacion del poligono
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
