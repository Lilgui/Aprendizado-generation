package JavaDay8;

public class Ex1Pregui�a extends Ex1Animal{
	public String getNome()
	{
		return "O bicho-Pregui�a " + super.getNome() + " tem " + super.getIdade() + " de idade e " + super.getSom() + " quando " + super.getMovimentacao();
	}
}
