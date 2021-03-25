package edu.sabana.poob.Shapes;

public class Rectangle extends Shape {

    public double width = 1;
    public double length = 1;

    public Rectangle(){}

    public Rectangle(String color)
    {
        super(color);
    }
    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, double width, double length)
    {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getDiagonal()
    {
        return Math.sqrt(Math.pow(this.width,2)+Math.pow(this.length,2));
    }

    @Override
    public double getArea() {
        double A;
        A = this.width*this.length;
        return A;
    }
    @Override
    public double getPerimeter() {

        double P;
        P = 2*width + 2*length;
        return P;
    }

    @Override
    public String toString() {

        if((int)getDiagonal()== getDiagonal())
        {
            return (super.toString()+" and diagonal "+ (int)getDiagonal());
        }
        else
        {
            return (super.toString()+" and diagonal "+ getDiagonal());
        }
    }






}
