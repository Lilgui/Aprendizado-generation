package JavaDay2;

import java.util.*;

public class Ex2CondJava {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.printf("Entre com o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.printf("Entre com o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.printf("Entre com o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1<num2 && num2<num3)
		{
			System.out.printf("A ordem crescente �: " + num1 + num2 + num3);
		}
		else if(num1<num3 && num3<num2)
		{
			System.out.printf("A ordem crescente �: " + num1 + num3 + num2);
		}
		else if(num2<num1 && num1<num3)
		{
			System.out.printf("A ordem crescente �: " + num2 + num1 + num3);
		}
		else if(num2<num3 && num3<num2)
		{
			System.out.printf("A ordem crescente �: " + num2 + num3 + num1);
		}
		else if(num3<num1 && num1<num2)
		{
			System.out.printf("A ordem crescente �: " + num3 + num1 + num2);
		}
		else if(num3<num2 && num2<num1)
		{
			System.out.printf("A ordem crescente �: " + num3 + num2 + num1);
		}
	}
}
