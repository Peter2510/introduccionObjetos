package src;

import java.util.*;

public class Fraccion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, numero3, numero4;
        
        System.out.println("\n");
        
        System.out.print("\nIngrese el numerador: ");
        numero1 = scanner.nextDouble();

        System.out.print("\nIngrese el denominador: ");
        numero2 = scanner.nextDouble();

        System.out.print("\nIngrese el numerador de la fraccion 2: ");
        numero3 = scanner.nextDouble();

        System.out.print("\nIngrese el denominador de la fraccion 2: ");
        numero4 = scanner.nextDouble();




        // Creando el objeto libro
        Fraccion division = new Fraccion(numero1, numero2, numero3, numero4);

        division.suma();
        division.resta();
        division.multiplicacion();
        division.division();

        System.out.print("\n (" + division.getNumero1() + " / " + division.getNumero2() + ") + ("+ division.getNumero3() + " / " + division.getNumero4()+ ") : " + division.getSuma() + "\n");
        System.out.print("\n (" + division.getNumero1() + " / " + division.getNumero2() + ") -("+ division.getNumero3() + " / " + division.getNumero4()+ ") : " + division.getResta() + "\n");
        System.out.print("\n (" + division.getNumero1() + " / " + division.getNumero2() + ") * ("+ division.getNumero3() + " / " + division.getNumero4()+ ") : " + division.getMultiplicacion() + "\n");
        System.out.print("\n (" + division.getNumero1() + " / " + division.getNumero2() + ") - ("+ division.getNumero3() + " / " + division.getNumero4()+ ") : " + division.getDivision() + "\n");
        
    }

    //variables
    private double numero1, numero2,numero3, numero4, suma, resta, multiplicacion, division;

    // constructor de la clase por defecto
    public Fraccion() {

    }

    //construcctor con parametros
    public Fraccion(Double numero1, Double numero2, Double numero3, Double numero4) {

        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;

    }

    // prestamo
    public void suma() {

        suma =  ((numero1 * numero4) + (numero3 * numero2))/(numero2*numero4);

    }

    //calcular el perimetro 
    public void resta() {

        resta = numero1 - numero2;

    }

    public void multiplicacion(){

        multiplicacion = numero1 * numero2;
    }

    public void division(){
        
        division = numero1 / numero2;
    }

     //obtener el dato de la suma
    public Double getNumero1() {

        return numero1;

    }

    //cambiar el resulado de la suma
    public void setNumero1(Double numero1) {

        this.numero1 = numero1;

    }

     //obtener el dato de la suma
    public Double getNumero2() {

        return numero2;

    }

    //cambiar el resulado de la suma
    public void setNumero2(Double numero2) {

        this.numero2= numero2;

    }

     public Double getNumero3() {

        return numero3;

    }

    //cambiar el resulado de la suma
    public void setNumero3(Double numero3) {

        this.numero3 = numero3;

    }

     public Double getNumero4() {

        return numero4;

    }

    //cambiar el resulado de la suma
    public void setNumero4(Double numero4) {

        this.numero4 = numero4;

    }



    //obtener el dato de la suma
    public Double getSuma() {

        return suma;

    }

    //cambiar el resulado de la suma
    public void setSuma(Double suma) {

        this.suma = suma;

    }

    public Double getResta() {

        return resta;

    }

    //cambiar el resulado de la suma
    public void setResta(Double resta) {

        this.resta = resta;

    }

    public Double getMultiplicacion() {

        return multiplicacion;

    }

    //cambiar el resulado de la suma
    public void setMultiplicacion(Double multiplicacion) {

        this.multiplicacion = multiplicacion;

    }

    public Double getDivision() {

        return division;

    }

    //cambiar el resulado de la suma
    public void setDivision(Double division) {

        this.division = division;

    }
    

}