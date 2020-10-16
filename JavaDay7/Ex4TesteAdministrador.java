package JavaDay7;

public class Ex4TesteAdministrador {
	public static void main(String args[]) 
	{
		Ex4Administrador japa = new Ex4Administrador("Gui", "Av.X", "0800 1000", "Alemanha",9,6000);
		japa.infoGeral();
		System.out.println(japa.getEstadia());
		System.out.println(japa.getCusto());
	}
}
