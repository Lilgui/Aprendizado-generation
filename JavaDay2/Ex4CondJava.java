package JavaDay2;

import java.util.*;
import java.math.*;

public class Ex4CondJava {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		double num, raiz, potencia;
		
		System.out.printf("Entre com um n�mero: ");
		num = ler.nextDouble();
		
		if(num%2 == 0)
		{
			raiz = Math.sqrt(num);
			System.out.printf("Este n�mero � par e sua raiz �: %.2f" , raiz);
		}
		else
		{
			potencia = Math.pow(num,2);
			System.out.printf("Este n�mero � �mpar e sua eleva��o ao quadrado �: " + potencia);
		}		
	}
}