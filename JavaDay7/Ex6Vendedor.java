package JavaDay7;

public class Ex6Vendedor extends Ex1Pessoa{
	private String artigos;
	private double valorVendas;
	private double comissao;

	public Ex6Vendedor(String nome, String endereço, String telefone, String artigos, double valorVendas, double comissao)
	{
		super(nome,endereço,telefone);
		this.artigos = artigos;
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public void imprimirTudo()
	{
		System.out.println(nome + " que mora na " + endereço + " com o número de telefone: " + telefone + " tem uma loja de " + artigos + " teve um valor de vendas de: " + valorVendas + ", com uma comissão de R$" + comissao);
	}

	public String getArtigos() {
		return artigos;
	}

	public void setArtigos(String artigos) {
		this.artigos = artigos;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
