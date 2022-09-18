
// Se nos define la clase Figura como abstracta y que implementa a la interficie Comparable
public abstract class Figura implements Comparable{ // La clase es abstracta xq el método es abstracto
    public abstract double area(); // el método es abstract: ahora no lo implementamos solo lo definimos: devuelve un double

    public int compareTo (Figura f){
        return Double.compareTo(this.area(),f.area());
    }
}
