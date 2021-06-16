package src;

import java.util.*;

public class Persona {

    public static void main(String[] args) {



    }

    private String nombre, edad, sexo = "Hombre";
    private int dni,peso altura;

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


   

}