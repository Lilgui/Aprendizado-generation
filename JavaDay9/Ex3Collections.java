package JavaDay9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Ex3Collections {
	public static void main(String args[])
	{
		int opcao;
		String x;
		
		Collection<String> bolachas = new ArrayList<String>();
		Scanner read = new Scanner(System.in);
		do
		{
		System.out.println("\nSelecione uma opção sobre o estoque de bolachas ");
		System.out.println("[1] Armazenar dados ao estoque" 
				+ "\n[2] Remover dados do estoque"
				+ "\n[3] Atualizar dados do estoque"
				+ "\n[4] Apresentar todos os dados do estoque"
				+ "\n[0] Para encerrar");
		opcao = read.nextInt();
		
		switch(opcao)
		{
		case 1:
			System.out.println("Insira uma bolacha: ");
			x = read.next();
			bolachas.add(x);
			break;
		case 2:
			System.out.println(bolachas);
			System.out.println("Remova uma bolacha da lista: ");
			x = read.next();
			bolachas.remove(x);
			break;
		case 3:
			System.out.println(bolachas);
			System.out.println("Atualize uma bolacha, removendo e colocando outra no local: ");
			String troca = read.next();
			System.out.println("Digite a nova bolacha que ficará no lugar de " + troca + ":");
			String novaBolacha = read.next();
			
			if(bolachas.contains(troca))
			{
				bolachas.remove(troca);
				bolachas.add(novaBolacha);
			}
			System.out.println(bolachas);
			break;
		case 4:
			System.out.println("Essas são as bolachas no estoque: ");
			System.out.println(bolachas);
			break;
		}
		}while(opcao != 0);
		{
			System.out.println("Estoque fechado");
		}
	}
}
