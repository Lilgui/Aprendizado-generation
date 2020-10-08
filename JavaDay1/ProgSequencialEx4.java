package JavaDay1;


import java.util.Scanner;

public class ProgSequencialEx4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,r,s;
		System.out.println("Digite o valor de a: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = ler.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = ler.nextDouble();
		
		r = ((a*a) + (b*b));
		s = ((b*b) + (c*c));
		d = (r+s)/2;
		
		System.out.println(r);
		System.out.println(s);
		System.out.println(d);
	}
}
