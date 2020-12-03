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
public class Practica8 {
    /**
     * @param args argumentos de linea del programa
     */
    public static void main(String[] args) {
        /**
         * creamos un poligono
         */
        Poligono pol = new Poligono();
        
        /**
         * Las clases pueden comportarse como sus subclases
         */
        Object obtj = pol;
        System.out.println("Poligono: "+pol);
        /**
         * creamos un nuevo objeto
         */
        Object objeto = new Object();
        System.out.println("Objeto: "+objeto);
        /**
         * creamos un nuevo objeto como poligono
         */
        obtj = pol;
        System.out.println("objeto como Poligono: "+obtj);
        System.out.println("2::::::::::::::::::::::::::::::");
        /**
         * creamos un poligono de tipo triangulo
         */
        pol = new Triangulo();
        System.out.println(pol);
        selectorPoligonos(pol);
        /**
         * creamos un poligono de tipo cuadrilatero
         */
        pol = new Cuadrilatero();
        System.out.println(pol);
        selectorPoligonos(pol);
        /**
         * creamos un poligono en seco
         */
        pol = new Poligono();
        System.out.println(pol);
        selectorPoligonos(pol);
    }
    /**
     * Metodo que nos permite diferenciar de un poligono de otro
     * @param pol Recibe como parametro el objeto creado por el usuario y lo evalua para saber que tipo de poligono es
     */
    public static void selectorPoligonos(Poligono pol){
        if(pol instanceof Triangulo){
            System.out.println("soy triangulo");
        }else if(pol instanceof Cuadrilatero){
            System.out.println("soy cuadrilatero");
        }else if(pol instanceof Poligono){
            System.out.println("soy poligono");
        }else{
            System.out.println("soy otra fig");
        }
    }
}
