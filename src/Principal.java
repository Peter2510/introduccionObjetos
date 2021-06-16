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
		//calcular el perimetro con lado de 5 unidades
		cuadrado1.calcularPerimetro();
		//mostrar el area y perimetro del cuadrado con lado de 5 unidades
		System.out.println("lado = 5");
		System.out.println("El area del cuadrado es de: " + cuadrado1.getArea());
		System.out.println("El perimetro del cuadrado es de: " + cuadrado1.getPerimetro());
		//Cambiar el lado del cuadrado a 2 unidades
		cuadrado2.setLados(2);
		//Calcular el area del cuadrado de 2 unidades
		cuadrado1.calcularArea();
		//Calcular el perimetro del cuadrado de 2 unidades
		cuadrado1.calcularPerimetro();
		//mostrar el area y perimetro del cuadrado con lado de 2 unidades
		System.out.println("lado = 2");
		System.out.println("El area del cuadrado es de: "  + cuadrado1.getArea());
		System.out.println("El perimetro del cuadrado es de: "  + cuadrado1.getPerimetro());
		System.out.println("\nTermino la ejecucion del ejercicio Cuadrado");

		System.out.println("-----------------------------------");
		System.out.println("\nEjecutando el ejercicio Circulo \n");
		//Objeto circulo1 creado, radio de 1 unidadd
		Circulo circulo1 = new Circulo(2.5);
		//Objeto ciruculo2 creado, copia de circulo1
		Circulo circulo2 = circulo1;
		//calcular el area del circulo de 2.5 unidad de radio
		circulo1.calcularArea();
		//calcular el perimetro con radio de 2.5 unidad
		circulo1.calcularPerimetro();
		//mostrar el area y perimetro del circulo radio de 1 unidades
		System.out.println("radio = 2.5");
		System.out.println("El area del circulo es de: " + circulo1.getArea());
		System.out.println("El perimetro del circulo es de: " + cuadrado1.getPerimetro());
		//Cambiar el radio  del circulo a 5 unidades
		circulo2.setRadio(5.0);
		//Calcular el area del circulo de 5 unidades de radio
		circulo1.calcularArea();
		//Calcular el perimetro del circulo de 5 unidades de radio
		circulo1.calcularPerimetro();
		//mostrar el area y perimetro del circulo de 5 unidades de radio
		System.out.println("radio = 5");
		System.out.println("El area del circulo es de: "  + circulo1.getArea());
		System.out.println("El perimetro del cuadrado es de: "  + circulo1.getPerimetro());
		System.out.println("\nTermino la ejecucion del ejercicio Circulo");

		System.out.println("-----------------------------------");
		System.out.println("\nEjecutando el ejercicio Rectangulo \n");
		//Objeto rectangulo1 creado, ancho
		Rectangulo rectangulo1 = new Rectangulo(12,3);
		//Objeto ciruculo2 creado, copia de rectangulo1
		Rectangulo rectangulo2 = rectangulo1;
		//calcular el area del rectangulo de 12 unidad de ancho y 3 de largo
		rectangulo1.calcularArea();
		//calcular el perimetro del rectangulo de 12 unidad de ancho y 3 de largo
		rectangulo1.calcularPerimetro();
		//mostrar el perimetro y el radio del rectangulo de 12 unidad de ancho y 3 de largo
		System.out.println("ancho = 12 , largo = 3");
		System.out.println("El area del rectangulo es de: " + rectangulo1.getArea());
		System.out.println("El perimetro del rectangulo es de: " + rectangulo1.getPerimetro());
		//Cambiar el ancho a 8 
		rectangulo2.setAncho(8);
		//cambiar el largo a 20
		rectangulo2.setLargo(20);
		//calcular el area del rectangulo de 8 unidad de ancho y 20 de largo
		rectangulo1.calcularArea();
		//calcular el perimetro del rectangulo de 8 unidad de ancho y 20 de largo
		rectangulo1.calcularPerimetro();
		//mostrar el perimetro y el radio del rectangulo de 12 unidad de ancho y 3 de largo
		System.out.println("ancho = 8 , largo = 20");
		System.out.println("El area del rectangulo es de: " + rectangulo1.getArea());
		System.out.println("El perimetro del rectangulo es de: " + rectangulo1.getPerimetro());
		System.out.println("\nTermino la ejecucion del ejercicio Rectangulo");


		System.out.println("-----------------------------------");
		System.out.println("\nEjecutando el ejercicio Libro \n");
		//Objeto libro creado
		Libro libro1 = new Libro("Historia de un pepe", "Autor 1", 5418, true);
		//Objeto libro2 creado
		Libro libro2 = libro1;
		//Datos iniciales del libro
		System.out.println("Nombre del libro: " + libro1.getNombreLibro());
		System.out.println("Nombre del autor: " + libro1.getAutor());
		System.out.println("Codigo del libro: " + libro1.getCodigoLibro());
		System.out.println("Disponible: " + libro1.getPrestado());
		//Cambiando datos
		System.out.println("\n*** Cambiando datos ***\n");
		libro2.setNombreLibro("El año en que Lucia dejo de soñar");
		libro2.setAutor("Autor desconocido");
		libro2.setCodigoLibro(45);
		libro2.setPrestado(false);
		//Imprimiendo nuevos valores
		System.out.println("Nombre del libro: " + libro1.getNombreLibro());
		System.out.println("Nombre del autor: " + libro1.getAutor());
		System.out.println("Codigo del libro: " + libro1.getCodigoLibro());
		System.out.println("Disponible: " + libro1.getPrestado());
		System.out.println("\nTermino la ejecucion del ejercicio Rectangulo");


		System.out.println("-----------------------------------");
		System.out.println("\nEjecutando el ejercicio Fraccion \n");
		//Objeto fraccion creado
		Fraccion fraccion1 = new Fraccion(3.0, 4.0, 2.0, 5.0);
		//Objeto fraccion2 creado
		Fraccion fraccion2 = fraccion1;
		//Datos iniciales de los calculos
		fraccion1.suma();
        fraccion1.resta();
        fraccion1.multiplicacion();
        fraccion1.division();
		System.out.print("\n (" + fraccion1.getNumero1() + " / " + fraccion1.getNumero2() + ") + ("+ fraccion1.getNumero3() + " / " + fraccion1.getNumero4()+ ") : " + fraccion1.getSuma() + "\n");
        System.out.print("\n (" + fraccion1.getNumero1() + " / " + fraccion1.getNumero2() + ") -("+ fraccion1.getNumero3() + " / " + fraccion1.getNumero4()+ ") : " + fraccion1.getResta() + "\n");
        System.out.print("\n (" + fraccion1.getNumero1() + " / " + fraccion1.getNumero2() + ") * ("+ fraccion1.getNumero3() + " / " + fraccion1.getNumero4()+ ") : " + fraccion1.getMultiplicacion() + "\n");
        System.out.print("\n (" + fraccion1.getNumero1() + " / " + fraccion1.getNumero2() + ") - ("+ fraccion1.getNumero3() + " / " + fraccion1.getNumero4()+ ") : " + fraccion1.getDivision() + "\n");
		//Cambiando datos
		fraccion2.setNumero1(8.0);
		fraccion2.setNumero2(13.0);
		fraccion2.setNumero3(27.0);
		fraccion2.setNumero4(2.0);
		//Imprimiendo nuevos valores
		fraccion1.suma();
        fraccion1.resta();
        fraccion1.multiplicacion();
        fraccion1.division();
        System.out.println("\n Cambio de valores de los numeros");
		System.out.print("\n (" + fraccion1.getNumero1() + " / " + fraccion1.getNumero2() + ") + ("+ fraccion1.getNumero3() + " / " + fraccion1.getNumero4()+ ") : " + fraccion1.getSuma() + "\n");
        System.out.print("\n (" + fraccion1.getNumero1() + " / " + fraccion1.getNumero2() + ") -("+ fraccion1.getNumero3() + " / " + fraccion1.getNumero4()+ ") : " + fraccion1.getResta() + "\n");
        System.out.print("\n (" + fraccion1.getNumero1() + " / " + fraccion1.getNumero2() + ") * ("+ fraccion1.getNumero3() + " / " + fraccion1.getNumero4()+ ") : " + fraccion1.getMultiplicacion() + "\n");
        System.out.print("\n (" + fraccion1.getNumero1() + " / " + fraccion1.getNumero2() + ") - ("+ fraccion1.getNumero3() + " / " + fraccion1.getNumero4()+ ") : " + fraccion1.getDivision() + "\n");
		








	}




}