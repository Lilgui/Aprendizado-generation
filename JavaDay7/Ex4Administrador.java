package JavaDay7;

public class Ex4Administrador extends Ex1Pessoa{
	private  String viagem;
	private int estadia;
	private double custo;
	
	public Ex4Administrador(String nome, String endereço, String telefone, String viagem, int estadia, double custo)
	{
		super(nome,endereço,telefone);
		this.viagem = viagem;
		this.estadia = estadia;
		this.custo = custo;
	}

	public void infoGeral() {
		System.out.println("O administrador " + nome + " que mora na " + endereço + " com o número de telefone: " + telefone + ", foi para uma viagem em " 
	+ viagem + " acabou ficando " + estadia + " dias e custou: " + custo); 
	}
	
	public String getViagem() {
		return viagem;
	}

	public void setViagem(String viagem) {
		this.viagem = viagem;
	}

	public double getEstadia() {
		return estadia;
	}

	public void setEstadia(int estadia) {
		this.estadia = estadia;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
}
