
import java.util.Arrays;  //Importamos 'Arrays' del paquete util de java ya que trabajaremos con un vector 'Figuras' con diferentes tipos de figuras geométricas (círculo, rectangulo,etc)

// El cálculo de áreas es un Polimorfismo
public class GestorFiguras{ // Definimos una clase 'GestorFiguras'

    // Definimos un método que nos calcula y devuelve el área total de todos los elementos del vector Figura.
    public static double suma(Figura[] vectorFiguras) // le entramos el vector de figuras
    {
        double sumaTotal = 0;
        double a;
        for (int i = 0; i<vectorFiguras.length; i++)
        {
            a=vectorFiguras[i].area(); 
            sumaTotal = sumaTotal + a;
        }
        return sumaTotal;
    }


    // Creamos un método para ordenar las áreas de nuestro vector (No devuelve nada)
    public static void sort(double[] vectorArea)
    {
        Arrays.sort(vectorArea);
    }


    // Creamos el main donde se crea un vector de figuras y se colocan en él.
    public static void main(String[] args)
    {
        Figura[] vectorFiguras = new Figura[6];

        vectorFiguras[0] = new Rectangle(5,10); // le entramos los dos lados
        System.out.println(vectorFiguras[0].area());
        vectorFiguras[1] = new Cercle(3); // le entramos el radio
        System.out.println(vectorFiguras[1].area());
        vectorFiguras[2] = new Quadrat(6); // le entramos los dos lados
        System.out.println(vectorFiguras[2].area());
        vectorFiguras[3] = new Triangle(5,7); // le entramos la base y altura
        System.out.println(vectorFiguras[3].area());
        vectorFiguras[4] = new Cercle(7); // le entramos el radio
        System.out.println(vectorFiguras[4].area());
        vectorFiguras[5] = new Quadrat(8); // le entramos los dos lados
        System.out.println(vectorFiguras[5].area());


        //Double[] vectorArea= new Double[6];
        double[] vectorArea;
        vectorArea = new double[6];
        //vectorArea = {vectorFiguras[0].area(),vectorFiguras[1].area(),vectorFiguras[2].area(),vectorFiguras[3].area(),vectorFiguras[4].area(),vectorFiguras[5].area()};
        vectorArea[0] = vectorFiguras[0].area();
        vectorArea[1] = vectorFiguras[1].area();
        vectorArea[2] = vectorFiguras[2].area();
        vectorArea[3] = vectorFiguras[3].area();
        vectorArea[4] = vectorFiguras[4].area();
        vectorArea[5] = vectorFiguras[5].area();

        System.out.println(suma(vectorFiguras));

        System.out.println(Arrays.toString(vectorArea));
        sort(vectorArea);
        System.out.println(Arrays.toString(vectorArea));

    }

}