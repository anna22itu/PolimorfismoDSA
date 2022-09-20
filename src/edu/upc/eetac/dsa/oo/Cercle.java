package edu.upc.eetac.dsa.oo;

import java.lang.Math;

public class Cercle extends Figura {
    double r;

    public Cercle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * (r * r);
    }
}
