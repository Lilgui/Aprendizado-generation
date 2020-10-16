package JavaDay7;

public class Ex2Fornecedor extends Ex1Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Ex2Fornecedor(String nome, String endere�o, String telefone, double valorCredito, double valorDivida)
	{
		super(nome,endere�o,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	public  double getObterSaldo()
	{
		double obterSaldo = valorCredito - valorDivida;
		return obterSaldo;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}
