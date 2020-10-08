package JavaDay2;

import java.util.*;

public class Ex3CondJava {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("Informe seu nome: ");
		nome = ler.nextLine();
		System.out.printf("Entre com sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.printf("\nVocê se encontra na categoria infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.printf("\nVocê se encontra na categoria juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.printf("\nVocê se encontra na categoria adulto");
		}
		else
		{
			System.out.printf("\nSem categoria");
		}
	}	
}