package claseAbstracta;

import Herencia.*;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Cuadrilatero extends Poligono{
    private float a, b, base, altura;
    private int alpha, beta;
    
    /**
     * Constructor del cuadrilatero que hereda del poligono
     * @param a es de tipo float y contiene un lado del cuadrilatero
     * @param b es de tipo float y contiene otro lado del cuadrilatero
     * @param base es de tipo float y contiene el valor de la base del cuadrilatero
     * @param altura es de tipo float y contiene el valor de la altura del cuadrilatero
     * @param alpha es de tipo float y contiene el angulo alpha del cuadrilatero
     * @param beta es de tipo float y contiene el angulo beta del cuadrilatero
     */
    public Cuadrilatero(float a, float b, float base, float altura, int alpha, int beta) {
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
    }
    /**
     * Constructor vacio de un cuadrilatero
     */
    public Cuadrilatero() {
    }

    /**
     * Metodo getA del cuadrilatero
     * @return Obtiene el atributo del lado a del cuadrilatero
     */
    public float getA() {
        return a;
    }
    /**
     * Metodo setA del cuadrilatero
     * @param a Asigna un valor al lado a del cuadrilatero
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Metodo getB del cuadrilatero 
     * @return Obtiene el atributo del lado b del cuadrilatero
     */
    public float getB() {
        return b;
    }
    /**
     * Metodo setB del cuadrilatero
     * @param b Asigna un valor al lado b del cuadrilatero
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Metodo getBase del cuadrilatero
     * @return Obtiene el atributo de la base del cuadrilatero
     */
    public float getBase() {
        return base;
    }
    /**
     * Metodo setBase del cuadrilatero
     * @param base Establece un valor de base al cuadrilatero
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Metodo getAltura del cuadrilatero
     * @return Obtiene el atributo de la altura del cuadrilatero
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Metodo setAltura del cuadrilatero
     * @param altura Establece un valor de altura al cuadrilatero
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Metodo getAlpha del cuadrilatero
     * @return Obtiene el angulo alpha del cuadrilatero
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * Metodo set Alpha del cuadrilatero
     * @param alpha Establece el angulo alpha al cuadrilatero
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * Metodo getBeta del cuadrilatero
     * @return Obtiene el angulo beta del cuadrilatero
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Metodo setBeta del cuadrilatero
     * @param beta Estableces el angulo beta al cuadrilatero
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Metodo toString del cuadrilatero
     * @return Imprime en la consola los atributos del cuadrilatero en funcion de los atributos dados
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + '}';
    }
    /**
     * Metodo area del cuadrilatero
     * @return Devuelve el area del cuadrilatero al multiplicar su base por su altura
     */
    @Override
    public float area(){
        return base*altura;
    }
    /**
     * Metodo perimetro del cuadrilatero
     * @return Devuelve el perimetro del cuadrilatero al sumar dos veces el lado a mas dos veces el lado b
     */
    @Override
    public float perimetro(){
        return 2*a + 2*b;
    } 
}
