package edu.sabana.poob.Shapes;

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
        if(this.radius > 0) {
            return 2 * this.radius;
        }
        return 0;
    }
    @Override
    public double getArea() {
        double A=0;
        if(this.radius > 0)
        {
            A = PI*Math.pow(this.radius,2);
        }
        return A;
    }
    @Override
    public double getPerimeter() {

        double P=0;
        if(this.radius > 0) {
            P = 2 * PI * this.radius;
        }
        return P;
    }

    @Override
    public String toString() {

        if(this.radius <= 0)
        {
            return ("A circle with radius "+(int)this.radius+" doesn't exists");
        }
        else{
            if((int)this.radius==this.radius)
            {
                return (super.toString()+" and radius "+ (int)this.radius);
            }
            else
            {
                return (super.toString()+" and radius "+ this.radius);
            }
        }

    }

}
