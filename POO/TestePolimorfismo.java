package POO;

public class TestePolimorfismo {
	public static void main(String args[])
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("JJponês");
		fisica.setCpf(12345678902L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("Pablo");
		juridica.setCnpj(100100100109090L);
		
		Pessoa2[] pessoas = new Pessoa2[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa2 pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
	}
}
