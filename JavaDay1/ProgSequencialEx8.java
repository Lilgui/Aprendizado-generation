package JavaDay1;

import java.util.Scanner;

public class ProgSequencialEx8 {
	public static void main(String arg[])
	{
		Scanner ler = new Scanner(System.in);
		double carConsu, carFabrica, distribuidor, impostos;
		
		System.out.println("Insira o custo de f�brica do carro: ");
		carFabrica = ler.nextDouble();
		
		distribuidor = (carFabrica*28)/100;
		impostos = (carFabrica*45)/100;
		carConsu = carFabrica + distribuidor + impostos;
		
		System.out.println("O valor total � pagar pelo carro �: " + carConsu);
	}
}
