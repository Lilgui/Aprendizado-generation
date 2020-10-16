package JavaDay7;

public class Ex5TesteOperario {
	public static void main(String args[])
	{
		Ex5Operario japa = new Ex5Operario("Gui","Av.Sono","55565656","teclado",8000,30);
		System.out.println(japa.getValorComissao());
		japa.imprimirInfos();		
	}
}
