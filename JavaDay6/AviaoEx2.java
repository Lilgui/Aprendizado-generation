package JavaDay6;

public class AviaoEx2 {
	String capacidadeTotal;
	String companhiaAviao;
	String destinoFinal;
	
	public AviaoEx2(String pessoas, String companhia, String destino)
	{
		capacidadeTotal = pessoas;
		companhiaAviao = companhia;
		destinoFinal = destino;
	}
	public String getFichaAviao() 
	{
		String fichaAviao = "A capacidade total de pessoas � de " + capacidadeTotal + " no avi�o da " + companhiaAviao + " com destino � " + destinoFinal;
		return fichaAviao;
	}
	public static void main (String args[])
	{
		AviaoEx2 aviao1 = new AviaoEx2("80", "AirFrance", "Fran�a");
		System.out.println(aviao1.getFichaAviao());
	}
}

