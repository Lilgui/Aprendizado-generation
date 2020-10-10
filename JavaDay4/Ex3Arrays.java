package JavaDay4;

import java.util.*;

public class Ex3Arrays {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int maior10=0;
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]",linha+1,coluna+1);
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna]>10)
				{
					maior10++;
				}
			}
			
		}
		System.out.printf("\nA matriz ficou: \n");
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t %d \t",matriz[linha][coluna]);
			}
			System.out.println();
		}	
		System.out.printf("\nA quantidade de valores maiores que 10 é: %d",maior10);
	}
}

