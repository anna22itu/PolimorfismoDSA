package edu.upc.eetac.dsa.oo;

public class Rectangle extends Figura {
    double c1;
    double c2;

    public Rectangle(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double area() {
        return c1 * c2;
    }
}

