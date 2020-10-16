package JavaDay8;

public class Ex1Preguiça extends Ex1Animal{
	public String getNome()
	{
		return "O bicho-Preguiça " + super.getNome() + " tem " + super.getIdade() + " de idade e " + super.getSom() + " quando " + super.getMovimentacao();
	}
}
