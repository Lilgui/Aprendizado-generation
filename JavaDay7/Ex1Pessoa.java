package JavaDay7;

public class Ex1Pessoa {
	protected String nome;
	protected String endere�o;
	protected String telefone;
	
	public Ex1Pessoa(String nome, String endere�o, String telefone)
	{
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	
	public String getInfoNome()
	{
		String infoNome = nome + "(o tal do Japa) da " + endere�o;
		return infoNome;
	}
	public String getTudoJunto()
	{
		String tudoJunto = nome + " que mora na " + endere�o + " com o n�mero de telefone: " + telefone;
		return tudoJunto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
