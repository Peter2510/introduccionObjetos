package src;

import java.util.*;

public class Libro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombreLibro, autor;
        int codigoLibro, menu = 0;
        boolean prestado = true;

        System.out.println("\n");
        System.out.println("Ingreso del libros");

        System.out.print("\nIngrese el nombre del libro: ");
        nombreLibro = scanner.nextLine();

        System.out.print("\nIngrese el autor del libro: ");
        autor = scanner.nextLine();

        System.out.print("\nIngrese el codigo  el libro: ");
        codigoLibro = scanner.nextInt();

        // Creando el objeto libro
        Libro libro = new Libro(nombreLibro, autor, codigoLibro, prestado);

        libro.mostrarDatos(libro.getNombreLibro(), libro.getAutor(), libro.getCodigoLibro(), libro.getPrestado());

        while (menu != 3) {

            System.out.println("\nOpciones Disponibles");
            System.out.println("\n1. Devolver Libro");
            System.out.println("\n2. Prestar Libro");
            System.out.print("Opcion: ");
            menu = scanner.nextInt();
            System.out.println("\n---------------------------");

            if (menu == 1) {

                libro.devolucionLibro();
                libro.mostrarDatos(libro.getNombreLibro(), libro.getAutor(), libro.getCodigoLibro(), libro.getPrestado());

            }
            if (menu == 2) {

                libro.prestamoLibro();

                libro.mostrarDatos(libro.getNombreLibro(), libro.getAutor(), libro.getCodigoLibro(), libro.getPrestado());

            }

            if (menu == 3) {

                System.out.println("Vuelve pronto");

            }
        }

    }

    //variables
    private String nombreLibro, autor;
    private int codigoLibro;
    private boolean prestado;

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

        setPrestado(false);

    }

    //calcular el perimetro 
    private void devolucionLibro() {

        setPrestado(true);

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

    private void mostrarDatos(String nombreL, String nombreA, int codigo, boolean prestamo) {

        System.out.println("\nNombre del Libro: " + nombreLibro + " Autor del libro: " + nombreA + " Codigo del libro: " + codigo + " Disponible: " + prestamo);

    }

}