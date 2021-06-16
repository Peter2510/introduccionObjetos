package src;

public class Principal{


	public static void main(String[] args) {
		
		
		System.out.println("-----------------------------------");
		System.out.println("\nEjecutando el ejercicio Contador");
		//Objeto contador1 incializado en cero
		Contador contador1 = new Contador(0);
		//Objeto contador 2 es copia de contador1
		Contador contador2 = contador1;
		//VAlor inicial del contador
		System.out.println("\nValor contador: " + contador1.getContador());
		//aumentando el contador
		contador2.aumentarContador();
		//valor del contador
		System.out.println("Valor contador: " + contador1.getContador());
		//aumentando el valor del contador
		contador2.aumentarContador();
		//valor del contador
		System.out.println("Valor contador: " + contador1.getContador());
		//disminuyendo el valor del contador
		contador2.decrementarContador();
		//valor del contador
		System.out.println("Valor contador: " + contador1.getContador());
		//disminuyendo el valor del contador
		contador2.decrementarContador();
		//valor del contador
		System.out.println("Valor contador: " + contador1.getContador());
		System.out.println("\nTermino la ejecucion del ejercicio Contador");


		System.out.println("-----------------------------------");
		System.out.println("\nEjecutando el ejercicio Cuadrado \n");
		//Objeto cuadrado creado, los lados son de 8
		Cuadrado cuadrado1 = new Cuadrado(5);
		//Objeto cuadrado 2 creado, copia cuadrado 1
		Cuadrado cuadrado2 = cuadrado1;
		//calcular el area del cuadrado con lado de 5 unidades
		cuadrado1.calcularArea();
		//calcular el area del pemimetro con lado de 5 unidades
		cuadrado1.calcularPerimetro();
		//mostrar el area y perimetro del cuadrado con lado de 5 unidades
		System.out.println("El area del cuadrado es de: " + cuadrado1.getArea());
		System.out.println("El perimetro del cuadrado es de: " + cuadrado1.getPerimetro());
		//Cambiar el lado del cuadrado a 2 unidades
		cuadrado2.setLados(2);
		//Calcular el area del cuadrado de 2 unidades
		cuadrado1.calcularArea();
		//Calcular el perimetro del cuadrado de 2 unidades
		cuadrado1.calcularPerimetro();
		//mostrar el area y perimetro del cuadrado con lado de 2 unidades
		System.out.println("El area del cuadrado es de: "  + cuadrado2.getArea());
		System.out.println("El perimetro del cuadrado es de: "  + cuadrado2.getPerimetro());
		System.out.println("\nTermino la ejecucion del ejercicio Cuadrado");





	}




}