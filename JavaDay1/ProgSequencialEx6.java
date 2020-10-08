package JavaDay1;


import java.util.Scanner;
import java.lang.*;

public class ProgSequencialEx6 {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		double d,x1,x2,y1,y2;
		
		System.out.println("Entre com o valor de x1: ");
		x1 = ler.nextDouble();
		System.out.println("Entre com o valor de x2: ");
		x2 = ler.nextDouble();
		System.out.println("Entre com o valor de y1: ");
		y1 = ler.nextDouble();
		System.out.println("Entre com o valor de y2: ");
		y2 = ler.nextDouble();
		
		d= Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
		
		
		System.out.println("O resultado de d é: " + d);
	}
}
