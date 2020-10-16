package JavaDay8;

public class Ex1Cavalo extends Ex1Animal {
	public String getNome()
	{
		return "O Cavalo " + super.getNome() + " tem " + super.getIdade() + " de idade e " + super.getSom() + " quando " + super.getMovimentacao();
	}
	
}
