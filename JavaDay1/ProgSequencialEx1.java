package JavaDay1;


import java.util.Scanner;

public class ProgSequencialEx1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias, totalDias=0;
		System.out.println("Digite quantos anos você têm: ");
		anos = ler.nextInt();
		System.out.println("Digite quantos meses se passaram de seu aniversário: ");
		meses= ler.nextInt();
		System.out.println("Digite quantos dias se passaram, do dia do seu aniversário(Como se tivesse sido mês passado): ");
		dias = ler.nextInt();
		totalDias = totalDias + (anos*365);
		totalDias = totalDias + (meses*30);
		totalDias = totalDias + dias;
		
		System.out.println(totalDias);
						
	}
	
}
