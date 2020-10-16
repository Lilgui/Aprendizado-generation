package JavaDay8;

public class Ex1Cachorro extends Ex1Animal{
	public String getNome()
	{
		return "Cachorro " + super.getNome() + " tem " + super.getIdade() + " de idade e " + super.getSom() + " quando " + super.getMovimentacao();
	} 
}
