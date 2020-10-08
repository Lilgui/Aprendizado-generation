package JavaDay3;

import java.util.*;
import java.lang.*;

public class Ex3Repetição {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade,pesJovens=0,pesVividas=0;
		System.out.printf("Informe sua idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				pesJovens++;
			}
			else if(idade>50)
			{
				pesVividas++;
			}
			System.out.printf("Informe sua idade: ");
			idade = ler.nextInt();	
		}
		System.out.printf("Total de pessoas com menos de 21 anos: " + pesJovens + ".Total de pessoas com mais de 50 anos: " + pesVividas);
	}	
}
