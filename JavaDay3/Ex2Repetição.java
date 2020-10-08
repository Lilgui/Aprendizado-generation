package JavaDay3;

import java.util.Scanner;

public class Ex2Repetição {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int x, pares=0,impar=0, i;
			
		for(i=1;i<=10;i++)
		{
			System.out.printf("Entre com o " + i + " º número: ");
			x = ler.nextInt();
			if(x%2==0)
			{
				pares++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf("A quantidade de pares são: %d",pares);
		System.out.printf("\nA quantidade de ímpares: %d",impar);
	}
}
