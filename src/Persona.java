package src;

import java.util.*;

public class Persona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int altura, edad, peso;
        String nombre, sexo;
        
        System.out.println("\n");

        System.out.print("\nIngresa el nombre de la persona: ");
        nombre = scanner.nextLine();

        System.out.print("\nIngresa la edad de la persona: ");
        edad = scanner.nextInt();

        System.out.println("Ingresa el peso");
        peso = scanner.nextInt();

        System.out.println("Ingrese la altura");
        altura = scanner.nextInt();

        System.out.println("Ingresa f si es mujer o h si es hombre");
        sexo = scanner.nextLine();
        sexo = scanner.nextLine();
        
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

       



         
    }

    private String nombre, sexo;
    private int dni,peso,edad, altura, resultadoPeso;
    public boolean mayorEdad;
    

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
    public Persona(String nombre, int edad, String sexo, int  peso, int altura) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    

    }


    // calcular peso ideal
  /*  public int calcularIMC(int altura, int peso) {

        int pesoIdeal = (peso)/(altura*altura);

        if (pesoIdeal < 20) {

            pesoIdeal = -1;
            return pesoIdeal;
            
        }

        if (pesoIdeal >= 20 && pesoIdeal <=25) {

            resultadoPeso =0;

            return pesoIdeal;
            
        }

        if (pesoIdeal>25) {

            resultadoPeso = 1;
            return pesoIdeal;
            
        }

        public boolean EsMayorDeEdad(int edad){

        if (edad > 18) {

            mayorEdad = true;

            return mayorEdad;
            
        }

        else{

            mayorEdad = false;
            return mayorEdad;
        }

    }

     public char ComprobarSexo(char sexo){


        if (char == m) {

            sexo = mujer;
            return sexo;

            
        }

        else{

            sexo = h;
            return sexo;
        }



    }

    public void generarDni(){

     dni = (int) (Math.random() * (1000000 - 1000000 ) +1 );

     System.out.println("dni");

    } */

    public void mostrarDAtos(Persona persona){

        System.out.println(persona.toString());



    }
    
}