package JavaDay7;

public class Ex2TesteFornecedor {
	public static void main(String args[])
	{
		Ex2Fornecedor eumesmo = new Ex2Fornecedor("Gui", "Av. Generation,123", "908070605", 1000,500);
		Ex2Fornecedor japa = new Ex2Fornecedor("Doido", "Av. Sem criatividade", "0800 777 7000", 500, 1000);
		Ex2Fornecedor jp = new Ex2Fornecedor("Crazy", "Rua Logo Ali", "Sem número", 2000, 5000);
		System.out.println(eumesmo.getTudoJunto());
		System.out.println(japa.getValorDivida());
		System.out.println(jp.getObterSaldo()); 
	}
}
