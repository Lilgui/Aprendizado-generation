package JavaDay7;

public class Ex3Empregado extends Ex1Pessoa {
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Ex3Empregado (String nome, String endereço, String telefone, double valorCredito, double valorDivida,int codigoSetor,float salarioBase, float imposto)
	{
		super(nome,endereço,telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;	
	}
	public void imprimirInfo()
	{
		System.out.println("Nome do empregado: " + nome +"\n" + "endereço: " + endereço + "\n" + " telefone:" + telefone + "\n" + " Código do setor: " + codigoSetor + "\n" + " Salario Base: " + salarioBase + "\n" + " e o valor do imposto em porcentagem é de " + imposto + "%");
	}
	
	public void calcularSalario()
	{
		double salarioTotal = salarioBase - (salarioBase*(imposto/100));
		System.out.println("O salário total a ser recebido pelo empregado: " + getNome() + " é igual a: "+ salarioTotal);
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
}