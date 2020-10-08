package JavaDay1;


import java.util.Scanner;

public class ProgSequencialEx2 {
	public static void main(String arg[]) 
	{
	
		Scanner ler = new Scanner(System.in);
		int horas,minutos,tempo,segundos;
		System.out.println("Coloque a duração total em segundos: ");
		tempo = ler.nextInt();
		
		horas = tempo/3600;
		minutos = horas%tempo;
		segundos =(horas%tempo)%minutos;
		
		System.out.printf("\n" + horas + " horas");
		System.out.printf("\n" + minutos + " minutos");
		System.out.printf("\n" + segundos + " segundos");
	}
}
