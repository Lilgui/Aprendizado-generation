package JavaDay3;

import java.util.*;

public class Ex4Repetição {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, sexo, estado, pessoas=1;
		int  pCalmas=0,pNerv=0,hAgre=0,mNerv=0,pAgre=0,oCalmas=0,pn40=0,pc18=0;

		while(pessoas<=5)
			//O exercíco pedia 150 pessoas, mas fiz com 5 apenas para ver se funcionava //
		{
			System.out.printf("Informe sua idade: ");
			idade = ler.nextInt();
			while(idade<1 || idade>150)
			{
				System.out.println("\nAlternativa inválida");
				System.out.printf("\nInforme sua idade: ");
				idade = ler.nextInt();
			}
			System.out.printf("\nInforme seu sexo: 1- Feminino  2-Masculino  3-Outros ");
			sexo = ler.nextInt();
			while(sexo<1 || sexo>3)
			{
				System.out.println("\nAlternativa inválida");
				System.out.printf("\nInforme seu sexo: 1- Feminino  2-Masculino  3-Outros ");
				sexo = ler.nextInt();
			}
			System.out.printf("\nDigite a opção que você se encaixa: 1-Calma  2-Nervosa  3-Agressiva ");
			estado = ler.nextInt();
			while(estado<1 || estado>3)
			{
				System.out.println("\nAlternativa inválida");
				System.out.printf("\nDigite a opção que você se encaixa: 1-Calma  2-Nervosa  3-Agressiva ");
				estado = ler.nextInt();
			}
			
			if(estado == 1)
			{
				pCalmas++;
			}
			if(sexo == 1 && estado == 2)
			{
				mNerv++;
			}
			if(sexo == 2 && estado == 3)
			{
				hAgre++;
			}
			if(sexo == 3 && estado == 1)
			{
				oCalmas++;
			}
			if(estado == 2 && idade > 40)
			{
				pn40++;
			}
			if(estado == 1 && idade < 18)
			{
				pc18++;
			}
			pessoas++;		
		}
		System.out.println("\nPessoas calmas: " + pCalmas);
		System.out.println("\nMelheres nervosas: " + mNerv);
		System.out.println("\nHomens agressivos: " + hAgre);
		System.out.println("\nOutros calmos: " + oCalmas);
		System.out.println("\nPessoas nervosas acima de 40 anos: " + pn40);
		System.out.println("\nPessoas calmas abaixo de 18 anos: " + pc18);
	}
}
