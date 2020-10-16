package JavaDay6;

public class Ex1Cliente {
	String idadeCliente;
	String generoCliente;
	String nomeCliente;
	
	public Ex1Cliente(String idade,String genero,String nome)
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
	
}

