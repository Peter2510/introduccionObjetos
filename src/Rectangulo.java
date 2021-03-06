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


        if (ancho==largo) {

            System.out.println("\nIngresa los lados diferentes del rectangulo para continuar");
            
        } 
        
        else{

        // Creando el objeto rectangulo
        Rectangulo rectangulo = new Rectangulo(ancho, largo);
        rectangulo.calcularPerimetro();
        rectangulo.calcularArea();

        System.out.println("\nEl area del rectangulo con largo de " + rectangulo.getLargo() +" unidades y " + rectangulo.getAncho() + " unidades de ancho es de: "+  rectangulo.getArea() + " unidades cuadradas y el perimetro es de " + rectangulo.getPerimetro() + " unidades ");



        }

    }

    private int largo, ancho, perimetro, area;

    // constructor de la clase

    //construcctor con parametros
    public Rectangulo(int ancho, int largo) {

        this.ancho = ancho;
        this.largo = largo;

    }

    // calcular el area 
    public void calcularArea() {

        area = ancho * largo;

    }

    //calcular el perimetro 
    public void calcularPerimetro() {

        perimetro = 2 *(largo) *(ancho);

    }

    //obtener el largo 
    public int getLargo() {

        return largo;

    }

    //cambiar el valor del largo ingresado
    public void setLargo(int largo) {

        this.largo = largo;

    }

    //obtener la altura 
    public int getAncho() {

        return ancho;

    }

    //cambiar el valor de la altura ingresado
    public void setAncho(int ancho) {

        this.ancho = ancho;

    }

    //obtener el area calculada
    public int getArea() {

        return area;

    }

    //cambiar el area hallada
    public void setArea(int area) {

        this.area = area;

    }

    //obtener el perimetro
    public int getPerimetro() {

        return perimetro;

    }

    //cambiar le perimetro hallado
    public void setPerimetro(int perimetro) {

        this.perimetro = perimetro;

    }

       

   

}