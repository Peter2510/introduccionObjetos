package src;

import java.util.*;

public class Libro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombreLibro, autor;
        int codigoLibro;
        boolean prestado = false;

        System.out.println("\n");

        System.out.print("\nIngrese el nombre del libro: ");
        nombreLibro = scanner.nextLine();

        System.out.print("\nIngrese el autor del libro: ");
        ancho = scanner.nextLine();

        System.out.print("\nIngrese el codigo  el libro: ");
        ancho = scanner.nextInt();


        // Creando el objeto libro
        Libro rectangulo = new Libro(nombreLibro, autor, codigoLibro, prestado);
        
    


    }

    private int largo, ancho, perimetro, area;

    // constructor de la clase

    //construcctor con parametros
    public Rectangulo(int ancho, int largo) {

        this.ancho = ancho;
        this.largo = largo;

    }

    // calcular el area 
    private void calcularArea() {

        area = ancho * largo;

    }

    //calcular el perimetro 
    private void calcularPerimetro() {

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