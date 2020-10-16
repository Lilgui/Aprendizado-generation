package JavaDay6;

public class Ex3ProdutoEletronico {
	private String nome;
	private String marca;
	private String categoria;
	private String geracao;
	private double preco;
	
	public Ex3ProdutoEletronico(String nome, String marca, String categoria, String geracao,double preco)
	{
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.geracao = geracao;
		this.preco = preco;
	}
	public String getInfoTotal()
	{
		String infoTotal = "O " + nome + " da " + marca + " de " + geracao + ", que custa: " + preco;
		return infoTotal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getGeracao() {
		return geracao;
	}
	public void setGeracao(String geracao) {
		this.geracao = geracao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
