package JavaDay4;

import java.util.*;

public class Ex4Arrays {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double[][] mat = new double[2][2];
		double[][] mat2 = new double[2][2];
		double[][] matSoma = new double[2][2];
		double[][] matSub = new double[2][2];
		int cond=0;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.printf("Entre com um número da matriz mat[%d][%d]: ",i+1,j+1);
				mat[i][j] = ler.nextInt();							
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.printf("Entre com um número da matriz mat2[%d][%d]: ",i+1,j+1);
				mat2[i][j] = ler.nextInt();
			}	
		}
		System.out.println("Selecione a opção desejada:");
		System.out.println("1 - Soma as duas matrizes");
		System.out.println("2 - Subtrai a matriz da segunda");
		System.out.println("3 - adciona uma constante as duas matrizes");
		System.out.println("4 - imprime as matrizes");
		cond = ler.nextInt();

		switch(cond)
		{
		case 1:

			System.out.println("A somas das matrizes mat e mat2 fica da seguinte forma: ");
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matSoma[i][j] = mat[i][j] + mat2[i][j];
					System.out.printf("[" + matSoma[i][j] + "]");
				}
				System.out.println();
			}
			break;
		case 2:
					
			System.out.println("A subtração das matrizes mat e mat2 fica da seguinte forma: ");
		
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					matSub[i][j] = mat2[i][j] - mat[i][j];
					System.out.printf("[" + matSub[i][j] + "]");
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.printf("Constante: ");
			final double constante = ler.nextDouble();
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					mat[i][j] = mat[i][j] + constante;
					System.out.printf("[" + mat[i][j] + "]");
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					mat2[i][j] = mat2[i][j] + constante;
					System.out.printf("[" + mat2[i][j] + "]");
				}				
				System.out.println();				
			}
			break;		
		case 4:
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.printf("[" + mat[i][j] + "]");
				}
				System.out.println();
			}
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.printf("[" + mat2[i][j] + "]");
				}				
				System.out.println();				
			}
			break;
			default:
				System.out.println("Opção inválida");
				break;
		}
	}
}
