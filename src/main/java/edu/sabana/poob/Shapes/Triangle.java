package edu.sabana.poob;

public class Triangle extends Shape{

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
        return true;
    }

    public boolean isEquilatera()
    {
        return true;
    }
    @Override
    public double getArea() {
        double A;
        return A;
    }
    @Override
    public double getPerimeter() {

        double P;
        return P;
    }

    @Override
    public String toString() {
        return (super.toString() + (isEquilatera() == true ? " es un triangulo equilatero" :" es un triangulo equilatero" ));
    }

}
