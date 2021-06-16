package src;

public class Principal{


	public static void main(String[] args) {
		
		
		System.out.println("\nEjecutando el ejercicio Contador");
		//Objeto contador1 incializado en cero
		Contador contador1 = new Contador(0);
		//Objeto contador 2 es copia de contador1
		Contador contador2 = contador1;
		System.out.println("\nValor contador: " + contador1.getContador());
		contador2.aumentarContador();
		System.out.println("Valor contador: " + contador1.getContador());
		contador2.aumentarContador();
		System.out.println("Valor contador: " + contador1.getContador());
		contador2.decrementarContador();
		System.out.println("Valor contador: " + contador1.getContador());
		contador2.decrementarContador();
		System.out.println("Valor contador: " + contador1.getContador());
		System.out.println("\nTermino la ejecucion del ejercicio Contador");



	}




}