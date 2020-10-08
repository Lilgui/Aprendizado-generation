package JavaDay2;

import java.util.*;

public class Ex2CondJava {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.printf("Entre com o primeiro número: ");
		num1 = ler.nextInt();
		System.out.printf("Entre com o segundo número: ");
		num2 = ler.nextInt();
		System.out.printf("Entre com o terceiro número: ");
		num3 = ler.nextInt();
		
		if(num1<num2 && num2<num3)
		{
			System.out.printf("A ordem crescente é: " + num1 + num2 + num3);
		}
		else if(num1<num3 && num3<num2)
		{
			System.out.printf("A ordem crescente é: " + num1 + num3 + num2);
		}
		else if(num2<num1 && num1<num3)
		{
			System.out.printf("A ordem crescente é: " + num2 + num1 + num3);
		}
		else if(num2<num3 && num3<num2)
		{
			System.out.printf("A ordem crescente é: " + num2 + num3 + num1);
		}
		else if(num3<num1 && num1<num2)
		{
			System.out.printf("A ordem crescente é: " + num3 + num1 + num2);
		}
		else if(num3<num2 && num2<num1)
		{
			System.out.printf("A ordem crescente é: " + num3 + num2 + num1);
		}
	}
}
