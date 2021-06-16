package src;

import java.util.*;

public class Rectangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ancho, largo;

        System.out.println("\n");

        System.out.print("\nIngrese el ancho del rectangulo: ");
        ancho = scanner.nextInt();


        System.out.print("\nIngrese el largo del rectangulo: ");
        largo = scanner.nextInt();


        if (lado1==lado2) {

            System.out.println("Ingresa los lados diferentes del rectangulo para continuar");
            
        } 
        
        else{

        // Creando el objeto rectangulo
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        circulo.calcularArea();
        circulo.calcularPerimetro();

        System.out.println("\nEl area del cuadrado de lados de: " + circulo.getRadio() + " es de: " + circulo.getArea() + " unidades, y el perimetro es: " + circulo.getPerimetro());


        }

       

    }

    private Double radio, area, perimetro;

    // constructor de la clase

    //construcctor con parametros
    public Circulo(Double radio) {

        this.radio = radio;

    }

    // calcular el area con el lado ingresado
    public void calcularArea() {

        area = (3.1416) * radio * radio;

    }

    //calcular el perimetro con el lado ingresado
    public void calcularPerimetro() {

        perimetro = 2 *(3.1416) *(radio);

    }

    //obtener el valor del lado ingresado
    public Double getRadio() {

        return radio;

    }

    //cambiar el valor del lado ingresado
    public void setRadio(Double radio) {

        this.radio = radio;

    }

    //obtener el area calculada
    public Double getArea() {

        return area;

    }

    //cambiar el area hallada
    public void setArea(Double area) {

        this.area = area;

    }

    //cambiar el perimetro
    public Double getPerimetro() {

        return perimetro;

    }

    //cambiar le perimetro hallado
    public void setPerimetro(Double perimetro) {

        this.perimetro = perimetro;

    }

}