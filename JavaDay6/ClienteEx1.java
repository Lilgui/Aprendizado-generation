package JavaDay6;

public class ClienteEx1 {
	String idadeCliente;
	String generoCliente;
	String nomeCliente;
	
	public ClienteEx1(String idade,String genero,String nome)
	{
		idadeCliente = idade;
		generoCliente = genero;
		nomeCliente = nome;		
	}
	public String getDadosCliente()
	{
		String dadosCliente = nomeCliente + " é do gênero " + generoCliente + " e tem " + idadeCliente + " de idade";
		return dadosCliente;
	}
	public static void main(String args[])
	{
		ClienteEx1 cliente1 = new ClienteEx1("20", "masculino", "Gui");
		System.out.println(cliente1.getDadosCliente());				
	}
}

