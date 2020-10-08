package JavaDay1;


import java.util.Scanner;

public class ProgSequencialEx3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int horas,minutos,segundos,duracao=0;
		System.out.println("Informe a Duração do evento em segundos: ");
		duracao = ler.nextInt();
		horas = duracao/3600;
		minutos = (duracao%3600)/60;
		segundos = (duracao%3600)%60;
		
		System.out.println(horas);
		System.out.println(minutos);
		System.out.println(segundos);
	}
}
