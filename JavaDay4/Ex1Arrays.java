package JavaDay4;

public class Ex1Arrays {
	public static void main(String args[])
	{
		int[] A = {1,0,5,-2,-2,7};
		int soma = 0;
		
		soma = soma + A[0];
		soma = soma + A[1];
		soma = soma + A[5];
		
		System.out.printf("O valor da soma das posições A[0],A[1] e A[5] é: " + soma);
		A[4] = 100;
		for(int i=0;i<6;i++)
		{
		System.out.println("\nO valor " + i + " do vetor A é: " + A[i]);
		}
	}
}
