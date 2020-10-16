package JavaDay7;

public class Ex1Pessoa {
	protected String nome;
	protected String endereço;
	protected String telefone;
	
	public Ex1Pessoa(String nome, String endereço, String telefone)
	{
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}
	
	public String getInfoNome()
	{
		String infoNome = nome + "(o tal do Japa) da " + endereço;
		return infoNome;
	}
	public String getTudoJunto()
	{
		String tudoJunto = nome + " que mora na " + endereço + " com o número de telefone: " + telefone;
		return tudoJunto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
