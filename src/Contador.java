package src;

import java.util.*;

public class Contador {

    public static void main(String[] args) {

        Contador contador = new Contador();
        Contador contador1 = new Contador(contador);

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("\n");
        System.out.print("\nEl contador inicia en 0");

        do {

        System.out.print("\n");


            contador.mostrarValor();
            contador.mostrarmenu();

            opcion = scanner.nextInt();

            if (opcion == 1) {

                contador.aumentarContador();

            }

            if (opcion == 2) {

                contador.decrementarContador();

            }

        } while (opcion != 3);
        {
            System.out.println("Hasta pronto");
        }

    }

    private int contadorVariable;
    

    // construcor vacio
    public Contador() {

    }

    public Contador(Contador contador) {

        this.contadorVariable = contadorVariable;

    }

    //construcctor con parametros
    public Contador(int contador) {

        this.contadorVariable = contador;

    }

    public void mostrarmenu(){


            System.out.println("\nSelecciona una opcion");
            System.out.println("\n1. Aumentar contador");
            System.out.println("\n2. Decrementar contador");
            System.out.println("\n3. Salir");
            System.out.print("\nSelecciona una opcion: ");




    }

    public void aumentarContador() {

        contadorVariable++;
        setContador(contadorVariable);

    }

    public void decrementarContador() {

        contadorVariable--;

        setContador(contadorVariable);
    }

    public int getContador() {

        return contadorVariable;

    }

    public void setContador(int contador) {

        this.contadorVariable = contador;

    }

    public void mostrarValor() {

        

        System.out.println("----------------------------------------------");

        System.out.println("\nValor actual del contador: " + getContador());

    }

   
}
