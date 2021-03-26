 # Parte 1
 ## Documentación
 ## Shape
 Esta clase representa una figura

 * toString(): Sobreescribe el metodo toString y plantea una platialla para imprimir las caracteristicas de una figura
            - return String caracteristicas de la la figura  clase-color
 ## Circle
 La clase Circle es una clase que hereda de la clase Shape, y representa el objeto de un circulo.
 Invariantes:
 * 1. PI = 3.14.....
 * 2. radius > 0

 * getArea():  Calcula el area de un ciruclo de un radio definido por radius
               - return double A = Area del circulo

 * getPerimeter(): Calcula el perimetro de un ciruclo de un radio definido por radius
                   return double P = perimetro del circulo

 * toString(): Sobreescribe el metodo toString de la clase Shape agregando el radio del circulo
               return Si el radio existe devuelve las caracteristicas del circulo, si el radio no existe regresa que el circulo del radio dado no existe

 * getDiameter(): Calcula el diametro de un ciruclo de un radio definido por radius
                   return double diametro del circulo
 ## Evidencia Pruebas

 ![](img/EVIP!.png)


 # Parte 2

 ## Triangle
 ## Documentación
 La clase Triangle es una clase que hereda de la clase Shape, y representa el objeto de un triangle.

 * isIsoceles(): Verifica que un triangulo se isosceles - return True si el triangulo es isosceles False si no es isosceles

 * isEquilateral(): Verifica que un triangulo se equilatero - return True si el triangulo es equilatero False si no es equilatero

 * getArea(): Calcula el area de un triangulo de lados definidos - return double A = Area del circulo si el triangulo existe, si los lados del triangulo forman un triangulo que no existe devuelve 0.

 * getPerimeter(): Calcula el perimetro de un triangulo de lados definidos - return double P = Perimetro del circulo si el triangulo existe, si los lados del triangulo forman un triangulo que no existe devuelve 0.

 * toString(): Sobreescribe el metodo toString de la clase Shape agregando el tipo de triangulo - return Si el triangulo existe devuelve las caracteristicas , si el triangulo no existe regresa que el triangulo con la dimenciones dadas no existe

 ## Evidencia pruebas

 ![](img/EVIP2.png)

 ## Rectangle & Square
 ## Documentación

 La clase Rectangle es una clase que hereda de la clase Shape y representa un rectangulo.
 La clase Square es una clase que hereda de Rectangle y representa un cuadrado.

 * getDiagonal(): Calcula la diagonal de un rectangulo o cuadrado, dado de su ancho y largo definidos - return double La diagonas de un rectangulo o cuadrado

 * getArea(): Calcula el area de un rectangulo o cuadrado, dado de su ancho y largo definidos - return double El area de un rectangulo o cuadrado

* getPerimeter(): Calcula el perimetro de un rectangulo o cuadrado, dado de su ancho y largo definidos - -return double El Perimetro de un rectangulo o cuadrado

* toString(): Sobreescribe el metodo toString de la clase Shape agregando la diagonal de un triangulo o cuadrado - return  Las caracteristicas del rectangulo o cuadrado.

 ## Evidencia pruebas

 ![](img/EVIP3.png)

  ## Parte 3

 ![](img/shapes-class-diagram-1.svg)

  ## Parte 4

  ## UML

  ![](img/sabanapayroll-class-diagram-2.svg)

  ## Diagramas de secuencia

  ### calculateEmployeeSalary

  ![](img/calculateEmployeeSalary.svg)

  ### calculateDepartmentSalaries

  ![](img/calculateDepartmentSalaries.svg)

  ### printPayroll

  ![](img/printPayroll.svg)

  ### calculateUniversitySalaries

  ![](img/calculateUniversitySalaries.svg)

  ## Documentación

  
  ## Evidencia pruebas

  ![](img/EVIP4.png)
