package edu.sabana.poob;

public class Circle extends Shape {

    private double radius;
    private final static double PI = Math.PI;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getDiameter() {
        return 2*this.radius;
    }

    @Override
    public double getArea() {
        double A;
        A = PI*Math.pow(this.radius,2);
        return A;
    }
    @Override
    public double getPerimeter() {

        double P;
        P = 2*PI*this.radius;
        return P;
    }

    @Override
    public String toString() {

        if((int)this.radius==this.radius)
        {
            return (super.toString()+" and radius "+ (int)this.radius);
        }
        else
        {
            return (super.toString()+" and radius "+ this.radius);
        }
       /*return (super.toString()+" and radius "+ ( (int)this.radius== this.radius ? (int)this.radius : this.radius ));*/
    }

}
