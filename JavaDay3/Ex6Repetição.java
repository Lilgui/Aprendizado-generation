package JavaDay3;

import java.util.*;

public class Ex6Repeti��o {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num,x=0,m3=0;
		double media;
		do 
		{
			System.out.println("Entre com um n�mero: ");
			num = ler.nextInt();
			if(num%3==0)
			{
				m3 = m3 + num;
				x++;
			}
		} while (num>=1); 
		media = m3/x;
		System.out.printf("A m�dia dos n�meros multiplos de 3 �: " + media);
	}
}
