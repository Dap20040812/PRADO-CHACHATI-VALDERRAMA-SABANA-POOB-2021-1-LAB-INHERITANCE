/**
 * Represents a Course. <br><br>
 * Invariants:
 * 1. MAXIMUM_QUOTA > 0
 * 2. MAXIMUM_QUOTA >= number of registered students. <br><br>
 *
 */
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

    /**
     * Calcula el diametro de un ciruclo de un radio definido por radius
     * @return double diametro del circulo
     */
    public double getDiameter() {
        if(this.radius > 0) {
            return 2 * this.radius;
        }
        return 0;
    }

    /**
     * Calcula el area de un ciruclo de un radio definido por radius
     * @return double A = Area del circulo
     */
    @Override
    public double getArea() {
        double A=0;
        if(this.radius > 0)
        {
            A = PI*Math.pow(this.radius,2);
        }
        return A;
    }

    /**
     * Calcula el perimetro de un ciruclo de un radio definido por radius
     * @return double P = perimetro del circulo
     */
    @Override
    public double getPerimeter() {

        double P=0;
        if(this.radius > 0) {
            P = 2 * PI * this.radius;
        }
        return P;
    }

    /**
     * Sobreescribe el metodo toString de la clase Shape agregando el radio del circulo
     *
     * @return Si el radio existe devuelve las caracteristicas del circulo,
     * si el radio no existe regresa que el circulo del radio dado no existe
     *
     */
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
