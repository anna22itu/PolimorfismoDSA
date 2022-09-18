public class Triangle extends Figura{
    double h;
    double b;

    public Triangle (double h, double b){
        this.h = h;
        this.b=b;
    }
    public double area(){
        return (h*b)/2;
    }
}
