package edu.upc.eetac.dsa.oo;

/**
 * Se nos define la clase edu.upc.eetac.dsa.oo.Figura como abstracta y que implementa a la interficie Comparable
 */
public abstract class Figura implements Comparable<Figura> { // La clase es abstracta xq el método es abstracto

    /**
     * el método es abstract: ahora no lo implementamos
     * solo lo definimos: devuelve un double
     */
    public abstract double area();

    @Override
    public int compareTo(Figura f) {
        return Double.compare(f.area(), this.area());
    }
}

