package edu.sabana.poob.Shapes;

public class Triangle extends Shape {

    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    public Triangle (){}
    public Triangle (String color)
    {
        super(color);
    }
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    public Triangle(String color,double side1, double side2, double side3)
    {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public boolean isIsoceles()
    {
        boolean is = false;
        if((side1 == side2 && side2 != side3) || (side1 == side3 && side3 != side2) || (side2 == side3 && side3 != side1))
        {
            is = true;
        }
        return is;
    }

    public boolean isEquilatera()
    {
        boolean is = false;
        if(side1 == side2 && side2 == side3)
        {
            is = true;
        }
        return is;
    }
    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        double a= 0;
        if(side1+side2> side3 && side1-side2<side3 ) {
            a = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }
        return a;

    }
    @Override
    public double getPerimeter() {

        double b =0;
        if(side1+side2> side3 && side1-side2<side3 )
        {
            b = side1+side2+side3;
        }
        return b;
    }

    @Override
    public String toString() {
        if(side1+side2> side3 && side1-side2<side3 )
        {
            return (super.toString() + (isEquilatera() ? " and is an equilateral triangle" : isIsoceles() ? " and is an isosceles triangle" : " and is an scalene triangle" ));

        }
        else
        {
            return "The triangle with the dimensions " +side1+" "+side2+" "+side3+" doesn't exist";

        }
    }

}
