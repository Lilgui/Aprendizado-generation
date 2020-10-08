package JavaDay2;

import java.util.*;
import java.math.*;

public class Ex4CondJava {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		double num, raiz, potencia;
		
		System.out.printf("Entre com um número: ");
		num = ler.nextDouble();
		
		if(num%2 == 0)
		{
			raiz = Math.sqrt(num);
			System.out.printf("Este número é par e sua raiz é: %.2f" , raiz);
		}
		else
		{
			potencia = Math.pow(num,2);
			System.out.printf("Este número é ímpar e sua elevação ao quadrado é: " + potencia);
		}		
	}
}