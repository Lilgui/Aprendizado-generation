package JavaDay1;


import java.util.Scanner;

public class ProgSequencialEx5 {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		nota3 = ler.nextDouble();
		
		media =((nota1*2) + (nota2*3) + (nota3*5))/10;
		
		System.out.println("A média final foi: " + media);		
	}

}
