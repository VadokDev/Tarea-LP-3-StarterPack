package tarea3;
import java.util.*;

/*
* 
*	Clase Juego
* 
*/

public class Juego {
	
	/******** Metodo: Suma_Enteros ********************
	Descripcion: suma dos enteros positivos
	Parametros:
	n1 entero
	n2 entero
	Retorno: resultado de la operacion aritmetica de la suma entero
	************************************************/

	public static void main(String[] args) {
		
		System.out.println("-------------------- Simulador de Niveles --------------------");
		System.out.println("Niveles cargados:\n");

		System.out.println("1. Te la creíste");
		System.out.println("2. we\n");
		
		System.out.println("1. Crear Nivel");
		System.out.println("2. Simular avance en Nivel");
		System.out.println("3. Consultar información de Nivel");
		System.out.println("4. Salir\n");

		System.out.println("Ingresar Opción: ");

		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();

		System.out.println("Opcion "+opcion);
	}

}

