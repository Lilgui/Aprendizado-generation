package JavaDay4;

import java.util.*;

public class Ex2Arrays {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int i,impar=0, somaP=0;
		int[] num = new int[6];
		
		for(i=0;i<6;i++)
		{
			System.out.println("Entre com um n�mero: ");
			num[i] = ler.nextInt();
			
			if(num[i]%2==0)
			{
				somaP = somaP + num[i];
			}
			else
			{
				impar++;
			}			
		}
		for(i=0;i<6;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println("os n�meros pares s�o: " + num[i]);
			}
			else
			{
			System.out.println("Total de n�meros �mpares s�o: " + num[i]);
			}
		}
		System.out.println("Total de n�meros �mpares: " + impar);
		System.out.println("Soma de n�meros pares �: " + somaP);
		
	}
}
