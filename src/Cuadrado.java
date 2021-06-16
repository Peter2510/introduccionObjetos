package src;

import java.util.*;

public class Cuadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creando el objeto cuadrado
        Cuadrado cuadrado = new Cuadrado (int lado);

        System.out.println("\n");

         System.out.print("\nIngrese un lado del cuadrado");

        

    }

    private int lado, area, perimetro;
    

    // constructor de la clase

    //construcctor con parametros
    public Cuadrado(int lado) {

        this.contadorVariable = contador;

    }


    public void calcularArea() {

        area = lado*lado;
    

    }

     public void calcularPerimetro() {

        area = 4*(lado);
    

    }

     public int getLados() {

        return area;

    }

    public void setLados(int lado) {

        this.lado = lado;

    }

   

    public int getArea() {

        return area;

    }

    public void setArea(int area) {

        this.area = area;

    }

     public int getPerimetro() {

        return area;

    }

    public void setPerimetro(int perimetro) {

        this.perimetro = perimetro;

    }

    public void mostrarDatos() {

        

        System.out.println("----------------------------------------------");

        System.out.println("\nEl area del cuadrado de lados de " + lados + " es de: " + getArea() + " unidades, y el perimetro es: " getPerimetro());

    }

   
}
