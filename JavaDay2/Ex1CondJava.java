package JavaDay2;

import java.util.*;

public class Ex1CondJava {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.printf("\nEntre com primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.printf("\nEntre com o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.printf("\nEntre com o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.printf("\nO maior n�mero �: " + num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.printf("\nO maior n�mero �: " + num2);
		}
		else if(num3>num1 && num3>num2)
		{
			System.out.printf("\nO maior n�mero �: " + num3);
		}
		else
		{
			System.out.printf("N�o h� um maior");
		}
	}
}
