package JavaDay7;

public class Ex3TesteEmpregado {
	public static void main(String args[])
	{
		Ex3Empregado japa = new Ex3Empregado("Gui","Av. Não sei", "980705501",3000, 2500, 980, 5000,20);
		japa.imprimirInfo();
		japa.calcularSalario();
	}
}
