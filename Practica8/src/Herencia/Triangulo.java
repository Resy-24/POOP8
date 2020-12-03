/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *Programacion Orientada a Objetos Gpo.1
 * Juan Manuel Peralta Rodríguez
 * Reséndiz Cruz Rodrigo Daniel
 */
public class Triangulo extends Poligono{
    private float a, b, c, base, altura;
    private int alpha, beta, gamma;
    /**
     * Constructor del triangulo que hereda del poligono
     * @param a es de tipo float y contiene un primer lado del triangulo
     * @param b es de tipo float y contiene un segundo lado del triangulo
     * @param c es de tipo float y contiene un tercer lado del triangulo
     * @param base es de tipo float y contiene el valor de la base del triangulo
     * @param altura es de tipo float y contiene el valor de la altura del triangulo
     * @param alpha es de tipo float y contiene el angulo alpha del triangulo
     * @param beta es de tipo float y contiene el angulo beta del triangulo
     * @param gamma es de tipo float y contiene el angulo gamma del triangulo
     */
    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int beta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
    }
    /**
     * Constructor vacio del triangulo
     */
    public Triangulo() {
    }
    /**
     * Metodo getA del triangulo
     * @return Obtiene el atributo del lado a del triangulo
     */    
    public float getA() {
        return a;
    }
    /**
     * Metodo setA del triangulo
     * @param a Asigna un valor al lado a del triangulo
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Metodo getB del triangulo 
     * @return Obtiene el atributo del lado b del triangulo
     */
    public float getB() {
        return b;
    }
    /**
     * Metodo setB del triangulo
     * @param b Obtiene el atributo del lado b del triangulo
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     *  Metodo getC del triangulo 
     * @return Obtiene el atributo del lado c del triangulo
     */
    public float getC() {
        return c;
    }
    /**
     * Metodo setC del triangulo
     * @param c Obtiene el atributo del lado c del triangulo
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * Metodo getBase del triangulo
     * @return Obtiene un valor de base del triangulo
     */
    public float getBase() {
        return base;
    }
    /**
     * Metodo setBase del triangulo
     * @param base Establece un valor de base al triangulo
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Metodo getAltura del triangulo
     * @return Obtiene un valor de altura del triangulo
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Metodo setAltura del triangulo
     * @param altura Establece un valor de altura al triangulo
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Metodo getAlpha del triangulo
     * @return Obtiene el angulo alpha del triangulo
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * Metodo setAlpha del triangulo
     * @param alpha Establece el angulo alpha al triangulo
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * Metodo getBeta del triangulo
     * @return Obtiene el angulo alpha del triangulo
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Metodo setBeta del triangulo
     * @param beta Establece el angulo beta al triangulo
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Metodo getGamma del triangulo
     * @return Obtiene el angulo gamma del triangulo
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * Metodo setGamma del triangulo
     * @param gamma Establece el angulo gamma al triangulo
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * Metodo toString del triangulo
     * @return Imprime en la consola los atributos del cuadrilatero en funcion de los atributos dados
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
}
