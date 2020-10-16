package JavaDay7;

public class Ex5Operario extends Ex1Pessoa{
	private String artigos;
	private double valorProducao;
	private double comissao;
	
	public Ex5Operario(String nome, String endereço, String telefone, String artigos, double valorProducao, double comissao)
	{
		super(nome,endereço,telefone);
		this.artigos = artigos;
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public void imprimirInfos()
	{
		System.out.println(nome + " que mora na " + endereço + " com o número de telefone: " + telefone + ", que produz " + artigos + " com valor de produção de: " + valorProducao + " e recebe de comissao: " + comissao);
	}
	
	public double getValorComissao()
	{
		double valorComissao =valorProducao%comissao;
		return valorComissao;
	}

	public String getArtigos() {
		return artigos;
	}

	public void setArtigos(String artigos) {
		this.artigos = artigos;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
		
}
