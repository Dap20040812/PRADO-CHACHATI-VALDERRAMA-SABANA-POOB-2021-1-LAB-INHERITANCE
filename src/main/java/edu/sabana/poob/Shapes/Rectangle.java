package edu.sabana.poob.Shapes;

import java.text.DecimalFormat;

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
        if(this.length < 0)
        {
            this.length=this.length*-1;
        }
        if(this.width < 0)
        {
            this.width=this.width*-1;
        }
        return Math.sqrt(Math.pow(this.width,2)+Math.pow(this.length,2));
    }

    @Override
    public double getArea() {
        double A;
        if(this.length < 0)
        {
            this.length=this.length*-1;
        }
        if(this.width < 0)
        {
            this.width=this.width*-1;
        }
        A = this.width*this.length;
        return A;
    }
    @Override
    public double getPerimeter() {

        double P;
        if(this.length < 0)
        {
            this.length=this.length*-1;
        }
        if(this.width < 0)
        {
            this.width=this.width*-1;
        }
        P = 2*width + 2*length;
        return P;
    }

    @Override
    public String toString() {

        DecimalFormat f = new DecimalFormat("#.00");
        if((int)getDiagonal()== getDiagonal())
        {
            return (super.toString()+" and diagonal "+ (int)getDiagonal());
        }
        else
        {
            return (super.toString()+" and diagonal "+ f.format(getDiagonal()));
        }
    }






}
