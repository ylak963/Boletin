package es.studium.ParImpar;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) 
	{
		int numero = 0;

		System.out.println("Dame un número entero:");
		//Creacion del objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		//Leemos el numero introducido
		numero=teclado.nextInt();

		//Instrucción condicional para demostrar si es par o impar
		if(numero%2==0) 
		{
			System.out.println("Es par");
		}
		else
		{
			System.out.println("Es impar");
		}
		//Cierre del objeto teclado para leer por teclado
		teclado.close();
	}

}
