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

    private int nombreLibro, autor, codigoLibro, prestado;

    

    

    // constructor de la clase por defecto
    public Libro() {

    }


    //construcctor con parametros
    public Libro(String nombreLibro, String autor, int codigoLibro, boolean prestado) {

        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.codigoLibro = codigoLibro;
        this.prestado = prestado;

    }


    // prestamo
    private void prestamoLibro() {

        prestado = true;

    }

    //calcular el perimetro 
    private void devolucionLibro() {

        prestado = false;

    }

    public void mostrarDatos(String nombreLibro, String autor, int codigoLibro, boolean prestado){

        System.out.println("El libro " + )

    }

    //obtener el nombre del libro
    public String getNombreLibro() {

        return nombreLibro;

    }

    //cambiar el nombre del libro
    public void setNombreLibro(String nombreLibro) {

        this.nombreLibro = nombreLibro;

    }

    //obtener el autor del libro 
    public String getAutor() {

        return autor;

    }

    //cambiar el nombre del autor
    public void setAutor(String autor) {

        this.autor = autor;

    }

    //obtener el codigo del libro
    public int getCodigoLibro() {

        return codigoLibro;

    }

    //cambiar el area hallada
    public void setCodigoLibro(int codigoLibro) {

        this.codigoLibro = codigoLibro;

    }

    //obtener el perimetro
    public boolean getPrestado() {

        return prestado;

    }

    //cambiar le perimetro hallado
    public void setPrestado(boolean prestado) {

        this.prestado = prestado;

    }

       

   

}