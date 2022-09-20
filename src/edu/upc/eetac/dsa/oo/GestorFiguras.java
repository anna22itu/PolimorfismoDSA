package edu.upc.eetac.dsa.oo;

import java.util.Arrays;  //Importamos 'Arrays' del paquete util de java ya que trabajaremos con un vector 'Figuras' con diferentes tipos de figuras geométricas (círculo, rectangulo,etc)


// El cálculo de áreas es un Polimorfismo
public class GestorFiguras { // Definimos una clase 'edu.upc.eetac.dsa.oo.GestorFiguras'

    /**
     * Definimos un método que nos calcula y devuelve el área
     * total de todos los elementos del vector edu.upc.eetac.dsa.oo.Figura.
     */
    public static double suma(Figura[] vectorFiguras) {
        double sumaTotal = 0;
        double a;
        for (int i = 0; i < vectorFiguras.length; i++) {
            a = vectorFiguras[i].area();
            sumaTotal = sumaTotal + a;
        }
        return sumaTotal;
    }


    // Creamos un método para ordenar las áreas de nuestro vector (No devuelve nada)
    public static void sort(Figura[] vectorFigures) {
        Arrays.sort(vectorFigures);
    }


    // Creamos el main donde se crea un vector de figuras y se colocan en él.
    public static void main(String[] args) {
        Figura[] vectorFiguras = new Figura[6];
        Figura f = new Rectangle(10, 12);


        vectorFiguras[0] = new Rectangle(5, 10); // le entramos los dos lados
        vectorFiguras[1] = new Cercle(3); // le entramos el radio
        vectorFiguras[2] = new Quadrat(6); // le entramos los dos lados
        vectorFiguras[3] = new Triangle(5, 7); // le entramos la base y altura
        vectorFiguras[4] = new Cercle(7); // le entramos el radio
        vectorFiguras[5] = new Quadrat(8); // le entramos los dos lados

        System.out.println(suma(vectorFiguras));
        for (int i = 0; i < 6; i++) {
            System.out.println(vectorFiguras[i].area());
        }
        System.out.print("\n");
        sort(vectorFiguras);
        for (int i = 0; i < 6; i++) {
            System.out.println(vectorFiguras[i].area());
        }


    }

}