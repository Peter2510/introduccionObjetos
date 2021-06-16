package src;

import java.util.*;

public class Persona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double radio;

        System.out.println("\n");

        System.out.print("\nIngrese el radio del circulo: ");
        radio = scanner.nextDouble();

        // Creando el objeto cuadrado
        Circulo circulo = new Circulo(radio);

        circulo.calcularArea();
        circulo.calcularPerimetro();

        System.out.println("\nEl area del circulo de radio " + circulo.getRadio() + " es de: " + circulo.getArea() + " unidades, y el perimetro es: " + circulo.getPerimetro());

    }

    private String nombre, edad, sexo = "Hombre";
    private int dni,peso altura, resultadoPeso;

    // constructor de la clase

    //construcctor por defecto
    public Persona() {

    }

    //Constructor con parametros nombre, edad y sexo
    public Persona(String nombre, int edad, String sexo) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }

    //Constructor con todos los atributos
    public Persona(String nombre, int edad, String sexo, int altura, int peso, int dni) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.dni = dni;

    }


    // calcular peso ideal
    public void calcularIMC() {

        int pesoIdeal = (peso)/(altura*altura);

        if (pesoIdeal < 20) {

            resultadoPeso = -1;
            
        }

        if (pesoIdeal >= 20 && pesoIdeal <=25) {

            resultadoPeso =0;
            
        }

        if (pesoIdeal>25) {

            resultadoPeso = 1;
            
        }

    

}