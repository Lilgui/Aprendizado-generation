package POO;

public class TestePessoa1 {
	public static void main(String args[])
	{
		Pessoa1 japa = new Pessoa1("Japa", 123);
		Funcionario1 japinha = new Funcionario1("Japinha", 321,"TI");
		Pessoa1 japson = new Funcionario1("Japson", 555,"Inform�tica-Desenvolvimento");
		Pessoa1 theJaps = new Coordenador("TheJaps", 999, "Ci�ncia da Computa��o");
		System.out.println(japa.getMatricula());
		System.out.println(japinha.getDepartamento());
		System.out.println(japson.getMatricula());
		System.out.println(theJaps.getNome());
	}
}
