package JavaDay3;

import java.util.*;

public class Ex5Repeti��o {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num,soma=0;		
		
		do
		{
			System.out.printf("Entre com um n�mero do teclado: ");
			num = ler.nextInt();
			soma = soma + num;
		}while(num!=0);
		
	System.out.printf("A soma �: %d",soma);	
		
	}
}