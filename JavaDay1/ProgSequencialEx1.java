package JavaDay1;


import java.util.Scanner;

public class ProgSequencialEx1 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos,meses,dias, totalDias=0;
		System.out.println("Digite quantos anos voc� t�m: ");
		anos = ler.nextInt();
		System.out.println("Digite quantos meses se passaram de seu anivers�rio: ");
		meses= ler.nextInt();
		System.out.println("Digite quantos dias se passaram, do dia do seu anivers�rio(Como se tivesse sido m�s passado): ");
		dias = ler.nextInt();
		totalDias = totalDias + (anos*365);
		totalDias = totalDias + (meses*30);
		totalDias = totalDias + dias;
		
		System.out.println(totalDias);
						
	}
	
}
