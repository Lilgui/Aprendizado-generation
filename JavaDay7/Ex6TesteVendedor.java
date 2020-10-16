package JavaDay7;

public class Ex6TesteVendedor {
	public static void main(String args[])
	{
		Ex6Vendedor japson = new Ex6Vendedor("Ele mesmo","Rua dos cansados", "912344321", "traveseiros",6000, 1200);
		System.out.println(japson.getValorVendas());
		System.out.println(japson.getComissao());
		japson.imprimirTudo();
	}
	
}
