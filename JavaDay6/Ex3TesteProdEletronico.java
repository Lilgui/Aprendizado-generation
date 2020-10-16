package JavaDay6;

public class Ex3TesteProdEletronico {
	public static void main(String args[])
	{
		Ex3ProdutoEletronico processador = new Ex3ProdutoEletronico("Ryzen 5", "AMD","processador","terceira geração",1500.0);
		System.out.println(processador.getInfoTotal());
	}
}
