package JavaDay1;


import java.util.Scanner;

public class ProgSequencialEx7 {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Entre com o valor de a: ");
		a = ler.nextDouble();
		System.out.println("Entre com o valor de b: ");
		b = ler.nextDouble();
		System.out.println("Entre com o valor de c: ");
		c = ler.nextDouble();
		System.out.println("Entre com o valor de d: ");
		d = ler.nextDouble();
		System.out.println("Entre com o valor de e: ");
		e = ler.nextDouble();
		System.out.println("Entre com o valor de f: ");
		f = ler.nextDouble();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("O resultado de x é: " + x);
		System.out.printf("O resultado de y é: " + y);
		
	}
}
