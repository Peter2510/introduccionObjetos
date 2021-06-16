package src;

import java.util.*;

public class Cuadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lado;

        System.out.println("\n");

        System.out.print("\nIngrese un lado del cuadrado: ");
        lado = scanner.nextInt();

        // Creando el objeto cuadrado
        Cuadrado cuadrado = new Cuadrado(lado);

        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();

        System.out.println("\nEl area del cuadrado de lados de: " + cuadrado.getLados() + " es de: " + cuadrado.getArea() + " unidades, y el perimetro es: " + cuadrado.getPerimetro());

    }

    private int lado, area, perimetro;

    // constructor de la clase

    //construcctor con parametros
    public Cuadrado(int lado) {

        this.lado = lado;

    }

    // calcular el area con el lado ingresado
    public void calcularArea() {

        area = lado * lado;

    }

    //calcular el perimetro con el lado ingresado
    public void calcularPerimetro() {

        perimetro = 4 * (lado);

    }

    //obtener el valor del lado ingresado
    public int getLados() {

        return lado;

    }

    //cambiar el valor del lado ingresado
    public void setLados(int lado) {

        this.lado = lado;

    }

    //obtener el area calculada
    public int getArea() {

        return area;

    }

    //cambiar el area hallada
    public void setArea(int area) {

        this.area = area;

    }

    //cambiar el perimetro
    public int getPerimetro() {

        return perimetro;

    }

    //cambiar le perimetro hallado
    public void setPerimetro(int perimetro) {

        this.perimetro = perimetro;

    }

}