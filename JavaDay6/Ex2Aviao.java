package JavaDay6;

public class Ex2Aviao {
	String capacidadeTotal;
	String companhiaAviao;
	String destinoFinal;
	
	public Ex2Aviao(String pessoas, String companhia, String destino)
	{
		capacidadeTotal = pessoas;
		companhiaAviao = companhia;
		destinoFinal = destino;
	}
	public String getFichaAviao() 
	{
		String fichaAviao = "A capacidade total de pessoas é de " + capacidadeTotal + " no avião da " + companhiaAviao + " com destino à " + destinoFinal;
		return fichaAviao;
	}
	
}

